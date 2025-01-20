package estudos.dio.funcoes

// alsofunciona comoapply: executa um bloco dado e retorna o objeto chamado.
// Dentro do bloco, o objeto é referenciado por it, então é mais fácil passá-lo como um argumento.
// Esta função é útil para incorporar ações adicionais, como logar em cadeias de chamadas.

data class Pessoa(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Pessoa) {
    println("A new person ${p.name} was created.")
}

fun main() {

    val jake = Pessoa("Jake", 30, "Android developer")// 1 Cria um Person()objeto com os valores de propriedade fornecidos.
        .also {        // 2 Aplica o bloco de código fornecido ao objeto. O valor de retorno é o próprio objeto.
            writeCreationLog(it)   // 3 Chama a função de registro passando o objeto como argumento it nada mais é que o jake.
        }

}