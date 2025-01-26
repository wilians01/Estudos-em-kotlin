package estudos.dio.funcoes.tiposDeFuncoes

// Funções de ordem superior
//UMfunção de ordem superioré uma função que recebe outra função como parâmetro e/ou retorna uma função.

//Tomando funções como parâmetros

// 1 - Declara uma função de ordem superior. Ela recebe dois parâmetros inteiros, xe y. Além disso,
// ela recebe outra função operationcomo parâmetro. Os operationparâmetros e o tipo de retorno também são definidos na declaração.
// 2 - A função de ordem superior retorna o resultado da operationinvocação com os argumentos fornecidos.
// 3 - Declara uma função que corresponde à operationassinatura.
// 4 - Invoca a função de ordem superior passando dois valores inteiros e o argumento da função ::sum. ::é a notação que referencia uma função pelo nome em Kotlin.
// 5 - Invoca a função de ordem superior passando um lambda como argumento de função. Parece mais claro, não é?

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3

fun main() {
    val sumResult = calculate(4, 5, ::sum)                          // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("sumResult $sumResult, mulResult $mulResult")
}