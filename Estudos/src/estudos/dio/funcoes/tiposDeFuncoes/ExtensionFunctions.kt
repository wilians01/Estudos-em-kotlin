package estudos.dio.funcoes.tiposDeFuncoes

//Kotlin permite que você adicione novos membros a qualquer classe com oextensõesmecanismo.
// Ou seja, há dois tipos de extensões: funções de extensão e propriedades de extensão.
// Elas se parecem muito com funções e propriedades normais, mas com uma diferença importante:
// você precisa especificar o tipo que você estende.

//1 Define modelos simples de Iteme Order. Orderpode conter uma coleção de Itemobjetos.
//2 Adiciona funções de extensão para o Ordertipo.
//3 Adiciona uma propriedade de extensão para o Ordertipo.
//4 Chama funções de extensão diretamente em uma instância de Order.
//5 Acessa a propriedade de extensão em uma instância de Order.

data class Item(val name: String, val price: Float)                                         // 1

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String                                                   // 3
    get() = items.map { it.name }.joinToString()

fun main() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}")                           // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                                      // 5

}