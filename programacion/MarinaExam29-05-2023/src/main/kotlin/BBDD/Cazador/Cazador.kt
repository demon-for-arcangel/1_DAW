package BBDD.Cazador

import BBDD.ZombieNormal.ZombieNormal
import Fichero.CazadorSerializable
import BBDD.Pistola.Pistola

class Cazador {
    var contadorCazadores = 0
    var nombre: String = "Cazador ${contadorCazadores++}"
    var apellido: String = ""
    var zombiesCazados: ArrayList<ZombieNormal> = arrayListOf()
    var pistolas: ArrayList<Pistola> = arrayListOf()

    constructor(){}
    constructor(nom: String, ape: String){
        nombre = nom
        apellido = ape
    }

    fun cazarZombie(zombie: ZombieNormal){
        zombiesCazados.add(zombie)
    }

    fun mostrarZombiesCazados(){
        println("Zombies cazados por $nombre: ")
        for (zombie in zombiesCazados){
            println("- ${zombie.nombre}")
        }
    }

    fun almacenarZombiesCazadosFichero(){
        val file = CazadorSerializable
    }

    fun agregarPistola(pistola: Pistola){
        if (pistolas.size < 3){
            pistolas.add(pistola)
            println("Pistola ${pistola.tipo} agregada a $nombre")
        }else{
            println("No se puede agregar más pistolas.")
        }
    }

    fun mostrarPistolas(){
        println("Pistolas de $nombre")
        for (pistola in pistolas){
            println("- Tipo: ${pistola.tipo}. Disparos restantes: ${pistola.disparosRestantes}")
        }
    }
}