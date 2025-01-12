package estudos.dio.colecoes


    val clientes: MutableList<Int> = mutableListOf(1, 2, 3)   // 1 Cria um MutableList.
    val copiaDosClientes: List<Int> = clientes    // 2 aqui é criado uma copia de somente leitura de cliente

    fun addclienete(newUser: Int) {              // 3 Adiciona um novo item ao MutableList que é systemUsers
        clientes.add(newUser)
    }

    fun mostraCliente(): List<Int> {            // 4 Uma função que retorna um imutável List que e souders
        return copiaDosClientes
    }

    fun main() {
        addclienete(4)   // 5 Atualiza o MutableList. Todas as visualizações somente leitura relacionadas
                                  // também são atualizadas, pois apontam para o mesmo objeto.

        println("Quantidade de clienetes: ${mostraCliente().size}") // 6 Recupera o tamanho da lista somente leitura.

        mostraCliente().forEach {     // 7 Itera a lista e imprime seus elementos
                i -> println("Algumas informações úteis sobre o clienetes $i")
        }
     // getSysSudoers().add(5) <- Error! // 8 A tentativa de gravar na visualização
                                           // somente leitura causa um erro de compilação.
    }
