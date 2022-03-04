fun main(args: Array<String>) {
    val edadSuperHeroes = mapOf("Ironman" to 35, "Spiderman" to 23, "Capitan America" to 99)
    println(edadSuperHeroes)

    val edadSuperHeroesMutable = mutableMapOf("Ironman" to 35, "Spiderman" to 23, "Capitan America" to 99);
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable.put("Wolverine", 45)
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable["Storm"] = 30
    println(edadSuperHeroesMutable)

    val edadIronMan = edadSuperHeroesMutable["Ironman"]
    println(edadIronMan)

    edadSuperHeroesMutable.remove("Wolverine")
    println(edadSuperHeroesMutable)

    println(edadSuperHeroesMutable.keys)
    println(edadSuperHeroesMutable.values)
}