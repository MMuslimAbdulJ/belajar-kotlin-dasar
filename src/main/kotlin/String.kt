fun main() {
    var firstName : String = "Muhammad"
    var lastName : String = "Muslim"
    var address : String = """
        Jalan Ciheulang,
        Kabupaten Cianjur
        Jawa Barat
        Indonesia
    """.trimIndent()

    //versi dulu
//var address : String = """
//        |Jalan Ciheulang,
//        |Kabupaten Cianjur
//        |Jawa Barat
//        |Indonesia
//    """.trimMargin()

    var fullName : String = "$firstName $lastName"

    println(firstName)
    println(lastName)
    println(fullName)
    println(address)

    var desc : String = "Total $fullName char is ${fullName.length}"
    println(desc)

}