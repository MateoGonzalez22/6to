miFuncion(5, 4.424);

function miFuncion(num1, num2){

    if ( isNumeric(num1) && isNumeric(num2) ){
        console.log(num1+num2)
        return num1 + num2

    }else{
        console.log("Debe ingresar dos numeros!")
    }

}


function isNumeric(num) {

    if ( Object.prototype.toString.call(num) !== "[object String]" && !isNaN(num - parseFloat(num)) ){
        return true
    }else{
        return false
    }
}
