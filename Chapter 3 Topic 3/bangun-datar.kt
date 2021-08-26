fun hitungLuas(panjang: Int, lebar:Int): Int {
        return panjang*lebar
    }
fun luasSegitiga(alas: Int, tinggi: Int): Double {
    return (0.5 * alas * tinggi)
}

fun main(args: Array<String>) {
    println("Luas persegi: " +hitungLuas(20,10))
    println("Luas segitiga: " +luasSegitiga(10,4))


    print("Panjang persegi: ")
    var panjang1: Int = readLine()!!.toInt()
    return if (panjang1?.toString()) {

    }

    print("lebar persegi: ")
    var lebar2: Int = readLine()!!.toInt()

    val luasPersegi = panjang1*lebar2

    println("Luas persegi adalah $luasPersegi")
}


