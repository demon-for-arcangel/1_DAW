package com.example.examenzombie

import BBDD.Cazador.Cazador
import BBDD.Constantes
import BBDD.Zombies.Zombie
import BBDD.Zombies.ZombieAtacante
import BBDD.Zombies.ZombieDefensor
import Fichero.CazadorSerializable
import Fichero.FicheroZombie
import Servicio.ServicioCazador

class Juego {
    var cazador: Cazador? = null
    var zombies = ArrayList<Zombie>()
    var fichero = FicheroZombie()

    init{
        zombies.addAll(FicheroZombie.leer(Constantes.FicheroZombie))
    }

    fun simulacion(){
        cazador = CazadorSerializable.leer("cazador")
        var eleccionPistola= 0
        var horas:Int=0
        var peleas:Int=0

        while (horas > 24){
            while (peleas < 5){
                eleccionPistola = (0..3).random()
                val zombie = zombies[peleas]
                var agresividadNecesaria: Int = (0..100).random()
                if (cazador?.zombiesCazados?.contains(zombie) == true){
                    when (zombie){
                        is ZombieAtacante -> {
                            if (zombie.tareaAdecuada(agresividadNecesaria) && zombie.movilidad < 40){ //Error
                                val disparo = cazador?.pistolas?.get(eleccionPistola)?.Tiro()
                                if (disparo != null) {
                                    if (disparo >= 90){
                                        cazador?.cazarZombie(zombie)
                                        println(zombie)
                                    }
                                }else if(zombie.movilidad >= 40){
                                    val disparo = (0..100).random()
                                    if (disparo >= 75){
                                        cazador?.cazarZombie(zombie)
                                        println(zombie)
                                    }
                                }
                            }
                        }
                        is ZombieDefensor -> {
                            val disparo = (0..100).random()
                            if (disparo >= 80){
                                cazador?.cazarZombie(zombie)
                                println(zombie)
                            }
                        }
                    }
                }
            }
            peleas++
        }
        horas++
    }

    fun historial(cazador: Cazador, zombies: ArrayList<Zombie>): String{
        val zombiesCazados = cazador.informeZombiesCazados()
        val zombiesDisparados = zombies.joinToString(" "){ it.nombre}
        return "El Cazador ${cazador.nombre} ${cazador.apellido} ha disparado a los zombies: $zombiesDisparados de los cuales ha matado $zombiesCazados ."
    }
}