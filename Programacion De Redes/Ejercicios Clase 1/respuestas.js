
//  a- No se pueden correr: [1, 4]

//  b-

//Correcion 1
let variable1 = 'Carlos';
variable1 = 'Mara';

function print(txt) {
    console.log(txt)
}

print(variable1);


// Correccion 4
let variable1 = 'Carlos';
function print(txt) {
    variable1 = 'Mara'
    console.log(txt)
}
print(variable1);


//  c- "Carlos"


//  2) return arr of key, value

function getEntries(objeto){

    console.log(Object.entries(objeto));
    return Object.entries(objeto);
    
}


//  3) Sum()


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


// 4) miConvertidor

var miConvertidor = function (farenheit){return (5/9) * (farenheit - 32)}
tempCelcius = miConvertidor(70)


//  5) a- Retorna Hola Mundo porque nunca se llama a la función

//  6)

semana("Martes")

function semana(string){
    
    var dia = null

    switch (string) {
        case "Domingo": 
            dia = 0
            break;
        
        case "Lunes":
            dia = 1
            break;

        case "Martes":
            dia = 2
            break;

        case "Miercoles":
            dia = 3
            break;

        case "Jueves":
            dia = 4
            break;

        case "Viernes":
            dia = 5
            break;
        
        case "Sabado":
            dia = 6
            break;
        
        default:
            console.log("Ingrese un dia correctamente!");
    }
    console.log(dia)
    return dia
    
}


//  7) Si, es mutado

var personas =[ 
    {nombre:"Mateo", apellido: "Gonzalez"},
    {nombre:"Sebastian", apellido: "Villa"},
    {nombre:"Roberto", apellido: "Ramirez"}
]

agregarAJose(personas)

function agregarAJose(arr = []){
    
    obj = {nombre: "Jose", apellido: "Martinez"}

    arr.push(obj)
}


//  8)

arr = [0,1,2,3,4,5,6]

dias = []
var dia

arr.forEach(i => {
    switch (i) {
        case 0:
            dia = "Domingo"
            break
        case 1:
            dia = "Lunes"
            break
        case 2:
            dia = "Martes"
            break
        case 3:
            dia = "Miercoles"
            break
        case 4:
            dia = "Jueves"
            break
        case 5:
            dia = "Viernes"
            break
        case 6:
            dia = "Sábado"
            break
        default:
            dia = null
            break;
    }

    if (dia == null){
        return
    } else{
        dias.push(dia)
    }
    
});

console.log(dias)



// 10)

arr1 = [3,4,5,6]
arr2 = [4,2,7,6,5,5]

function sum(...args){
    var total = 0
    args.forEach(element => {
        element.forEach(i => {  
            total = total + i
        });
    });
    return total
}

console.log(sum(arr1, arr2))

