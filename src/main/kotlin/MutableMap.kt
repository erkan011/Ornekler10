package org.example
data class UserInfo(val name: String, val name1: String)
fun main() {

    //Veri Saklama
    val sessionMap = mutableMapOf<String, UserInfo>()
    sessionMap["userID123"] = UserInfo("erkan","eymen")

    // İş akışı yönetimi
    val temporaryData = mutableMapOf<String, Any>()
    temporaryData["selectedItem"] = "product0123"
    temporaryData["cart"] = listOf("product456", "product789")
}