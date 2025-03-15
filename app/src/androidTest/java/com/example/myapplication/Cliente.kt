package com.example.myapplication

class cliente( val id: Int, val nome: String, var saldo: Double){
    fun adicionarSaldo(valor:Double){
        saldo=+valor
    }
    fun exibirDetalhes(){
        println("id: $id , nome: $nome , saldo: $saldo")
    }
}