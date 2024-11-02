//La funcion Run ejecuta una serie de operaciones luego de declarar una variable
fun main(args: Array<String>){
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4A", "Huawei Redmi 9", "Xiamoi MI A3")
        .run {
            removeIf{ movil -> movil.contains("Google") }
            this
        }
    println(moviles)
}