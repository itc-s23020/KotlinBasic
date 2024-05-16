package org.example

fun main(args: Array<String>) {
//    val map: Map<String, String> = mapOf("Pen" to "ペン","Apple" to "アップル","Pineapple" to "パイナップル")
//    val value1 =  map["Pen"]
//    val value2 =  map["Pineapple"]
//    val value3 =  map["Apple"]
//    val value4 =  map["Pen"]
//    println("${value1} ${value2} ${value3} ${value4}")

    println("---19.2---")
    val map22: Map<Char, Int> = mapOf('a' to 1, 'b' to 2, 'c' to 3, 'z' to 26)
    println(map22['a'])
    println(map22['b'])
    println(map22['c'])
    println(map22['z'])

    println("---19.3---")
    val map53: Map<Int, Char> = mapOf(1 to 'a', 2 to 'b', 3 to 'c', 26 to 'z')
    run {
        println(map53[1])
        println(map53[2])
        println(map53[3])
        println(map53[26])
    }
    println("---19.4---")
    val map = mutableMapOf<String, String>()
    map.put("Pen", "ペン")
    map["Apple"] = "アップル"
    map += "Pineaplle" to "パイナップル"
    val value1 =  map["Pen"]
    val value2 =  map["Pineapple"]
    val value3 =  map["Apple"]
    map -= "Pen"
    val value4 =  map["Pen"]
    println("${value1} ${value2} ${value3} ${value4}")


}