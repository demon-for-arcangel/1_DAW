package Ficheros

import java.io.*

class FicheroSerializable {
    fun guardarCajaPeligrosa(caja: String) {
        try {
            val file = File("Fichero_Peligroso.ser")
            val fileOutputStream = FileOutputStream(file)
            val objectOutputStream = ObjectOutputStream(fileOutputStream)

            objectOutputStream.writeObject(caja)

            objectOutputStream.close()
            fileOutputStream.close()
        } catch (e: IOException) {
            println(e.message)
        }
    }

    fun cargarCajaPeligrosa(): String {
        var cajaPeligrosa: String = ""

        try {
            val file = File("Fichero_Peligroso.ser")
            if (file.exists()) {
                val fileInputStream = FileInputStream(file)
                val objectInputStream = ObjectInputStream(fileInputStream)

                cajaPeligrosa = objectInputStream.readObject() as String

                objectInputStream.close()
                fileInputStream.close()
            }
        } catch (e: IOException) {
            println(e.message)
        } catch (e: ClassNotFoundException) {
            println(e.message)
        } finally {
            return cajaPeligrosa
        }
    }
}
