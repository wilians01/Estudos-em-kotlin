package Estudos.Dio

fun menssagem(menssagem: String) { // Um exemplo de um estrutura de função
    println(menssagem)
}

fun felizAniversario(nome: String,messagem: String = """meus parabéns !!!
    | Muitos anos de vida !!!
""".trimMargin(),) {
    println("\n $nome quero te desejar $messagem ")

}

fun soma(x: Int, y:Int):Int{ // aqui a função vai retorna a soma

    return x + y
}
fun somaa(x: Int, y:Int){
    // ja aqui ira retorna Unit você pode colocara para imprimir o resultado mais não é mesma coisa

    println( x + y)
}

fun main() {
    menssagem(" Feliz Aniversario ")
    felizAniversario("Monique")
    println(soma(5,5))
    println(somaa(5,5))
}