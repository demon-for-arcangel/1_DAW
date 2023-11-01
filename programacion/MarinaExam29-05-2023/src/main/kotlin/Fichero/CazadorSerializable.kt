package Fichero

import BBDD.Cazador.Cazador
import java.io.EOFException
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class CazadorSerializable {
    companion object{
        fun insertar(n: String, a: List<Cazador>){
            var os: ObjectOutputStream? = null
            try {
                var fs = FileOutputStream(n)
                os = ObjectOutputStream(fs)
                for (i in a){
                    os.writeObject(i)
                }
            }catch(e: FileNotFoundException){
                e.printStackTrace()
            }catch (e: IOException){
                e.printStackTrace()
            }finally{
                os?.close()
            }
        }

        fun leer(n: String): List<Cazador>{
            val lista = ArrayList<Cazador>()
            var fis: FileInputStream? = null
            var ois: ObjectInputStream? = null

            try{
                fis = FileInputStream(n)
                ois = ObjectInputStream(fis)
                while (true){
                    var a1 = ois.readObject()
                    lista.add(a1 as Cazador)
                    print(a1)
                }
            }catch(e: FileNotFoundException){
                e.printStackTrace()
            }catch(e: EOFException){
                e.printStackTrace()
            }catch(e: IOException){
                e.printStackTrace()
            }catch(e: ClassNotFoundException){
                e.printStackTrace()
            }finally {
                ois?.close()
                fis?.close()
                ois?.close()
                return lista
            }
        }
    }
}