package estudos.dio.funcoes

// apply executa um bloco de código em um objeto e retorna o
// próprio objeto. Dentro do bloco, o objeto é referenciado por this.
// Esta função é útil para inicializar objetos.

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {

    val jake = Person()                // 1 - Cria uma Person() instância com valores de propriedade padrão.
    val stringDescription = jake.apply { // 2 - Aplica o bloco de código (próximas 3 linhas) à instância.
        name = "Jake"                    // 3 - Dentro de apply, é equivalente a jake.name = "Jake".
        age = 30
        about = "Android developer"
    }.toString()           // 4 - O valor de retorno é a própria instância, então você pode encadear outras operações.

    println(stringDescription)
}