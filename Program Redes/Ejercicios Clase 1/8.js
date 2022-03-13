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
