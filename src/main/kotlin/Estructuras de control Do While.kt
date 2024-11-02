fun main(args: Array<String>) {
    //Do While es un bluce -> Primero ejecuta el código y luego verifica la condición
    do{
        println("Generando número aleatorio...")
        val numeroAleatorio = (0..100).random()
        println("El número generado es $numeroAleatorio")
    }while (numeroAleatorio > 50)
}