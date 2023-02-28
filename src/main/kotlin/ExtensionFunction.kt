fun String.hello() : String {
    return "Hello $this"
}

fun main() {
    val name = "Muslim"
    println(name.hello())
}