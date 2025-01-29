package estudos.dio.ExecoesEmKotlin

fun main() {

    val a = 10
    val b = 0

    //val div = try { a/b }catch (e:ArithmeticException){ "Ocorreu uma exceção aritmética." }
      val div = try {
          println("Tentando fazer a divisão...")
          a/b
      }catch (e:ArithmeticException) {
          println("Divisão com erro !")
          null
      }


    println(div)

}