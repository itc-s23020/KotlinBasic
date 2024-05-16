
fun main(args: Array<String>) {
    printTimes(2,3,4,5)
    printTimes(1,2,100)
//    run {
//        val answer: Int = getThreeTimes(5)
//        //val answer2: Int = getThreeTimes(5.2) error
//        println(answer)
//    }
//    run {
//        val answer: Int = getTimes(2, 3)
//        println(answer)
//
//    }
    run {
        val answer: Unit = getTimes(2, 3, 4)
        println("変数 answerの値:$answer")
    }
}
    //関数の定義
//fun getThreeTimes(value:Int):Int {
//    return value * 3
//}
    fun getThreeTimes(value: Int): Int = value * 3 //上と一緒 Int型が返されることを自分も考えないといけな
    //fun getTimes(x: Int, y: Int): Int {
     //   return x * y
   // }
fun getTimes(x: Int, y: Int, z:Int): Unit {
    println("パラメータとして、${x}と${y}と${z}を受け取りました")
        println("これらの値を全部掛け算した答えは${x * y * z}です。" )
}
fun printTimes(vararg numbers: Int) {
    var result = 1
    for (x in numbers) result *= x
    println("-------------------")
    println("全ての数値を掛け算した結果：$result")
    println("")
}
