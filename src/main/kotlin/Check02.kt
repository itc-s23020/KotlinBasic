package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
    var win = 0
    var lose= 0
    var draw = 0
 //   for(i in 0 < .. < count) {
    println("1:グー、2:チョキ、3:パー を選んでください")
    val player = readln().toInt() - 1

    //CPUの手をランダムで決める
    val result = when (Random.nextInt(0, 100)) {
        in 0..10 -> 2
        in 10..15 -> 0
        else -> 1
    }

//CPUの手を計算で決める
    val cpu = (player + result) % 3

    val judge = when (result) {
        0 -> "一旦ね"
        1 -> "ちひろ弱"
        else -> "最強、最高の個性で君を殴る"
    }
    println("CPU ${cpu + 1} --- $judge")

}
