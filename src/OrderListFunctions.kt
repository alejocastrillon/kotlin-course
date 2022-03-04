fun main(args: Array<String>) {
    val numerosDeLoteria = listOf(11, 22, 43, 56, 78, 66)
    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosSorted)

    val numerosDescendentes = numerosDeLoteria.sortedDescending()
    println(numerosDescendentes)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { num -> num < 50 }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajesNumeros = numerosDeLoteria.map { num -> "Tu número de lotería es: $num" }
    println(mensajesNumeros)

    val numerosFiltrados = numerosDeLoteria.filter { num -> num > 50 }
    println(numerosFiltrados)
}