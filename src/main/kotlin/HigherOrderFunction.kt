fun main() {

    fun hello(name : String, transformer : (String)->String) : String {
        val result = transformer(name)
        return result
    }

    val lambdaEx : (String) -> String = {value : String ->
        value.lowercase()
    }

    val namaSaya1 = hello("MUSLIM", lambdaEx)
    val namaSaya2 = hello("ikhlash") { value: String ->
        value.uppercase()
    }

    println(namaSaya1)
    println(namaSaya2)

}