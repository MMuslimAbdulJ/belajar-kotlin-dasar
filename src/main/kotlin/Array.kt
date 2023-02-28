fun main() {
    val name: Array<String> = arrayOf("Muhammad", "Muslim", "Abdul", "Jabbaar")
    val birthday: Array<Int> = arrayOf(22, 4, 1999)
    val hobbies: Array<String> = arrayOf("Coding", "Music")

    name.set(3, "Qadir")

    val firstName: String = name[0]
    val lastName: String = name.get(1)
    val fullName: String = "$firstName $lastName"

    //nullable array
    val nullableArray : Array<Int?> = arrayOfNulls(size = 4)
    nullableArray.set(0, 1)
    nullableArray.set(1, null)
    nullableArray.set(2, null)
    nullableArray.set(3, 4)
    println(nullableArray.size)
}