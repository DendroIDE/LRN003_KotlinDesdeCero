fun main(args: Array<String>) {
    //map es una funcion anonima -> Evita la creacion de ciclos for para la conversion de listas de un tipo a otro por ejemplo una lista de strings a una lista de enteros
    val listaDeFrutas = listOf("Manzana","Pera","Frambuesa","Durazno")
    val caracteresDeFruta = listaDeFrutas.map { fruta -> fruta.length }
    val caracteresDeFrutaLista: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)
    println(caracteresDeFrutaLista)
}