package com.example.myapplication

class carrinhoDeCompras () {
    val produtosLista = mutableListOf<Product>()

    fun adicionarProduto(p: Product, quantidade: Int){
        for (i in 1..quantidade){
            produtosLista.add(p)
        }
    }
    fun removerProduto(p: Product){
        produtosLista.remove(p)
    }
    fun exibirCarrinho(){
        if(produtosLista.isEmpty()){
            println("carrinho esta vazio")
        } else {
            println("Exibindo carrinho: ")
            produtosLista.forEach{it.ExibirEstoque()}
        }
    }
    fun calcularTotal():Double{
        var total=0.0
        produtosLista.forEach { total += it.preco }
        println("O total e: $total")
        return total
    }

}