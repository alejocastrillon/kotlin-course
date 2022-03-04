const val PI = 3.14159
fun main(args: Array<String>) {
    println("Hola Mundo")
    var dinero : Int = 1000
    println(dinero)
    dinero = 5000
    println(dinero)
    val nombre = "Alejandro"
    println(nombre)
    println(PI)

    val boolean = true
    val longNumber : Long = 300000000000000
    val double: Double = 2.71828
    val float: Float = 1.1f

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor.minus(segundoValor)
    //val tercerValor = primerValor - segundoValor
    println(tercerValor)
    val apellido = "Castrillón"
    val nombreCompleto = "Mi nombre es: $nombre $apellido"
    println(nombreCompleto)

    if (nombre.isNotEmpty()) {
        println("El largo de nuestra variable nombre es ${nombre.length}")
    } else {
        println("La variable está vacía")
    }

    val mensaje: String = if (nombre.length > 4) {
        "Tu nombre es largo!"
    } else if (nombre.isEmpty()) {
        "El nombre está vacío"
    }else{
        "Tu nombre es corto!"
    }
    println(mensaje)

    val nombreColor = "carmesi"

    when(nombreColor) {
        "amarillo" -> println("El amarillo es el color de la alegría")
        "rojo", "carmesi" -> println("El rojo simboliza el calor")
        else -> println("Error, no tengo información del color")
    }

    val code = 200
    when(code) {
        in 200..299 -> println("Todo ha ido bien!!")
        in 400..500 -> println("Algo ha fallado :(")
        else -> println("Código desconocido :O")
    }

    val tallaZapato = 40
    val message = when(tallaZapato) {
        41, 43 -> "Tenemos disponibles"
        42, 44 -> "Casi no nos quedan!!"
        45 -> "Lo siento no tenemos disponibles"
        else -> "Estos zapatos solo vienen en talla 41, 42, 43, 44 y 45"
    }
    println(message)
}