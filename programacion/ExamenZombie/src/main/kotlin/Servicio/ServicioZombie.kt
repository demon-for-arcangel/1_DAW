package Servicio

import BBDD.Constantes
import BBDD.Zombies.Zombie
import Fichero.FicheroZombie
import com.example.examenzombie.Factoria.FactoriaZombie

class ServicioZombie {
    private val zombie = FactoriaZombie()

    fun crearZombie(): ArrayList<Zombie> {
        return zombie.crearZombie()
    }

    fun guardarZombieEnArchivo(archivo: String, zombies: ArrayList<Zombie>){
        FicheroZombie.escribir(archivo, zombies)
    }

    fun seleccionarZombie(): List<Zombie>{
        return FicheroZombie.leer(Constantes.FicheroZombie)
    }
}