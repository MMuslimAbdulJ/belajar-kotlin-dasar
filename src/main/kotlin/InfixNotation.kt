infix fun String.to(type : String) : String {
    if(type == "UP") {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

fun String.helloMen() : String {
    return "Hello $this"
}

fun main() {
    val hasil = "muslim" to "UP"
    println(hasil.hello())
}