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

        // TODO : Benerin!! Input angkanya masih ngawur belum sesuai OOP!!
        when (op) {
            1 -> {
                print("Masukkan angka pertama : ")
                val n1 = readLine()?.toDouble()

                print("Masukkan angka kedua : ")
                val n2 = readLine()?.toDouble()

                Hitung(n1, n2).penjumlahan()
            }
            2 -> {
                print("Masukkan angka pertama : ")
                val n1 = readLine()?.toDouble()

                print("Masukkan angka kedua : ")
                val n2 = readLine()?.toDouble()

                Hitung(n1, n2).pengurangan()
            }
            3 -> {
                print("Masukkan angka pertama : ")
                val n1 = readLine()?.toDouble()

                print("Masukkan angka kedua : ")
                val n2 = readLine()?.toDouble()

                Hitung(n1, n2).pembagian()
            }
            4 -> {
                print("Masukkan angka pertama : ")
                val n1 = readLine()?.toDouble()

                print("Masukkan angka kedua : ")
                val n2 = readLine()?.toDouble()

                Hitung(n1, n2).perkalian()
            }
            5 -> exitProcess(0)
        }
    } while (op != 5)
}