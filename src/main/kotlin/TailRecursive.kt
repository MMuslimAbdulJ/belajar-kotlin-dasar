fun main() {

    tailrec fun display(value : Int) : Unit {
        println("Recursive-$value")
        if(value > 0){
            display(value - 1)
        }
    }

    tailrec fun recursiveFactorial(value : Int, total : Int = 1) : Int {
        return when {
            value == 1 -> total
            else -> recursiveFactorial(value - 1, total * value)
        }
    }

    display(10)
    println(recursiveFactorial(5))
}