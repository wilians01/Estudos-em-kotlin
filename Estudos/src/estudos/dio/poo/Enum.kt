package estudos.dio.poo

enum class State {
    FACIL, NORMAL, DIFICIL  // 1 Define uma classe enum simples com três constantes enum.
                            // O número de constantes é sempre finito e todas são distintas.
}

fun main() {
    val state = State.NORMAL      // 2 Acessa uma constante enum por meio do nome da classe.

    val message = when (state) {  // 3 Com enums, o compilador pode inferir se uma when-expressão
                                  // é exaustiva, de modo que você não precisa do else-case.
        State.FACIL -> "Modo Fácil"
        State.NORMAL -> "Modo Normal "
        State.DIFICIL -> "Modo Difícil"
    }
    println(message)
    println(state)
}