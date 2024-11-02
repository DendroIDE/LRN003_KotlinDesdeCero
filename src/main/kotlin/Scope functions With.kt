//La funcion With nos permite acceder directamente a las propiedades de una variable que le
// pasamos como parametro de esta forma podemos evitar repetir llamar a la variable en varias
// lineas sino que utilizamos this y asi utilizamos directamente sus propiedades
fun main(args: Array<String>){
    val colores = listOf("Azul", "Amarillo", "Rojo")
    with(colores){
        println("Nuestros colores son: $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }
}