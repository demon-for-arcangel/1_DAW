package Ficheros

import com.example.marinaexamen05062023.Maquinas.MaquinaGenerica
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.lang.Exception

class FicheroTexto {
    fun escribirTexto(fichero:String, generica:List<MaquinaGenerica>){
        try {
            val ruta = fichero
            val fw = FileWriter(ruta, false)
            val salida = PrintWriter(fw)
            for(a in generica) {
                salida.println(a.identificador)
            }
            salida.flush()
            salida.close()
        } catch (e: Exception) {
            println(e.message)
        }
    }
}