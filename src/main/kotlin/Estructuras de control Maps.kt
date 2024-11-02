fun main(args: Array<String>) {
    //Los maps son elementos de clave valor son estructuras de datos de clave y valor que significa que para cada clave existe un valor
    //Un valor puede pertenecer a varias claves pero solo puede existir una clave del mismo tipo

    //---------- * MAPAS MUTABLES * ----------
    //La función mapOf crea mapas inmutables, son familia de los collections
    val edadDeSuperHeroesInmutables = mapOf(
        "Ironman" to 35, //Ironman pertenece a 35 lo que quiere decir que se unieron y se ha creado un par
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroesInmutables)
    //Los mapas tienen una serie de pares dentro de los elementos, los mapas a diferencia de las listas no tienen forma de acceder por un numero específico por un index o por un orden si no que se hacen por las keys

    //---------- * MAPAS MUTABLES * ----------
    //La función mutableMapOf crea mapas mutables, son familia de los collections
    val edadSuperHeroesMutables = mutableMapOf(
        "Ironman" to 35, //Ironman pertenece a 35 lo que quiere decir que se unieron y se ha creado un par
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadSuperHeroesMutables)
    //La funcion .put permite agregar datos al map
    edadSuperHeroesMutables.put("Wolvering",45)
    println(edadSuperHeroesMutables)
    //Asignacion convencional a .put
    edadSuperHeroesMutables["Storm"] = 30
    println(edadSuperHeroesMutables)

    //Para obtener valores del mapa se debe obtener el valor del key
    val edadIronman = edadSuperHeroesMutables["Ironman"]
    println(edadIronman)

    //La funcion remove permite eliminar elementos del map
    edadSuperHeroesMutables.remove("Wolvering")
    println(edadSuperHeroesMutables)

    //La funcion .keys permite visualizar la lista de claves para verificar las keys
    println(edadSuperHeroesMutables.keys)

    //La funcion .values permite visualizar la lista de valores de cada key
    println(edadSuperHeroesMutables.values)
}