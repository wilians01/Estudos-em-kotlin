package estudos.dio.controleDeFluxo


fun main() {

    cases("Olá")
    cases(1)
    cases(2L)
    cases(MyClass())
    cases("Tudo ok")


}

// when pode ser usado para substituir estruturas switch case
fun cases(obj: Any) { // esse tipo Any pode receber qualquer coisa
    when (obj) {
        1 -> println("Olá tudo bem")
        "Olá" -> println("como você vai")
        is Long -> println("Long")
        !is String -> println("Não é um String")
        else -> println("nenhumas das opções da função")
    }
}

class MyClass



