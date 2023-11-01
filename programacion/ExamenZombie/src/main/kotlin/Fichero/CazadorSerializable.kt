package Fichero

import BBDD.Cazador.Cazador
import java.io.*

class CazadorSerializable(cazadorActual: Cazador) {
    companion object {
        fun insertar(nombre: String, cazador: Cazador) {
            var os: ObjectOutputStream? = null
            try {
                var fs = FileOutputStream(nombre)
                os = ObjectOutputStream(fs)
                os.writeObject(cazador)
            } catch (e: FileNotFoundException) {
                e.printStackTrace();
            } catch (e: IOException) {
                e.printStackTrace();
            } finally {
                os?.close();
            }
        }

        fun leer(nombre: String): Cazador? {
            var cazador: Cazador? = null
            var fis: FileInputStream? = null
            var ois: ObjectInputStream? = null

            try {
                fis = FileInputStream(nombre)
                ois = ObjectInputStream(fis)
                cazador = ois.readObject() as Cazador
            } catch (e: FileNotFoundException) {
                e.printStackTrace()
            } catch (e: IOException) {
                e.printStackTrace()
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            } finally {
                ois?.close()
                fis?.close()
            }

            return cazador
        }
    }
}