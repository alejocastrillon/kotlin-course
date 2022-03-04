fun main(args: Array<String>) {
    val initialValueLength = superFunction(initialValue = "Hola!!", block = {
        value -> value.length
    })
    println(initialValueLength)

    val lambda = functionInception("Alejo")
    println(lambda())

}

fun superFunction(initialValue: String, block: (String) -> Int): Int {
    return block(initialValue)
}

fun functionInception(name: String): () -> String {
    return {
        "Hola desde la lambda $name"
    }
}