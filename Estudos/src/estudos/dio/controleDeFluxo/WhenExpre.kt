package estudos.dio.controleDeFluxo

fun main() {
    calculadora(4, 25.0, 0.0)
    calculadora(2, 25.0, 10.0)
    calculadora(3, 5.0, 8.0)
    calculadora(1, 8.0, 8.0)

}

fun calculadora(obj: Any, numero: Double, numero2: Double):Any {
    val result = when (obj){
        1 -> println("A soma dos valores é ${numero + numero2}")
        2 -> println("A subtração dos valorea é ${numero - numero2}")
        3 -> println("A multiplicação dos é ${numero * numero2}")
        4 -> if (numero2 != 0.0){
            println("A divisão dos dois numeros é:${numero/numero2}")
        }else{
            println("A divisão não é posssivl (divisãopor zero).")
        }
        else -> println("Opção invalida")



    }
    return result
}