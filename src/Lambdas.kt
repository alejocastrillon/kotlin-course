fun main(args: Array<String>) {
    val myLambda : (String) -> Int = { it.length }

    println(myLambda("Hola Juventud"))

    val saludes = listOf("Hello", "Hola", "Ciao")
    val saludesLength = saludes.map(myLambda)
    println(saludesLength)
}