fun main(args: Array<String>) {
//    run {
//        println("---22.1---")
//        val text = "あいうえお"
//        val number = text.toInt()
//        println("number = ${number}")
//    }
    run {
        println("---22.2---")
        val text = "-12345"
        //textチェックした
        //チェックの結果問題なければ進む
        val number = text.toInt()
        println("number = ${number}")
    }
    run {
        println("---22.3---")
        print("input: ")
        val text = readln()
        try {
            val numbers = text.toInt()
            println("numbers = $numbers")
        } catch (e: NumberFormatException) {
            println("「${text}」という文字はせ整数値に変換できません")
        }
        run {
            print("---22.4---")
            try {
                val numbers = args[0].toInt()
                println("numbers = $numbers")
            } catch (e: NumberFormatException) {
                println("「${args[0]}」という文字はせ整数値に変換できません") } catch (e: ArrayIndexOutOfBoundsException) {
                println("文字を入力してください")
            } catch (e: ArrayIndexOutOfBoundsException) {
                println("文字を入力してください")
            } catch (e: Exception) {
                println("想定外の何かが発生しました")
            }
            run {
                print("---22.7---")
                try {
                val numbers = text.toInt()
                    println("numbers = $numbers")
                } catch (e: ArrayIndexOutOfBoundsException) {
                    println("文字を入力してください")
                }finally {
                    println("ありがとう")
                }
            }
        }
    }
}