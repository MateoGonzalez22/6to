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