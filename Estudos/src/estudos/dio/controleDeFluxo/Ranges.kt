package estudos.dio.controleDeFluxo

fun main() {
    for(i in 0..3) {  // 1  Itera sobre um intervalo começando de 0 até 3 (inclusive). -> 1...3
        print(i)

    }
    print(" ")

    for(i in 0 until 3) {  // 2 Itera sobre um intervalo começando de 0 até 3 (exclusivo). -> 1...2
        print(i)


    }
    print(" ")

    for(i in 2..8 step 2) { // Itera em um intervalo com uma etapa de incremento
                                   // personalizada para elementos consecutivos. -> 2..4..6..8
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) { // 4 Itera sobre um intervalo em ordem reversa. -> 3...0

        print(i)
    }
    print(" ")

//PODEMOS FAZER A MESMA COM LETRAS

    for (c in 'a'..'d') {// 1 Itera sobre um intervalo de caracteres em ordem alfabética -> abcd
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // 2 Os intervalos de caracteres também suportam step e downTo.
        print(c)
    }
    print(" ")
}