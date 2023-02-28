fun main() {
    fun hello(value : String, transformer : (String) -> String) : String {
        return transformer(value)
    }



    val anoFun = fun(value : String) : String {
        if(value.isBlank()){
            return "Ups"
        }
        return value.uppercase()
    }

    val namaSaya = hello("muslim", anoFun)
    println(namaSaya)
    val namaSaya2 = hello("", anoFun)
    println(namaSaya2)

}