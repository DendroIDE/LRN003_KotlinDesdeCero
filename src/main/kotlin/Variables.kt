fun main(args: Array<String>) {
    //Tipos de Variables

    val boolean1 : Boolean = true //Booleano de tipo Verdadero o falso - True or False
    val boolean2 = true //Booleano de tipo Verdadero o falso - True or False sin declarar : Boolean

    //Long tiene soporte para una cantidad excesivamente grande de números
    val numeroLargo1 : Long = 3000000000000000000
    val numeroLargo2 : Long = 3L //Long sin declarar : Long - 3L determina un número Long

    val double1 : Double = 2.7182 //Double de punto flotante o decimales
    val double2 = 2.7182 //Double de punto flotante o decimales sin declarar : Double

    //Float para valores flotantes utilizado en porcentajes 1.1f asegura que la variable sea de tipo float
    val float1 : Float = 1.1f
    val float2 = 1.1f //Float para valores flotantes utilizado sin declarar : Float

    //Funciones de una variable
    val primerValor = 20
    //La variable primerValor contiene dentro de sí misma funciones que facilitan las operaciones
    val funcionVariablePrimerValor = primerValor.toDouble()
    val valorOperacion = primerValor.minus(funcionVariablePrimerValor) //Ctrl + B en minus => para ver la declaracion de la función
    println(valorOperacion)

    val valorAsignadoNullable : Int? = 0 //Es decir que puede ser de tipo Nullable

    val apellido = "Muñoz"
    val nombre = "Dennis"
    val sumaNombreCompleto1 = nombre + " " + apellido //Suma dos cadenas de texto
    val sumaNombreCompleto2 = "$nombre $apellido" //Suma dos cadenas de texto con concanetación
    println(sumaNombreCompleto1)
    println(sumaNombreCompleto2)

    val sumaNombreCompleto3 = "Mi nombre es: $nombre y mi apellido es: $apellido" //Suma dos cadenas de texto con concanetación
    println(sumaNombreCompleto3)

}