fun main(args: Array<String>) {
    //When -> En traduccion se ejecuta un código cuando se genera cierta condición
    var nombreColor = "Amarillo"

    //Sintaxis normal
    when(nombreColor){
        "Amarillo" -> println("El amarillo es el color de la alegría")
        "Rojo" -> println("El rojo simboliza el calor")
    }
    //Sintaxis con LLaves
    nombreColor = "Rojo"
    when(nombreColor){
        "Amarillo" -> {
            println("El amarillo es el color de la alegría")
        }
        "Rojo" -> println("El rojo simboliza el calor")
    }
    //Sintaxis normal con else
    nombreColor = "Verde"
    when(nombreColor){
        "Amarillo" -> println("El amarillo es el color de la alegría")
        "Rojo" -> println("El rojo simboliza el calor")
        else -> println("Error. No tengo información del valor")
    }
    //Sintaxis normal con rersultado a varias condiciones
    nombreColor = "Carmesi"
    when(nombreColor){
        "Amarillo" -> println("El amarillo es el color de la alegría")
        "Rojo", "Carmesi" -> println("El rojo simboliza el calor")
        else -> println("Error. No tengo información del valor")
    }

    //When con enteros
    val code = 200
    when(code){
        in 200..299 -> println("Todo a ido bien") // In determina un rango
        in 400..500 -> println("Algo ha fallado")
        else -> println("Código desconocido algo ha fallado")
    }

    //When con condiciones enteras
    val tallaDeZapatos = 41
    val mensaje = when(tallaDeZapatos){
        41,43 -> "Tenemos disponible"
        42,44 -> "Casi no nos quedan"
        45 -> "No se encuentra disponible"
        else -> "Estos zapatos solo vienen en tallas 41,42,43,44,45"
    }
    println(mensaje)


}