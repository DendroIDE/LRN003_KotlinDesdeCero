//La funcion Let permite combinado con el operador de safe calls ejecutar un código solo cuando
// una variable nullable no es nula y asi evita tener un null pointer exception
fun main(args: Array<String>){
    var nombre : String? = null
    nombre?.let {
        valor -> println("El nombre no es null, es $valor")
    }
    nombre = "Dennis"
    nombre?.let {
            valor -> println("El nombre no es null, es $valor")
    }
}