package estudos.dio.poo

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

fun main() {
    // manerias de declarar uma variavel
    val funcionario = Caixa()
    val funcionario1 = Funcionario()
    val funcionario2: Funcionario = Caixa()

    funcionario.fala()
    funcionario1.fala()
    funcionario2.fala()

}