package estudos.dio.funcoes.tiposDeFuncoes

//É até possível executar extensões em null referências.
// Em uma função de extensão, você pode verificar o objeto nulle usar o resultado em seu código:

fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"  // 1

fun main() {
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}