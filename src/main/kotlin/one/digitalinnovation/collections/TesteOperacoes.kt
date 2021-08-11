package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println(TRACOS)
    for (salario in salarios) {
        println(salario)
    }

    println(TRACOS)
    println("Maior Salário: ${salarios.maxOrNull()}")
    println("Menor Salário: ${salarios.minOrNull()}")
    println("Média Salário: ${salarios.average()}")

    println(TRACOS)
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach{println(it)}

    println(TRACOS)
    println(salarios.count {it in 2000.0 .. 5000.0})

    println(TRACOS)
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println(TRACOS)
    println(salarios.any { it == 1000.0 })
    println(salarios.find { it == 500.0 })
}