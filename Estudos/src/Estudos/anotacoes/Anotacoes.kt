package Estudos.anotacoes

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
    // se quiser converter um tipo coloque depois da variavel .to---- e o tipo da que você

    println(resposta)

    //podemos no momento da declaração de um numero grande colocar _ para ficar melhor intendimento
    val  numeroGrande =1_000_000

    //NUMEROS
    val byte: Byte = 8 // 8-bit
    val short: Short = 16 // 16-bit
    val age: Int = 31 // 32-bit
    val long: Long = 11515114 // 64-bit

    val numerosFlutuantes: Float = 54.56f // 32-bit
    val numero3: Double = 31.90 //64-bit

    // ALGUMAS FUNCÕES
    // Para saber o tamanho de uma varial ou arry, String etc.....
    val nome = "Carlos Pereira Nunnes"
    println("O nome $nome tem ${nome.length} letras")
    // Obs: para colocar uma Função dentro de println tem que colocar ${ } se não, não dá certo
    // Obs: a função .length na contagem da varial String se o nome tiver sobre nome ele tambem vai conta o espaço












}

