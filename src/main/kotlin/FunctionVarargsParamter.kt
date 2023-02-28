fun totalValue(name : String, vararg values : Int) : Unit {
    var total = 0
    for (i in values) {
        total += i
    }
    println("$name = ${total}")
}

fun main() {
    totalValue("Hasil", 1,2,3,4,5)
}