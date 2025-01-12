package estudos.anotacoes

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1 se compara as estruras dos objetos
    println(authors === writers)  // 2 se compara as referencias
}