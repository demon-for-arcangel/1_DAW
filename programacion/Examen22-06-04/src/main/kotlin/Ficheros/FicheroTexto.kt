package Ficheros

import BBDD.Tesela.TeselaReal
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter

class FicheroTexto {
    fun escribir(tesela: TeselaReal, nombreArchivo: String) {
        val contenido = tesela.toString()

        try {
            val file = File(nombreArchivo)
            val printWriter = PrintWriter(FileWriter(file))

            printWriter.println(contenido)

            printWriter.close()
        } catch (e: Exception) {
            e.printStackTrace()
            throw e
        }
    }
}