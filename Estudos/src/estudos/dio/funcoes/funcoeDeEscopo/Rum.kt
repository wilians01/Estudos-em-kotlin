package estudos.dio.funcoes.funcoeDeEscopo
//Como let, run é outra função de escopo da biblioteca padrão. Basicamente,
// ela faz o mesmo: executa um bloco de código e retorna seu resultado.
// A diferença é que dentro rundo objeto é acessado por this. Isso é útil
// quando você quer chamar os métodos do objeto em vez de passá-lo como um argumento

fun main() {

    fun getNullableLength(ns: String?): Int { // esse Int não é obrigatorio ele é usado para retorna uma valor
        println("for \"$ns\":") // NA DUVIDA DOCUMENTAÇÃO https://play.kotlinlang.org/byExample/06_scope_functions/02_run
       return ns?.run {                            // 1 Chama o bloco fornecido em uma variável anulável.
            println("\testá vazio? " + isEmpty()) //2 Dentro run, os membros do objeto são acessados sem seu nome.
            println("\ttamanho = $length")        // no caso não precisa usar o it igual o Let

            length                             // 3 run retorna o length do dado Stringse não for null.
        }?: 0
    }
    println(getNullableLength(null))
    getNullableLength("")
    getNullableLength("alguma string com Kotlin")

}