fun main() {
//    var i = 0
//    while (true) {
//        i++
//        println("Perulangan ke-$i")
//        if(i == 100) {
//            break
//        }
//    }

    
    for (i in 1..100) {
        if (i % 2 != 0) {
            continue
        }
        println("Angka $i")
    }


}