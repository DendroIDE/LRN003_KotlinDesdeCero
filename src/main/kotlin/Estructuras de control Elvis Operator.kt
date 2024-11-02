fun main(args: Array<String>) {
    var nombre : String? = null //Es una variable nula ?
    //Utilizar el operador elvis ya que lasimbología ?: semeja al copete del cantante americano Elvis
    val caracteresDeNombre : Int = nombre?.length ?: 0
    println(caracteresDeNombre)
}