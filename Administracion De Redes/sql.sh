#!/bin/bash


# ELIMINAR PROCESO MYSQL (FUE MEJORADO POR FRENAR EL SERVICIO CON SYSTEMCTL)
# deleteProcess(){

# 	PORTS=$(sudo netstat -lgtp)

# 	declare -i index=0

# 	for i in $PORTS
# 	do

# 		if [ $i == "localhost:mysql" ] 
# 		then
# 			declare -i index_of_process=$(expr $index + 3)
# 		fi

# 		if [ "$index" == "$index_of_process" ]
# 		then
# 			sudo kill ${i:0:-7}
# 			echo "Proceso de MYSQL eliminado!"
# 		fi

# 		index+=1

# 	done
# }

stopMySql(){

	sudo systemctl stop mysql

}

deleteContainer(){

	OUTPUT=$(docker run --name mysql -d -e MYSQL_ROOT_PASSWORD=secret -p 3306:3306 mysql 2>&1)

	

	declare -i index=0

	for x in $OUTPUT
	do	
		
		if [ $index == 16 ]; then
			
			#echo ${x:1:-2}
			docker rm -f ${x:1:-2}
					
		fi

		index+=1
	done
}


checkResponse(){

	OUTPUT=$(docker run --name mysql -d -e MYSQL_ROOT_PASSWORD=secret -p 3306:3306 mysql 2>&1)
	already_in_use="docker: Error response from daemon: Conflict. The container name"
	port_being_used="Error response from daemon: driver failed programming external connectivity on endpoint"

	len=${#OUTPUT}

	if [[ $OUTPUT =~ .*$already_in_use.* ]]; then
		
		return 1
		
	elif [[ $OUTPUT =~ .*$port_being_used.* ]]; then
		
		return 2
		
	elif [ "$len" == "64" ]; then
		echo -e "\nMysql Corriendo en el contenedor ${OUTPUT}"
		return 200
	else
		echo $OUTPUT
		return 404
	fi

}



run(){

	declare -i i=0

	while [ $i == 0 ]
	do

		checkResponse
		response=$?

		if [[ $response == 1 ]]; then
			echo -e "\nEliminando contenedor antiguo..."
			deleteContainer
		elif [[ $response == 2 ]]; then
			echo -e "\nFrenando servicio MySQL..."
			stopMySql
		elif [[ $response == 200 ]]; then
			i=1
		elif [[ $response == 404 ]]; then
			echo -e "\nError desconocido!"
		fi

	done

	
		

}	

run







