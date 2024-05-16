package org.example

fun main(args: Array<String>) {
    println("---16.1---")
    val a: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400)
    println("1年目の時給は${a[0]}円です")
    println("2年目の時給は${a[1]}円です")
    println("3年目の時給は${a[2]}円です")
    println("4年目の時給は${a[3]}円です")
    println("5年目の時給は${a[4]}円です")

    println("---16.3---")
    for (i in 0..4) {
        println("${i + 1}年目の給料は　${a[i]}円です。")
    }

    println("---16.4---")//バグがあるコードです 6年目から出ない
    val a2: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400, 3000, 3800)
    for (i in 0..4) {
        println("${i + 1}年目の給料は　${a2[i]}円です。")
    }
    println("---16.5---")
    for (i in 0..<a2.count()) {
        println("${i + 1}年目の給料は　${a2[i]}円です。")
    }
    println("---16.6---")
    for (money in a2) {
        println("時給 ${money}円です")
    }
    println("---16.7---")//これ以外やるな
    for ((index, money) in a2.withIndex()) {
        println("${index + 1}年目の給料は　${money}円です。")
    }
    println("---16.8---")
    val a8: BooleanArray = booleanArrayOf(true, false, true, true, false)
    val b8: ByteArray = byteArrayOf(2, 4, 8, 16, 32)
    val c8: ShortArray = shortArrayOf(100, 102, 103, 104)
    val d8: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400)
    val e8: LongArray = longArrayOf(10000, 12000, 15000, 18000, 240000)
    val f8: DoubleArray = doubleArrayOf(1.0, 10.0, 100.0, 1000.0, 10000.0)
    val g8: FloatArray = floatArrayOf(1.0f, 1.1f, 1.2f, 1.3f, 1.4f)

    for (x in a8) println("Boolean型の配列の値 = ${x}")
    for (x in b8) println("Byte型の配列の値 = ${x}")
    for (x in c8) println("Short型の配列の値 = ${x}")
    for (x in d8) println("Int型の配列の値 = ${x}")
    for (x in e8) println("Long型の配列の値 = ${x}")
    for (x in f8) println("Double型の配列の値 = ${x}")
    for (x in g8) println("Float型の配列の値 = ${x}")

    println("---16.9---")
    val h9 = arrayOf("こんにちは", "Kotlin", "どうぞ", "よろしく", "お願いします")
    for (x in h9) println("$x")
}


