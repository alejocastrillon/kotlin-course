fun main(args: Array<String>) {
    printName(name = "Jairo", secondName = "Alejandro", lastname = "Castrillón")
}

fun printName(name: String, secondName: String = "", lastname: String) {
    println("Mi nombre completo es $name $secondName $lastname")
}