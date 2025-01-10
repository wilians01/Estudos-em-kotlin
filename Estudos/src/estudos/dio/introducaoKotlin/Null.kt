package estudos.dio.introducaoKotlin

fun main() {
    //caso queira que a sua variavl aceite valores nulll você tera que colocar um ponto de ?
    //var exempço :String? = null// você não declara dessa maneira isso ira gerar um erro

    fun tamanhoString(tamanhoDaString: String?): String {              // 1 Declaração da função
        if (tamanhoDaString != null && tamanhoDaString.length > 0) {
            return "O tamanho da string é ${tamanhoDaString.length}"
        } else {
            return "variavel vazia ou nula"
        }
    }

    println( tamanhoString("wilians"))
    println( tamanhoString(""))
    println( tamanhoString(null))
}