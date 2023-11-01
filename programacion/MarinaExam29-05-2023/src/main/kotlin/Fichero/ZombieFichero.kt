package Fichero

import BBDD.ZombieNormal.ZombieNormal
import java.io.File

class ZombieFichero {
    companion object {
        fun leer(fichero: String): List<ZombieNormal>{
            val lista = ArrayList<ZombieNormal>()
            val file = File(fichero)
            val lineas = file.readLines()
            for (nom in lineas){
                lista.add(ZombieNormal(nom))
                println(nom)
            }
            return lista
        }
    }
}