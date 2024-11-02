fun main(args: Array<String>) {
    //forEach es un ciclo -> Ejecuta un código n cantidad de veces mientras exista elementos en la lista similar al for
    val listaDeFrutas = listOf("Manzana","Pera","Frambuesa","Durazno")
    listaDeFrutas.forEach { fruta -> println("Hoy voy a comerme una fruta nueva se llama $fruta") }
}