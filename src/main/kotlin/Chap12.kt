package org.example

fun main(args: Array<String>) {
    val x = "Hello"
    when (x) {
        "Good Morning" -> println("おはようござんす")
        "Hello" -> println("こんにちは")
        "Good Evening" -> println("こんばんは")
        else -> println("やあどうも")
    }
    println("----12.2----")
    val x2 = 2
    when (x2) {
//        1 -> println("ワン")
//        2 -> println("ツー")
        1,2 -> {
            println("ワン化ツー可のどちらかです")
            println("こんにちは")
        }
        3 -> {
            println("スリー")
            println("ありがと")
        }


        else -> {
            println("ワンツースリー以外の数字でっせ")
            println("さようなら")
        }
    }
    println("----12.5----")
    val x5 =2
    val message5= when (x5) {
        1 -> println("ワン")
        2 -> println("ツー")
        3 -> println("スリー")
        else -> "ワンツースリー以外の数字でっせ"
    }
    println(message5)

    println("----12.8----")
    val x8 =2
    when{ (x8 == 1 || x8 ==2)
    ->println("ワンかツーのどちらか")
        (x8 == 3)
    -> println("スリー")
    else
    -> println("1,2,3以外の数字")}
}