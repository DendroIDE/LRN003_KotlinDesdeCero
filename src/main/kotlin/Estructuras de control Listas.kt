fun main(args: Array<String>) {
    //LISTAS INMUTABLES
    //La funcion listOf permite crear una lista de cualquier tipo pero por defecto siempre se crea de tipo String
    val listaDeNombre1 = listOf<String>("Juan","Enrique","Camila")
    val listaDeNombre2 = listOf("Juan","Enrique","Camila")
    //No es posible aplicar la función => listaDeNombre1.remove => listaDeNombre2.remove
    println(listaDeNombre1)
    println(listaDeNombre2)

    //LISTAS MUTABLES
    //La funcion mutableListOf permite crear una lista de cualquier tipo pero por defecto siempre se crea de tipo String
    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    //La funcion .add permite añadir elementos a la lista mutable
    listaVacia.add("Juan")
    println(listaVacia)
    //La función .get(posicion) permite obtener el valor o dato de la posicion que se encuentra en la lista
    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)
    //Se puede reemplazar el .get por un operador indexado pero serviría de igual manera
    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)


    // ---------- * OPERACIONES * -----------

    //La función first() permite obtener el primer valor de la lista
    val primerValor = listaDeNombre1.first()
    println(primerValor)

    //La función firstOrNull() permite obtener el primer valor de la lista en caso de no encontrar el primer valor soluciona problemas de la funcion first()
    val primerValorNoEncontrado = listaDeNombre1.firstOrNull()
    println(primerValorNoEncontrado)

    //La función removeAt(posicion) permite eliminar los datos de una cierta posicion de una lista mutable
    listaVacia.removeAt(0)
    println(listaVacia)

    //La función removeIf{ -- CONDICION --} permite eliminar los elementos de la lista solo cuando se cumpla la condicion que se especifica dentro de las llaves
    listaVacia.add("Enrique")
    listaVacia.add("Juan")
    listaVacia.add("Pedro")
    listaVacia.removeIf{  caracteres -> caracteres.length > 4  }
}