package estudos.dio.controleDeFluxo

class Aniamal(val nome: String)

class Zoo(val animais: List<Aniamal>){

    operator fun iterator(): Iterator<Aniamal>{
        return animais.iterator()
    }
}

fun main() {
    val animais = listOf(Aniamal("cavalo"),Aniamal("leão"),Aniamal("jacare"))
    val zoo = Zoo(animais)

    for (animal in zoo){
        println("Um ${animal.nome}")
    }
}