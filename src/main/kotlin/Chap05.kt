package org.example

fun main(args: Array<String>) {
    val a: Char = 'た'
    val b: Char = 'い'
    val c: Char = 'き'
    val message: String = "さようなら、\n世界"
    val e = "こんにちha"
    val f = "world!"
    val message2 = e + f
    val world = "世界！"
    val message3 = "こんにちは、$world"
    val world2 = "世界！"
    val message4 = "消えろ ${world2}"
    val h = 5000
    val message5 = "本日働いた時間ぅわ、${h}hours"
    val h2: Int  = 77
    val message6 = "本日働いた時間は${h2}hour"
    val message7 ="このペースで一ヶ月働くと、${h*30}hours の労働になります"
    println(a)
    println(b)
    println(c)
    println(message)
    println(message2)
    println(message3)
    println(message4)
    println(message5)
    println(message6)
    println(message7)
}