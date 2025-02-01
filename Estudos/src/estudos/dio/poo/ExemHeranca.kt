package estudos.dio.poo

// EXEMPLO DE HERAÇA 01

//Todas class em kotlin é fechada e FANIL não pode ser usada como extensão nem pode se subscrita

open class Funcionario { // Uma class que nós queremos que sejá herdada ela pricisa defenida como (open class)
    // Declarando como (open class) ela pode se usada como extensão por outra class
    // a mesma coisa vale para a função se você quer subscrever a função depois
    open fun fala(){
        println("Posso ajudar")
    }
}

class Caixa: Funcionario(){// aqui podemos ver que a class Caixa está herdado todas as características e comportamento
    // da class funcionario
    override fun fala(){ // para subscrever a função devemos declara a palavra reservada (override)
        // se a função (fala) não tivesse sido declarada como (open) você não poderia sobscrever ela
        println("Dinheiro ou cartão")
    }
}

// EXEMPLO DE HERAÇA 02

// herança com parametro no costrutor
open class Tigre(val origem: String){
    fun rugido(){
        println("O tigre que é do país intitulado $origem tem um rugido assim: ggrrhhhhhh  ")
    }
}

// Aqui podemos ver que class TigreSiberiano   alem de herda da class Tigre.
// a posibilidade de passa um parametro padrão no costrutor.
class TigreSiberiano : Tigre("Siberia")


// EXEMPLO DE HERAÇA 03

open class Lion(val nome01: String, val origin: String){
    fun ola(){
        println("O Leão $nome01 que é do país intitulado $origin diz: Graooh ")
    }
}

class Asiatico(nome02: String) : Lion(nome01 = nome02, origin = "India")




fun main() {
    // manerias de declarar uma variavel de instância

    val lion: Lion = Asiatico("Carlos")

    val tigre : Tigre = TigreSiberiano()

    val funcionario = Caixa()
    val funcionario1 = Funcionario()
    val funcionario2: Funcionario = Caixa()

    lion.ola()

    tigre.rugido()

    funcionario.fala()
    funcionario1.fala()
    funcionario2.fala()



}