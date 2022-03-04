fun main(args: Array<String>) {
    val colors = listOf("Azul", "Amarillo", "Rojo")
    with(colors) {
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }

    val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9",
        "Xiaomi MI A3").run { removeIf { mobil -> mobil.contains("Google") }
        this
        }
    println(mobiles)

    val otherMobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9",
        "Xiaomi MI A3").apply { removeIf { mobil -> mobil.contains("Google") } }

    println(otherMobiles)

    val colores : MutableList<String>? = mutableListOf("Azul", "Amarillo", "Rojo")
    colores?.apply {
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }

    val alsoMobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9",
        "Xiaomi MI A3").also { lista -> println("El valor original de la lista es $lista") }
        .asReversed()
    println(alsoMobiles)


}