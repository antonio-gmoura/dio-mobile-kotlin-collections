package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5) //
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("--------------------")
    println("Example: for in")
    for (valor in values) {
        println(valor)
    }

    println("--------------------")
    println("Example: forEach")
    values.forEach {
        println(it)
    }
/*
    values.forEach { it ->
        println(it)
    }
*/
    println("--------------------")
    println("Example: for in indices")
    for (index in values.indices) {
        println(index.toString() + ": " + values[index])
    }

    println("--------------------")
    println("Example: sort and for in indices")
    values.sort()
    for (index in values.indices) {
        println(index.toString() + ": " + values[index])
    }
}