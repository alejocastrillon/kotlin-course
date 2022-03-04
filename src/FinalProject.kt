// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "\uD83E\uDD14"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun main() {
    println("Hola soy tu bola 8n mágica creada en Kotlin.\n¿Cual de estas opciones deseas realizar?")
    println("\t1. Realizar una pregunta")
    println("\t2. Revisar todas las respuestas")
    println("\t3. Salir")
    val enteredValue = readLine()
    when (enteredValue) {
        "1" -> makeQuestion()
        "2" -> seeAnswer()
        "3" -> exit()
        else -> showError()
    }
}

fun showError() {
    println("Vaya!! Parece que has elegido una opción no valida")
}

fun seeAnswer() {
    println("Selecciona una opción")
    println("\t1. Revisar todas las respuestas")
    println("\t2. Revisar solo las respuestas afirmativas")
    println("\t3. Revisar solo las respuestas dudosas")
    println("\t4. Revisar solo las respuestas negativas")
    val enteredOption = readLine()
    when (enteredOption) {
        "1" -> showAnswersType()
        "2" -> showAnswersType(answerType = RESPUESTA_AFIRMATIVA)
        "3" -> showAnswersType(answerType = RESPUESTA_DUDOSA)
        "4" -> showAnswersType(answerType = RESPUESTA_NEGATIVA)
        else -> println("Opción no valida, adios")
    }
}

fun showAnswersType(answerType: String = "TODOS") {
    val lambdaFilter : (String, String) -> Boolean = { x: String, y: String -> x == y }
    val lambdaAlso : (Set<String>) -> Unit = { println(it) }
    when (answerType) {
        "TODOS" -> respuestas.keys.forEach(::println)
        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { lambdaFilter(it, RESPUESTA_AFIRMATIVA) }
            .also { lambdaAlso(it.keys) }
        RESPUESTA_DUDOSA -> respuestas.filterValues { lambdaFilter(it, RESPUESTA_DUDOSA) }
            .also { lambdaAlso(it.keys) }
        RESPUESTA_NEGATIVA -> respuestas.filterValues { lambdaFilter(it, RESPUESTA_NEGATIVA) }
            .also { lambdaAlso(it.keys) }
    }
}

fun makeQuestion() {
    println("¿Que pregunta deseas realizar?")
    readLine()
    println("Así que esa era tu pregunta, la respuesta a eso es:")
    val generatedAnswer = respuestas.keys.random()
    println(generatedAnswer)
}

fun exit() {
    println("Hasta luego!!")
}