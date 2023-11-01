package Ficheros

import BBDD.Tesela.TeselaReal
import java.io.*

class FicheroSerializable {
    fun guardar(objeto: TeselaReal, nombreArchivo: String) {
        FileOutputStream(nombreArchivo).use { fileOutputStream ->
            ObjectOutputStream(fileOutputStream).use { objectOutputStream ->
                objectOutputStream.writeObject(objeto)
            }
        }
    }
}