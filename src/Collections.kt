fun main(args: Array<String>) {
    val vocalesRepetidas = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u");
    println(vocalesRepetidas)

    val numerosFavoritos = mutableSetOf(1, 2, 3, 4, 5)
    numerosFavoritos.add(5)
    println(numerosFavoritos)

    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorDelSet = numerosFavoritos.firstOrNull { num -> num > 2 }
    println(valorDelSet)
}