fun main(args: Array<String>) {
    val listaDeNombres = listOf("Juan", "Enrique", "Camila")
    println(listaDeNombres)

    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    listaVacia.add("Pedro")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValor : String? = listaDeNombres.firstOrNull()
    println(primerValor)

    listaVacia.removeAt(0);
    println(listaVacia)

    listaVacia.add("Enrique")

    listaVacia.removeIf { character -> character.length > 3 }

    val myArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(myArray)
}