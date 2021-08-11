package one.digitalinnovation.collections

fun main() {
    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "PJ")
    val maria = Funcionarios("Maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)

    println(TRACOS)
    println("LIST")
    println(TRACOS)
    funcionarios.forEach { println(it) }

    println(TRACOS)
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println(TRACOS)
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println(TRACOS)
    println("SET")
    println(TRACOS)
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println(TRACOS)
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println(TRACOS)
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}