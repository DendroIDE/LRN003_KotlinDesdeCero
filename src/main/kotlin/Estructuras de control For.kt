fun main(args: Array<String>) {
    //For es un ciclo -> Ejecuta un código para cada elemento de la lista definida
    val listaDeFrutas = listOf("Manzana","Pera","Frambuesa","Durazno")
    //EXPLICACION AL CICLO -> Por cada fruta dentro de la listaDeFrutas ejecutar el mensaje que muestra la fruta
    for (fruta in listaDeFrutas){
        println("Hoy vioy a comerme una fruta llamada $fruta")
    }
    //Código en una sola línea - Sintaxis comprimida
    for (fruta in listaDeFrutas) println("Hoy vioy a comerme una fruta llamada $fruta")
}