// La funcion Also nos permite obtener una variable, luego ejecutar un código con esa variable
// y luego devolverla como parámetro para que pueda seguir siendo utilizada por una función más adelante
fun main(args: Array<String>){
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4A", "Huawei Redmi 9", "Xiamoi MI A3")
        .also {
            //Also permite devolver it a diferencia de las otras scope functions que devuelven this
            lista -> println("El valor original de la lista es: $lista")
        }
        .asReversed()
    println(moviles)
}