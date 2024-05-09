package org.example

import kotlin.math.sign

fun main(args: Array<String>) {
    //val original: Byte = 100
    //val original: Int = 100_000
    val original: String = "100"
   // val original: String = "あいうえお" error

    val a: Byte = original.toByte()
    val b: Short = original.toShort()
    val c: Int = original.toInt()
    val d: Long = original.toLong()
    val e: Float = original.toFloat()
    val f: Double = original.toDouble()
    val g: String = original.toString()
    val h: UShort = original.toUShort()
    val i: UInt = original.toUInt()
    val j: ULong = original.toULong()
    val k: UByte = original.toUByte()

    println("a = $a")
    println("b = $b")
    println("c = $c")
    println("d= $d")
    println("e = $e")
    println("f = $f")
    println("g = $g")
    println("h = $h")
    println("i = $i")
    println("j = $j")
    println("k = $k")
}