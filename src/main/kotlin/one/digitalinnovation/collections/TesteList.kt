package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    println(TRACOS)
    funcionarios.forEach{println(it)}

    println(TRACOS)
    println(funcionarios.find{it.nome == "Maria"})

    println(TRACOS)
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println(TRACOS)
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}