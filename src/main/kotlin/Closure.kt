fun main() {
    var counter : Int = 0
    val lambdaIncerement : () -> Unit = {
        println("Lambda increment")
        counter++
    }

    val anonymousIncrement = fun() : Unit {
        println("Anonymous increment")
        counter++
    }

    fun functionIncrement() :Unit {
        println("Function increment")
        counter++
        val namaSaya = "Muslim"
    }
    
    lambdaIncerement()
    anonymousIncrement()
    functionIncrement()
    println(counter)

}