fun main(args: Array<String>) {
    //Else If
    val nombre = "Maria"

    //Mensaje
    val mensaje : String = if (nombre.length > 4){
        "Tu nombre es largo"
    }else if (nombre.isEmpty()){
        "Nombre está vacío"
    }else{
        "Tu tienes un nombre corto"
    }
    println(mensaje)

}