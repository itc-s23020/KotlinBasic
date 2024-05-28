fun main (args : Array<String>){
run {
    println("---23.4---")
    val p = Person3()
}
    run {
        println("---23.5---")
        val p = Person3()
        p.name = "タケシ"
        p.age = 35
        p.dream ="ポケモンマスター"
        p.great()
    }
    run {
        val p = Person3()
        p.name = "タケシ"
        p.age = 5
        p.dream ="ポケモンマスター"

        println("---23.6---")
        val p1 = Person3()
        p1.name = "ゲンタ"
        p1.age = 6
        p1.dream ="うな重"

        val p2 = Person3()
        p2.name = "ユミ"
        p2.age = 6
        p2.dream ="立派な矢を打つこと"

        p.great()
        p1.great()
        p2.great()
    }
}
//名前以外何も決めていないクラス
class Person1
//プロパティ属性）（だけを定義したクラス
class Person2 {
    var name = ""
    var age = 0
}
//プロパティとメソッド（関数）を定義したクラス
class Person3 {
    var name = ""
    var age = 0
    var dream = ""

    fun great() {
        println("こんにちは、私の名前は${name}です。　年齢は、${age}歳です。夢は${dream}です")
    }
}