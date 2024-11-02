fun main(args: Array<String>) {
    val numerosDeLoteria = listOf(11,22,43,56,78,66,35,5)

    //La funcion sorted es una función de extención y permite ordenar la lista de manera ascendente
    val numeroSorted = numerosDeLoteria.sorted()
    println(numeroSorted)

    //La funcion sortedDescending es una función de extención y permite ordenar la lista de manera descendente
    val numerosDeLoteriaDescendientes = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendientes)

    //La funcion sortedBy es una función de extención y permite ordenar la lista dependiendo la condición que se establezca dentro de las llaves
    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    //La funcion shuffled ordena la lista de manera aleatoria
    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    //La funcion reversed ordena la lista de manera reversiva a la definida principalmente
    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    //La funcion Map permite convertir un elemento de un tipo a otro tipo
    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu numero de loteria es $numero" }
    println(mensajesDeNumeros)

    //La dunción filter permite filtrar numeros de la lista dependiendo la condicion establecida
    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero>50 }
    println(numerosFiltrados)
}