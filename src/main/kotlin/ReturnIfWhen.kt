fun main() {
    fun hello(name : String = "") : String {
        return if(name == ""){
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }

    fun helloToo(name : String = "") : String {
        return when{
            name == "" -> "Hello Bro"
            else -> "Hello $name"
        }
    }

    println(hello())
    println(hello("Muslim"))
    println(helloToo())
    println(helloToo("Ikhlash"))
}