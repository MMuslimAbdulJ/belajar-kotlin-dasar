inline fun hello(firstName : () -> String, noinline lastName : () -> String) : String {
    return "${firstName()} ${lastName()}"
}

fun main() {

    println(hello({"M Muslim"}, {"Abdul J"}))

}