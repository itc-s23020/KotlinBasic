package org.example

fun main(args: Array<String>) {
    val num = 100
    val a: Boolean = (num==100)
    val b: Boolean = (num==125)
    val num1 = 5
    val num2 = 10
    val a2 = (num1<num2)
    val b2 = (num1>num2)
    val num3 = 50
    val nm4 = 100
    val c = ("num1!=100")
    val d = ("num2! = 100")
    println("num3は 100ではない ：$c")
    println("num4は 100ではない ：$d")

    println("変数 a の値は　$a です。")
    println("変数 b の値は　$b です。")
    println("---6.6---")
    println("num1が　num2より小さい:$a")
    println("num1が　num2より小さい:$b")
}