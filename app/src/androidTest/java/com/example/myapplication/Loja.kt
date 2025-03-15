package com.example.myapplication

class Loja(val produtos: List<Product>){
    fun finalizarCompra(cliente: cliente, carrinho: carrinhoDeCompras){
        val total = carrinho.calcularTotal()
        if (cliente.saldo >= total){
            println("Compra realizada")

            // Atualizar saldo e estoque
            cliente.saldo -= total
            carrinho.produtosLista.forEach{ it.Estoque -=1 }
            carrinho.produtosLista.clear()
        }
        else{
            println("Saldo insuficiente")
        }
    }
}