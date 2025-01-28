package estudos.dio.ExecoesEmKotlin

// Aqui podemos ver como é um tratamento de exceções em kotlin bem semelhante ao java com try catch

fun main() {

    val a = 10
    val b =0

    try {
        val div = a/b
    }catch (e:ArithmeticException){
        println("Ocorreu uma exceção aritmética.")
    } catch (e: Throwable){
        e.printStackTrace()
    }finally {                              // fanilly é executado independente de erro ou não
        println("Fianally executado")
    }


    //throw Exception("Simulando uma exceção!")
}