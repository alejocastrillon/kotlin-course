fun main(args: Array<String>) {
    var contador = 10
    while (contador > 0) {
        println("El valor del contador es $contador")
        contador--
    }

    do {
        println("Generando número aleatorio...")
        val numeroAleatorio = (0..100).random()
        println("El número generado es: $numeroAleatorio")
    } while (numeroAleatorio > 50)

    val listaFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
    /*listaFrutas.forEach {
        println("Hoy voy a comer $it")
    }*/

    //for (fruta in listaFrutas) println("Hoy voy a comer $fruta")

    listaFrutas.forEach { fruta -> println("Hoy voy a comer $fruta") }

    val caracteresFruta = listaFrutas.map { fruta -> fruta.length }
    println(caracteresFruta)

    val listaFiltrada = caracteresFruta.filter { size -> size > 5 }
    println(listaFiltrada)
}