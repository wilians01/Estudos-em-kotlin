package estudos.dio.funcoes.tiposDeFuncoes

//  Funções Lambda
//  Funções lambda("lambdas") são uma maneira simples de criar funções ad-hoc. Lambdas podem ser denotadas de forma
//  muito concisa em muitos casos, graças à inferência de tipos e à itvariável implícita.

//1 Um lambda em toda sua glória, com tipos explícitos em todos os lugares.
// O lambda é a parte entre chaves, que é atribuída a uma variável de tipo (String) -> String(um tipo de função).

//2 Inferência de tipo dentro de lambda: o tipo do parâmetro lambda é inferido a partir do tipo da variável à qual ele é atribuído.

//3 Inferência de tipo fora de lambda: o tipo da variável é inferido a partir do tipo do parâmetro lambda e do valor de retorno.

//4 Você não pode fazer as duas coisas ao mesmo tempo, pois o compilador não tem como inferir o tipo dessa maneira.

//5 Para lambdas com um único parâmetro, você não precisa nomeá-lo explicitamente. Em vez disso, você pode usar a itvariável implícita.
// Isso é especialmente útil quando o tipo de itpode ser inferido (o que geralmente é o caso).

//6 Se seu lambda consiste em uma única chamada de função, você pode usar ponteiros de função ( ::).

fun main() {
    val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1

    val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2

    val upperCase3 = { str: String -> str.uppercase() }                     // 3

    // val upperCase4 = { str -> str.uppercase() }                                                                         // 4

    val upperCase5: (String) -> String = { it.uppercase() }                 // 5

    val upperCase6: (String) -> String = String::uppercase                  // 6

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))

}