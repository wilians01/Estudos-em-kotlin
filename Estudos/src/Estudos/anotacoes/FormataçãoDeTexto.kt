package Estudos.anotacoes

fun main() {

    val mensagem = "Olá meu amigo tudo bem\nQuanto tempo !! " // caso vc queira pular de linha em debtro de uma
    // frase vc coloca \n isso ira fazer o texto quebra uma linha.

    //Outro jeito mais legal de você fazer isso é dessa maneira
    val mensagem2 = """
        Olá meu amigo
        tudo bem!!!
        
    """.trimIndent()
    println("$mensagem\n")
    println(mensagem2)

}