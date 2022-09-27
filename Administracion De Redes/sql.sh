#!/bin/bash

deleteProcess(){

	PORTS=$(sudo netstat -lgtp)

	declare -i index=0

	for i in $PORTS
	do

		if [ $i == "localhost:mysql" ] 
		then
			declare -i index_of_process=$(expr $index + 3)
		fi

		if [ "$index" == "$index_of_process" ]
		then
			sudo kill ${i:0:-7}
			echo "Proceso de MYSQL eliminado!"
		fi

		index+=1

	done
}

deleteContainer(){

	OUTPUT=$(docker run --name mysql -d -e MYSQL_ROOT_PASSWORD=secret -p 3306:3306 mysql 2>&1)

	declare -i index=0

	for i in $OUTPUT
	do	
		if [ $index == 16 ]
		then
			#echo ${i:1:-2}
			docker rm -f ${i:1:-2}
			echo "Volve a ejecutar el script para correr MYSQL"			
		fi

		index+=1
	done
}



OUTPUT=$(docker run --name mysql -d -e MYSQL_ROOT_PASSWORD=secret -p 3306:3306 mysql 2>&1)
substring="docker: Error response from daemon: Conflict."

x=""


case $OUTPUT in

  *"docker: Error response from daemon: Conflict."*)
	echo "Eliminando contenedor..."
	x="container"
    ;;
esac




if [ "$x" == "container" ]
then
	deleteContainer
else
	len=${#OUTPUT}

	if [ "$len" == "64" ]
	then
		echo "Mysql Corriendo en el contenedor ${OUTPUT}"
	else
		echo "Error desconocido"
	fi
	
fi












