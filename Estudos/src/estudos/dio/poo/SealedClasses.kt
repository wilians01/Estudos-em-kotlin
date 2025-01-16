package estudos.dio.poo

// Aulas seladaspermite que você restrinja o uso de herança.
// Uma vez que você declara uma classe sealed, ela só pode ser
// subclassificada de dentro do mesmo pacote onde a classe sealed é declarada.
// Ela não pode ser subclassificada fora do pacote onde a classe sealed é declarada.

sealed class Mammal(val name: String)// Aqui estamos criando uma class Mamifero

// Essa duas class abixo esta herdando da class Mamifero

class Cat(val catName: String) : Mammal(catName) // criação da class gato
class Human(val humanName: String, val job: String) : Mammal(humanName)// e Humano


fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Olá ${mammal.name}; você trabalha ${mammal.job}"
        is Cat -> return "Olá ${mammal.name}"
    }
}

fun main() {
    val cat = Cat("Motila")
    val humano =Human("Maria","Tec TI")

    println(greetMammal(cat))
    println(greetMammal(humano))
}