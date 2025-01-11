package estudos.dio.controleDeFluxo

fun main() {
    // Um exemplo de estrutura for
    val sabores = listOf("chocolate","morango","abacaxi","uva")

    for(sabor in sabores){
        println("Temos bolo de $sabor")
    }

    var n1 = 0
    var n2 = 0

    while (n1 <5 ){//Um exemplo de estrutura de while
        println("Parabéns")
        n1++
    }

    do {//Um exemplo de estrutura de do while
        println("Teste")
        n2++
    }while (n2 < 2)

}