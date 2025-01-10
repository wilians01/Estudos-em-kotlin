package Estudos.anotacoes

fun main() {

    val mensagem = "Olá meu amigo tudo bem\nQuanto tempo !! " // caso vc queira pular de linha em debtro de uma
    // frase vc coloca \n isso ira fazer o texto quebra uma linha.

    //Outro jeito mais legal de você fazer isso é dessa maneira

    val mensagem2 = """
        Olá meu amigo
        tudo bem!!!
        
    """.trimIndent()
    //temos outros tipos de formato esse abaixo é mais para Execel
    val mensagem3 = """
        texto-1
        texto-2
        """.replaceIndent(";")// essa função ira colocar uma String na frente do seu textos formatados


//    println("$mensagem\n")
//    println(mensagem2)
    println(mensagem3)

}