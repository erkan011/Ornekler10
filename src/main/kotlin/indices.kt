package org.example

fun main() {
    val numbers = arrayOf(1,2,3,4,5)

    for (i in numbers.indices){
        println("Index: $i, value: ${numbers[i]}")
    }
}