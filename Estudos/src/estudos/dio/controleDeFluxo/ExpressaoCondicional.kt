package estudos.dio.controleDeFluxo

fun main() {
    fun max(a: Int, b: Int) = if (a > b) a else b     // 1- if é uma expressão aqui: ela retorna um valor.

    println(max(99, -42))

    // É a mesma exepressão que essa abaixo só que reduzida

    fun maxExem(a: Int, b:Int): Int {
        if (a > b){
            return a
        }else{
            return b
        }
    }
    println(maxExem(99, -42))
}