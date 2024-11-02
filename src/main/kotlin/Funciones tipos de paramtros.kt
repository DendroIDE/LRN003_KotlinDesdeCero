fun main(args: Array<String>){
    imprimirNombre1("Dennis", "Muñoz")
    imprimirNombre1(nombre = "Dennis", apellido = "Muñoz")
    imprimirNombre2(nombre = "Dennis", segundoNombre = "Leandro", apellido = "Muñoz")
    imprimirNombre3(nombre = "Dennis", apellido = "Muñoz")
}

fun imprimirNombre1(nombre : String, apellido :String){
    println("Mi nombre es $nombre y mi apellido es $apellido")
}

fun imprimirNombre2(nombre : String, segundoNombre : String, apellido :String){
    println("Mi nombre completo es $nombre $segundoNombre $apellido")
}


fun imprimirNombre3(nombre : String, segundoNombre : String = "", apellido :String){
    println("Mi nombre completo es $nombre $segundoNombre $apellido")
}