fun main(args: Array<String>) {
    //Filter es una funcion anonima -> Permite filtrar los elementos que cumplan con una condición
    val listaDeFrutas = listOf("Manzana","Pera","Frambuesa","Durazno")
    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFruta)
    val listaFiltrada = caracteresDeFruta.filter { largoCaracteresDeFruta -> largoCaracteresDeFruta > 5 }
    println(listaFiltrada)
}