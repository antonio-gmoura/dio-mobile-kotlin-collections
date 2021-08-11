package one.digitalinnovation.collections

fun main() {
    val joao = Funcionarios("João", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "PJ")
    val maria = Funcionarios("Maria", 4000.0, "CLT")

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

data class Funcionarios(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
        """.trimIndent()
}