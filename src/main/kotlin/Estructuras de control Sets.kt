fun main(args: Array<String>) {
    //Set INMUTABLE
    val vocalesRepetidas = setOf("a","e","i","o","a","e","i","o","u")
    println(vocalesRepetidas)

    //Set MUTABLE
    val numerosFavoritos = mutableSetOf(1,2,3,4,5,6)
    println(numerosFavoritos)
    numerosFavoritos.add(3)
    println(numerosFavoritos)
    numerosFavoritos.add(4)
    println(numerosFavoritos)
    numerosFavoritos.add(7)
    numerosFavoritos.add(7)
    println(numerosFavoritos)
    //Eliminar elementos de los SETS
    numerosFavoritos.remove(7)
    println(numerosFavoritos)
    //Para obtener los valores se utiliza la funcion first()
    val valorDelSet = numerosFavoritos.first{ numero -> numero > 2}
    println(valorDelSet)
    //Para obtener los valores en caso de no estar seguro que sea nulo se utiliza la funcion firstOrNull()
    val valorDelSetSinError = numerosFavoritos.firstOrNull(){ numero -> numero > 6}
    println(valorDelSetSinError)

}