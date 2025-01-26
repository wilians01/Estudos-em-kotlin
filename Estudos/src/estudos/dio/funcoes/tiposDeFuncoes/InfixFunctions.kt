package estudos.dio.funcoes.tiposDeFuncoes

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)      // 1 Define uma função de extensão infixa em Int.
    println(2 times "Bye ")                                    // 2 Chama a função infixa.

    val pair = "Ferrari" to "Katrina"               // 3 Cria um Pairchamando a função infix toda biblioteca padrão.
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4 Aqui está sua própria implementação de to chamado criativamente onto.
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    val clara = Person("Clara")
    sophia likes claudia                    // 5 A notação infixa também funciona em funções membros (métodos).
    sophia likes clara
    // para imprimir os nomes das amigas de sophia podemos criar uma forEach
    sophia.likedPeople.forEach{ qualqueNome ->
        println("${qualqueNome.name}")
    }

}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6 A classe que contém se torna o primeiro parâmetro.
}