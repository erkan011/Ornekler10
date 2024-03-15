package org.example


sealed class Result<out T>

data class Success<out T>(val data: T) : Result<T>()
data class Error(val message: String) : Result<Nothing>()

fun divide(a: Int, b: Int): Result<Int>{
    return if (b !=0){
        Success(a/b)
    }else{
        Error("Sıfıra Bölme Hatası")
    }
}
fun main() {
    when (val result = divide(10,10)){
        is Success -> println("Sonuç: $result")
        is Error -> println("Hata: ${result.message}")
    }
}