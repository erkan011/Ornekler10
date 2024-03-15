package org.example

fun divide2(a:Int,b:Int): Int{
    if (b == 0){
        throw IllegalArgumentException("Bölen Sıfır olmaz!!")
    }
    return a/b
}
fun main() {
    try {
        val result = divide2(10,0)
        println("Sonuç: $result")
    }catch (e : IllegalArgumentException){
        println("Hata: ${e.message}")
    }
}