package estudos.dio.funcoes

fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {

    val empty = "teste".let {   // 1 o let está sendo uma fução de escopo
        customPrint(it)    // 2 it e o valor "teste" customPrint vai deixa o String em caixa alta
        it.isEmpty()       // 3 isEmpty verifica se a variavel é vazia ou não retoenando verdadeiro ou falso
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("A impressão \"$str\":")

        str?.let {  // 4 Usa chamada segura, então letseu bloco de código será executado somente em valores não nulos.
            print("\t") // tabulação
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->      // 5 Usa o nome personalizado em vez de it, para que o aninhado
                                           // letpossa acessar o objeto de contexto do externo let.
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("Minha string")
    printIfBothNonNull("First", "Second")
}