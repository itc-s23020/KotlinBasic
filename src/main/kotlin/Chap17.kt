package org.example

fun main(args: Array<String>) {
    val a: IntArray = intArrayOf(1000, 1200, 1500)

    println("1年目の時給は　${a[0]}円です")
    println("2年目の時給は　${a[1]}円です")
    println("3年目の時給は　${a[2]}円です")

    for(money in a){
        println("時給は ${money}円です。")
    }

    for((index, money) in a.withIndex()){
        println("${index+1}年目の時給は ${money}円です")
    }
    println("---17.2---")
    val a2: List<Int> = listOf(1000, 1200, 1500)

    println("1年目の時給は　${a[0]}円です")
    println("2年目の時給は　${a[1]}円です")
    println("3年目の時給は　${a[2]}円です")

    for(money in a2){
        println("時給は ${money}円です")
    }
    for((index, money) in a.withIndex()){
        println("${index+1}年目の時給は${money}円です")
    }
    println("---17.3---")
    val a3: List<Boolean> = listOf(true, false, true)
    val b3: List<Byte> = listOf(2,4,8)
    val c3: List<Short> = listOf(100, 101, 102)
    val d3: List<Int> = listOf(1000, 1200, 1500)
    val e3: List<Long> = listOf(10000, 120000, 150000)
    val f3: List<Float> = listOf(1.0f, 1.1f, 1.2f)
    val g3: List<Double> = listOf(1.0, 10.0, 100.0)
    val h3: List<String> = listOf("こんにちは", "Kotlin" ,"よろしく")

    println("---17.7---")
    val a9: MutableList<String> = mutableListOf("こんにちは", "Kotlin" ,"よろしく")
    //a9.add("どぅぞ")
    //a9.add("よろしくおねがいします")
    a9+=("どぅぞ")
    a9+=("よろしくおねがいします")
    for((i,x) in a9.withIndex()) println("${i} : ${x}")

    println("---17.9---")
    val a10: MutableList<String> = mutableListOf("こんにちは", "Kotlin" ,"よろしく")
    a10.removeAt(2)
    for((i,x) in a10.withIndex()) println("${i} : ${x}")

    println("---17.10---")
    val a11: MutableList<String> = mutableListOf("こんにちは", "Kotlin" ,"よろしく")
    a11.remove("Kotlin")
    for((i,x) in a11.withIndex()) println("${i} : ${x}")

}