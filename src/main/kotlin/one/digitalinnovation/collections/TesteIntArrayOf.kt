package one.digitalinnovation.collections

const val TRACOS = "------------------------------"

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    println(TRACOS)
    values.forEach {
        println(it)
    }

    println(TRACOS)
    values.sort()
    values.forEachIndexed { index, i -> println("$index: $i") }

}