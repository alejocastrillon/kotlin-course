fun main(args: Array<String>) {
    //printPhrase(randomCase("Hola"))
    printPhrase("Hola".randomCase())
}

fun String.randomCase(): String {
    val randomNumber = 0..99
    val randomResult = randomNumber.random()
    if (randomResult.rem(2) == 0) {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

fun printPhrase(phrase: String) {
    println("Tu frase es: $phrase")
}

/*fun randomCase(phrase: String): String {
    val randomNumber = 0..99
    val randomResult = randomNumber.random()
    if (randomResult.rem(2) == 0) {
        return phrase.uppercase()
    } else {
        return phrase.lowercase()
    }
}*/