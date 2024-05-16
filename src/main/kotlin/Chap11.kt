package org.example

fun main(args: Array<String>) {

    val a = 5
    val b = 5

    if (a < b) {
        println("aのほうがbよりも小さいです")
    }else if (a > b) {
        println("aのほうがbよりも大きいです")
    }else {
        println("いっしょだよおおおん")
    }
    println("----11.9----")
    val age: Int = 14
    var message = if(age in 13..15) {
        println("一番目の条件の処理が行われました")
        "中学生です"
    }else {
        println("二番目の条件の処理が行われました")
        "中学生ではありません"
//    val age = 40
//    if (age in 13..15){
//        println("中学生です")
//    }else {
//        println("帰れ")
    }
    println(message)
}