package org.example

fun main() {
    val str = "hello"
    val newStr1 = str + '!'
    val newStr2 = str.plus("World")
    println(newStr1)
    println(newStr2)

    val list = listOf(1,2,3,4)
    val newList = list.plus(5)
    println(newList)

    val set = setOf("apple", "orange", "banana")
    val newSet = set.plus("Erkan")
    println("newSet: $newSet")

    val map = mapOf(1 to "one", 2 to "two")
    val newMap = map.plus(3 to "three")
    println("newMap: $newMap")
}