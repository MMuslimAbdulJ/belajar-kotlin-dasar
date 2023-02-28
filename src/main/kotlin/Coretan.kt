//fun main() {
//    val A = 9
//    val B : String = when {
//        A > 10 -> "Lebih dari sepuluh"
//        A < 10 -> "Kurang dari sepuluh"
//        else -> "Angka sama!"
//    }
//    println(B)
//}
//fun main() {
//    val A = "1"
//    val B = when(A) {
//        is String -> "ini String"
//        !is String -> "Ini bukan String"
//        else -> "Tidak diketahui"
//    }
//    println(B)
//}

//fun main() {
//    val namaTeman = arrayOf("Ikhlash", "Danny", "Arfah", "Husni")
//    var i : Int = 0
//    for (nama in namaTeman) {
//        i++
//        print(i.toString() + " ")
//        println(nama)
//    }
//    for (i in 1..5){
//        for (j in i..5){
//            print("*")
//        }
//        println()
//    }
//    println()
//    for (i in 1..5){
//        for (j in 1..i){
//            print("*")
//        }
//        println()
//    }
//    println()
//    for (i in 1..5){
//        for (j in i..4){
//            print(" ")
//        }
//        for (k in 1..i) {
//            print("* ")
//        }
//        println()
//    }
//    println()
//    for (i in 1..5){
//        for (j in 2..i){
//            print(" ")
//        }
//        for (k in 5 downTo i) {
//            print("* ")
//        }
//        println()
//    }
//}

fun toLower(value : String) : String = value.lowercase()
fun main() {
    fun hello(value : String, transformer : (String) -> String) :String {
        return transformer(value)
    }

    val lambdaEx : (String) -> String = {
        it.uppercase()
    }

    val lambdaLow : (String) -> String = ::toLower

    val namaSaya = lambdaEx("muslim")
    println(namaSaya)

    val danny = hello("DANY") {
        it.uppercase()
    }

    val ikhlash = lambdaLow("IKHLASH")

    println(danny)
    println(ikhlash)
}

