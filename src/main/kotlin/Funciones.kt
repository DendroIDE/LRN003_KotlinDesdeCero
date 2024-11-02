fun main(args: Array<String>){
    println("Funciones")
    val resultadoFuncionRandomCase1 = randomCase1("Funciones Kotlin 1")
    println(resultadoFuncionRandomCase1)
    val resultadoFuncionRandomCase2 = randomCase2("Funciones Kotlin 2")
    println(resultadoFuncionRandomCase2)
    //Funcion Unit
    println("Funciones Unit")
    imprimirFrase1(resultadoFuncionRandomCase1)
    imprimirFrase1(resultadoFuncionRandomCase2)
    //Funciones Combinadas
    println("Funciones Combinadas")
    imprimirFrase1(randomCase1(resultadoFuncionRandomCase1))
    imprimirFrase1(randomCase2(resultadoFuncionRandomCase2))
    //Funciones de Extensión
    /* Las funciones de extensión permiten extender el comportamiento del tipo que se tiene por ejemplo String y
    que se utilicen como si fuesen comportamientos del nuevo tipo*/
    println("Funciones de Extensión")
    val resultadoFuncionRandomCase3 = randomCase1("Funciones Kotlin 1").randomCase3()
    println(resultadoFuncionRandomCase3)
}

//Funcion que devuelve una cadena dependiento un valor
fun randomCase1(frase : String) : String{
    val numeroAleatorio = 0 .. 99 //Rango entre 0 y 99
    val resultadoAleatorio =numeroAleatorio.random()
    //Dependiendo el resultado se divide entre 2 y si el residuo de la division es 0 entonce la frase va en Mayuscula sino minuscula
    if (resultadoAleatorio.rem(2) == 0){
        return frase.toUpperCase()
    }else{
        return frase.toLowerCase()
    }
}

//Funcion que devuelve una cadena dependiento un valor
fun randomCase2(frase : String) : String{
    val numeroAleatorio = 0 .. 99 //Rango entre 0 y 99
    val resultadoAleatorio =numeroAleatorio.random()
    //Dependiendo el resultado se divide entre 2 y si el residuo de la division es 0 entonces la frase va en Mayuscula sino minuscula
    return if (resultadoAleatorio.rem(2) == 0){
        frase.toUpperCase()
    }else{
        frase.toLowerCase()
    }
}

//Funciones Unit
fun imprimirFrase1(frase: String) : Unit{
    println("Tu frase es: $frase")
}

//Funciones de extension
fun String.randomCase3() : String{
    val numeroAleatorio = 0 .. 99 //Rango entre 0 y 99
    val resultadoAleatorio =numeroAleatorio.random()
    //Dependiendo el resultado se divide entre 2 y si el residuo de la division es 0 entonces la frase va en Mayuscula sino minuscula
    return if (resultadoAleatorio.rem(2) == 0){
        this.toUpperCase()
    }else{
        this.toLowerCase()
    }
}