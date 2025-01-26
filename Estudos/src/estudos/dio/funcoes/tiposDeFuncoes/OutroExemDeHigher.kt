package estudos.dio.funcoes.tiposDeFuncoes
//Retornando funções

//1-Declara uma função de ordem superior que retorna uma função. (Int) -> Intrepresenta os parâmetros e o tipo de retorno da square função.
//2-Declara uma função correspondente à assinatura.
//3-Invoca operation para obter o resultado atribuído a uma variável. Aqui func se torna square que é retornado por operation.
//4-Invoca func. A square função é realmente executada.


fun operation(): (Int) -> Int {                                     // 1
    return ::square
}

fun square(x: Int) = x * x                                          // 2

fun main() {
    val func = operation()                                          // 3
    println(func(2))                                                // 4
}