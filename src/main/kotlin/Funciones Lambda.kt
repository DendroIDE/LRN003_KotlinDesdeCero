fun main(args: Array<String>){
    val myLambda : (String) -> Int = {
        valor -> valor.length
    }
    val lambdaEjecutada = myLambda("Hola Dennis")
    println(lambdaEjecutada)

    val saludos = listOf("Hello", "Hola", "Chao")
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos)
}
