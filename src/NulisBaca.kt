import java.io.FileReader
import java.io.FileWriter
import kotlin.system.exitProcess

class Proses() {
    fun writeFile(str: String? = null) {
        try {
            var fOut = FileWriter("src/text.txt", true)
            fOut.write(str)
            fOut.close()
        } catch (e: Exception) {
            println(e.message)
        }
    }

    fun readFile() {
        try {
            var fIn = FileReader("src/text.txt")
            var c: Int? = null
            do {
                c = fIn.read()
                print(c.toChar())
            } while (c != -1)
        } catch (e: Exception) {
            println(e.message)
        }
    }
}

fun main(args: Array<String>) {
    var sel: Int? = null
    while (sel != 3) {
        println("Pilih salah satu aksi :")
        println("1. Tulis File")
        println("2. Baca File")
        println("3. Keluar")
        print("Pilih : ")
        sel = readLine()?.toInt()

        when (sel) {
            1 -> {
                print("Masukkan teks : ")
                val mT = readLine().toString()
                Proses().writeFile(mT)
            }
            2 -> {
                Proses().readFile()
            }
            3 -> exitProcess(0)
        }
    }
}