import kotlin.system.exitProcess

class Hitung(val angka1: Double? = null, val angka2: Double? = null) {
    var hasil = 0.0

    fun penjumlahan() {
        hasil = angka1!! + angka2!!
        println("Hasil ${hasil}")
        return
    }

    fun pengurangan() {
        hasil = angka1!! - angka2!!
        println("Hasil ${hasil}")
    }

    fun pembagian() {
        try {
            hasil = angka1!! / angka2!!
            println("Hasil ${hasil}")
        } catch (e: Exception) {
            println(e.message)
        }
    }

    fun perkalian() {
        hasil = angka1!! * angka2!!
        println("Hasil ${hasil}")
    }
}

fun main(args: Array<String>) {
    var op: Int? = null
    do {
        println("Pilih Operasi :")
        println("1. Penjumlahan")
        println("2. Pengurangan")
        println("3. Pembagian")
        println("4. Perkalian")
        println("5. Keluar")
        print("Operasi : ")
        op = readLine()?.toInt()

        when {
            op != 0 && op!! < 5 -> {
                print("Masukkan angka pertama : ")
                val n1 = readLine()?.toDouble()

                print("Masukkan angka kedua : ")
                val n2 = readLine()?.toDouble()


                when (op) {
                    1 -> Hitung(n1, n2).penjumlahan()
                    2 -> Hitung(n1, n2).pengurangan()
                    3 -> Hitung(n1, n2).pembagian()
                    4 -> Hitung(n1, n2).perkalian()
                }
            }
            op == 5 -> {
                println("Bye...")
                exitProcess(0)
            }
        }
    } while (true)
}