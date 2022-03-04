fun main(args: Array<String>) {

    var nombre: String? = null
    nombre?.let { value -> println("El nombre no es nulo es $value")}
    nombre = "Alejandro"
    nombre?.let { value -> println("El nombre no es nulo es $value")}

}