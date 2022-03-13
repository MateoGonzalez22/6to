const mostrarNombreConPrefijo = (prefijo) => (nombre) =>
{
    console.log(prefijo, nombre)
}

function mostrarNombreConPrefijof (prefijo)
{
    return function(nombre){
        console.log(prefijo, nombre)
    }
}

const mostrarNombre = mostrarNombreConPrefijo("prefijo")
mostrarNombre("Matias")
mostrarNombreConPrefijo("Prefijo libre")
mostrarNombreConPrefijof("Prefijo libre con function")("Matias")



