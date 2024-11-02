fun main(args: Array<String>){
    //Sintaxis 2
    val largoDelValorInicial1 = superFuncion(valorIniciail = "Hola", block = {
        valor -> valor.length
    })
    println(largoDelValorInicial1)
    //Sintaxis 2
    val largoDelValorInicial2 = superFuncion(valorIniciail = "Hola") { valor ->
        valor.length
    }
    println(largoDelValorInicial2)

    //Obtener una función de una función
    val lambda: () -> String = funcionInception("Dennis")
    val valorLambda : String = lambda()
    println(valorLambda)
}

//La variable block es una sintaxis recomendada por kotlin para nombrar las lambdas,
// se puede llamar al block para ejecutar un código o se la puede llamar event o listener cuando
// se va a realizar una accion o un evento
fun superFuncion(valorIniciail : String, block : (String) -> Int) : Int{
    return block(valorIniciail)
}

fun funcionInception(nombre : String) : () -> String{
    return {
        "Hola desde la lambda $nombre"
    }
}