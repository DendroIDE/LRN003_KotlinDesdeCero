fun main(args: Array<String>) {
    var nombre : String? = null //Es una variable nula ?
    //Utilizar try catch con finally
    try {
        nombre!!.length //Double Bang para que no genere errores de compilación
    }catch (excepcion : NullPointerException){
        println("Ha ocurrido un error")
    }finally {
        println("Finalmente ha ocurrido un error.. Cerrando aplicacion")
    }

    //Lanzar una excepcion propia
    try {
        //throw - Indica que se lanzará una excepcion
        throw NullPointerException("REFERENCIA NULA")
    }catch (excepcion : NullPointerException){
        println("Ha ocurrido un error")
    }finally {
        println("Finalmente ha ocurrido un error.. Cerrando aplicacion")
    }
    //Asignacion a variables
    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try {
        primerValor/segundoValor
    }catch (exception : Exception){
        0
    }
    println("Resultado: $resultado")
}