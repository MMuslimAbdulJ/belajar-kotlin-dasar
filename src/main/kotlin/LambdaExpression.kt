fun hurufBesar(value : String) : String = value.uppercase()

fun main() {
    val lambdaName : (String) -> String = {
        it.uppercase()
    }

    val fullName : (String, String) -> String = {firstName : String, lastName : String ->
        val result = "Hello, $firstName $lastName"
        result
    }

    val lambdaUpper : (String) -> String = ::hurufBesar

    val nama = lambdaName("muslim")
    println(nama)

    val namaSaya = fullName("Muhammad", "Muslim")
    println(namaSaya)

    val namaUp = lambdaUpper("muslim")
    println(namaUp)


}