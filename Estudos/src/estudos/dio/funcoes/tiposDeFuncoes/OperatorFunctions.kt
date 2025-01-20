package estudos.dio.funcoes.tiposDeFuncoes

fun main() {

    operator fun Int.times(str: String) = str.repeat(this) // 1 Isso leva a função infixa acima um passo adiante usando o operatormodificador.
    println(2 * "Bye ")  // 2 O símbolo do operador times() é * para que você possa chamar a função usando 2 * "Bye".

    operator fun String.get(range: IntRange) = substring(range)  // 3 Uma função de operador permite fácil acesso ao alcance das cordas.
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])                 // 4 O get()operador habilitasintaxe de acesso entre colchetes.

}