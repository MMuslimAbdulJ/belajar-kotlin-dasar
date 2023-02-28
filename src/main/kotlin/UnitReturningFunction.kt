fun printHello(name : String?) : Unit {
    if(name == null) {
        println("Hello")
    } else {
        println("Hello $name")
    }
}

fun main() {
    printHello("Muslim")
}
