package Estudos.Dio

fun menssagem(menssagem: String) { // Um exemplo de um estrutura de função
    println(menssagem)
}

fun felizAniversario(
    nome: String,
    messagem: String = """meus parabéns !!!
    | Muitos anos de vida !!!
""".trimMargin(),
) {
    println("\n $nome quero te desejar $messagem ")

}

fun soma(x: Int, y: Int): Int { // aqui a função vai retorna a soma

    return x + y
}

fun somaa(x: Int, y: Int) {
    // ja aqui ira retorna Unit você pode colocara para imprimir o resultado mais não é mesma coisa

    println(x + y)
}

fun multi(x: Int, y: Int) = x * y// essa função retorna a soma
// essa função seria a mesma coisa da função soma a diferença que não tem { } e return

fun main() {
//    menssagem(" Feliz Aniversario ")
//    felizAniversario("Monique")
//    println(soma(5,5))
//    println(somaa(5,5))
//    println(multi(5,5))

    fun nomes(vararg nomes:String){// o varang indica que posso receber wuantos nomes eu quiser, respetando o tipo
        // aqui nessa fuçao podemos passar um quantidade indefenida de um determinado tipo
        // essa função ira armazena os dados como uma lista
        for (n in nomes) println(n)
    }
    nomes("maria","joão","matheus","fernando","marcos","franco","lucas","marcelo")


    fun nomesEquantid(vararg nomes:String,prefixo:String){

        for (n in nomes) println(prefixo + n)
    }
    nomesEquantid("maria","joão","matheus","fernando","marcos","franco","lucas","marcelo", prefixo = "Nomes:")

}