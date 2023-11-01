package Fichero

import BBDD.Zombies.Zombie
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter

class FicheroZombie {
    companion object{
        fun escribir(fichero: String, zombies: List<Zombie>){
            try{
                val ruta = fichero
                val fw = FileWriter(ruta, false)
                val salida = PrintWriter(fw)

                for (a in zombies){
                    salida.println(a.nombre)
                    //salida.write(a.nombre)
                }
                salida.flush()
                salida.close()
            }catch(e: Exception){
                println(e.message)
            }
        }

        fun leer(fichero: String): ArrayList<Zombie>{
            val lista = ArrayList<Zombie>()
            val file = File(fichero)

            val lineas = file.readLines()
            for (linea in lineas){
                lista.add(Zombie(linea))
                println(linea)
            }
            return lista
        }
    }
}