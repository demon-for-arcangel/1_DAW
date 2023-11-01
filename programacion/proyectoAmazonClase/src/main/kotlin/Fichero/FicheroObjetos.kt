package Fichero

import BBDD.Objetos.Objetos
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.lang.Exception

class FicheroObjetos {
    companion object{
        fun leer(fichero: String): List<Objetos>{
            val lista = ArrayList<Objetos>()
            val file = File(fichero)

            val lineas = file.readLines()
            for (linea in lineas){
                lista.add(Objetos(linea))
                println(linea)
            }
            return lista
        }

        fun escribir(fichero: String, obj: List<Objetos>){
            try{
                val ruta = fichero
                val fw = FileWriter(ruta, false)
                val salida = PrintWriter(fw)
                for (a in obj){
                    salida.println(a.nombre)
                }
                salida.flush()
                salida.close()
            }catch(e: Exception){
                println(e.message)
            }
        }
    }
}