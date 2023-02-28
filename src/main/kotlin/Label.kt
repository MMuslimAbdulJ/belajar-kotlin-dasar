fun labelContinue() : Unit {
    loopI@for (i in 1..10){
        loopJ@for (j in 1..10){
            println("$i x $j = ${i * j}")
            if (j == 5) {
                continue@loopI
            }
        }
    }
}

fun labelBreak() : Unit {
    loopI@for (i in 1..10){
        loopJ@for (j in 1..10){
            println("$i x $j = ${i * j}")
            if(i > 5){
                break@loopI
            }
        }
    }
}


fun main() {
    fun test(name : String, operation : (String) -> Unit) : Unit = operation(name)
//    labelContinue()
//    labelBreak()
   test("Muslim") testLabel@{
        if (it == "") {
            return@testLabel
        }else {
            println("String kosong!")
        }
    }

}
