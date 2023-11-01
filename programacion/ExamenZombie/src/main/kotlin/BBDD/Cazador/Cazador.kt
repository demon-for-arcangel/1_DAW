package BBDD.Cazador

import com.example.examenzombie.Pistola.Pistola
import BBDD.Zombies.Zombie
import Fichero.CazadorSerializable
import java.io.FileOutputStream
import java.io.IOException
import java.io.ObjectOutputStream
import java.io.Serializable

class Cazador: Serializable{
    var nombre: String = "Cazador $contadorCazadores"
    var apellido: String = ""
    var zombiesCazados = ArrayList<Zombie>()
    var pistolas = ArrayList<Pistola>()

    companion object{
        var contadorCazadores: Int = 1
        var cazadorActual: Cazador? = null

        fun obtenerCazador(): Cazador?{
            return cazadorActual
        }

        fun cambiarCazador(apellido: String){
            cazadorActual = Cazador(apellido)
        }
    }

    init{
        contadorCazadores++
    }

    constructor()

    constructor(nombre: String, apellido: String): this(apellido){
        this.nombre = nombre
        this.apellido = apellido
    }

    constructor(apellido: String){
        this.apellido = apellido
    }

    fun cazarZombie(zombie: Zombie){
        zombiesCazados.add(zombie)
    }

    fun informeZombiesCazados(): Int{
        println("Zombies Cazados por $nombre: ")
        for (zombie in zombiesCazados){
            println("- $zombie")
        }
        return zombiesCazados.size
    }

    fun agregarPistola(pistola: Pistola): String{
        if (pistolas.size < 3){
            pistolas.add(pistola)
            return ("Pistola agregada a $nombre")
        }else{
            return ("No se pueden agregar más pistolas. Se ha alcanzado el máximo.")
        }
    }

    fun guardarZombiesCazador(nombreArchivo: String){
        try {
            if (cazadorActual != null){
                val cazadorSerializable = CazadorSerializable(cazadorActual!!)
                val fileOutputStream = FileOutputStream(nombreArchivo)
                val objectOutputStream = ObjectOutputStream(fileOutputStream)
                objectOutputStream.writeObject(cazadorSerializable)
                objectOutputStream.close()
                fileOutputStream.close()
                println("Zombies cazados por $nombre guardados en el archivo $nombreArchivo")
            }else{
                println("No hay cazador actual para guardar")
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}