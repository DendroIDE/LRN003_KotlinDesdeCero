// La funcion Apply permite realizar operaciones sobre una variable y luego devolver el valor.
// Si se combina con una función de safe cast crea una función apply segura esto a causa de que
// la variable nullable que se tenia no puede ejecutar ese cambio de propiedades al menos de que
// ya le haya asignado un valor lo cual nos permite evitar los null pointer exceptions.
fun main(args: Array<String>){
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4A", "Huawei Redmi 9", "Xiamoi MI A3")
        .apply {
            removeIf { movil -> movil.contains("Google") }
        }
    println(moviles)
    //Apply 1
    val colores1 : MutableList<String>? = null //Las listas pueden ser nulas completas o pueden tener elementos nulos dentro
    colores1?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es: $size")
    }
    //Apply 2
    val colores2 : MutableList<String>? = mutableListOf("Amarillo", "Azul", "Rojo")
    colores2?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es: $size")
    }

}