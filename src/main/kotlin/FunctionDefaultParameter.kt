fun hello(firstName : String, lastName : String = "") {
    println("Hello $firstName $lastName")
}

fun main() {
    hello("Muslim")
    hello("M", "Muslim")
}