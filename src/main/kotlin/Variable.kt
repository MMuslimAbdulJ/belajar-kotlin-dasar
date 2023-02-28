const val APP_VERSION = "1.0.0"
const val AUTHOR = "M Muslim Abdul J"

fun main() {

    println("This App version is $APP_VERSION and the Author of this program is $AUTHOR")

    //TURN ON AND TURN OFF COMMENTS EACH BLOCK OF THE PROGRAM IF YOU WANT TO USE IT

    //cannot change data type
//    var abc = "abc"
//    abc = 123 //error

    //mutable variable
//    var firstName : String = "Muhammad Muslim"
//    var lastName = "Abdul Jabbaar"
//    var fullname = "$firstName $lastName"
//    fullname = "Babang"

    //immutable
//    val firstName : String = "Muhammad Muslim"
//    val lastName = "Abdul Jabbaar"
//    val fullName = "$firstName $lastName"
//    fullName = "Babang" //error


    //nullable
    var variableNull : String? = null

    //wrong access
//    println(variableNull.length)

    //right access
//    println(variableNull?.length)
}