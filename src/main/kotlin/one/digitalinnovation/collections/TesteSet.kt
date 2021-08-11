package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = listOf(joao, pedro)
    val funcionarios2 = listOf(maria)

    println(TRACOS)
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println(TRACOS)
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{println(it)}

    println(TRACOS)
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{println(it)}
}