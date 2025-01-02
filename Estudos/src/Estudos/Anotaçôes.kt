package Estudos

fun main() {

    val prince = 31.90
    val protuto = "Feijão"
    val idade = 28

    // Se caso queira sabe o tipo da variavel
    println(prince::class)
    println(protuto::class)
    println(idade::class)

    // para declarar uma variavel

    var numero: Int = 25 // aqui declaramos uma variavel mutavel não é preciso usar :Int isso é opcional
    numero = 101010
    println(numero)
    val numero1 = 24// aqui declaramos uma varial imutal
    println(numero1)

    // CONVERSÃO DE TIPO

    val mediaDePreco = 25
    println(mediaDePreco)

    val resposta = mediaDePreco.toDouble()
    // se quiser converter um tipo coloque depois da variavel .to---- e tipo da que você


    println(resposta)








}

