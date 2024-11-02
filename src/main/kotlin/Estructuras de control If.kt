fun main(args: Array<String>) {
    //If
    val nombre = "Maria"
    //Modo conceptual
    if (nombre.isNotEmpty()){
        println("El largo de nuestra variable nombre es ${nombre.length}")
    }else{
        println("Error, la variable está vacía")
    }
    //El código en una sola línea
    if (nombre.isNotEmpty()) println("El largo de nuestra variable nombre es ${nombre.length}") else println("Error, la variable está vacía")

    //Mensaje
    var mensaje : String
    if (nombre.length > 4){
        mensaje = "Tu nombre es largo"
    }else{
        mensaje = "Tu tienes un nombre corto"
    }
    println(mensaje)

    //Nueva asignacion
    var mensajeNuevaAsignacion : String
    mensajeNuevaAsignacion = if (nombre.length > 4){
        "Tu nombre es largo"
    }else{
        "Tu tienes un nombre corto"
    }
    println(mensajeNuevaAsignacion)


    //Nueva declaración
    var mensajeNuevaDeclaración : String = if (nombre.length > 4){
        "Tu nombre es largo"
    }else{
        "Tu tienes un nombre corto"
    }
    println(mensajeNuevaDeclaración)


    //Nueva variable inmutable
    val mensajeNuevaVariableInmutable : String = if (nombre.length > 4){
        "Tu nombre es largo"
    }else{
        "Tu tienes un nombre corto"
    }
    println(mensajeNuevaVariableInmutable)

}