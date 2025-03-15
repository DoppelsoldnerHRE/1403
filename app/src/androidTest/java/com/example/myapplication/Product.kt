package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class Product ( val id: Int, val nome: String, val preco: Int, var Estoque: Int ){
    fun ExibirEstoque(){
        println("O produto de id: $id , nome: $nome, preco: $preco e estoque: $Estoque")
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Yuri")
    }
}