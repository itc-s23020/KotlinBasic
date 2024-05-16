//package org.example
//
//import kotlin.system.measureTimeMillis
//import kotlin.time.measureTime
//
//fun main(args: Array<String>) {
//    run {
//        println("---18.1---")
//        val s: Set<String> = setOf("あ", "い", "う", "え", "お")
//        println(s)
//    }
//    run {
//        println("---18.2---")
//        val s = mutableSetOf("あ", "い", "う", "え", "お")
//        s +=("か")
//        s +=("き")
//        s +=("く")
//        s +=("い")
//        s +=("お")
//        s +=("か")
//        println(s)
//    }
//    val chaerList = 'a'..'2'
//    val searchCharList = mutableListOf('z','x', 'c', 'v' ,'b' ,'n', 'm')
//    val searchCharSet = mutableSetOf('z','x', 'c', 'v' ,'b' ,'n', 'm')
//    val count = 1_000_000_000L
//    val ListTIme = measureTime{
//        for (i in 1..count){
//            val target =chaerList.shuffled()[0]
//            println("${target}　は存在する？ : ${target} in searchCharList")
//        }
//    }
//    val setTime = measureTime{
//        for (i in 1..count){
//            val target =chaerList.shuffled()[0]
//            println("${target}　は存在する？ : ${target} in searchCharList")
//        }
//    }
//    println("listでかかった時間 ${ListTIme}ms")
//    println("Setでかかった時間 ${setTime}ms")
//}