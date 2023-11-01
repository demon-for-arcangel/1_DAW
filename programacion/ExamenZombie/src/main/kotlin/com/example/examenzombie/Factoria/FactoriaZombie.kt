package com.example.examenzombie.Factoria

import BBDD.Zombies.Zombie
import BBDD.Zombies.ZombieAtacante
import BBDD.Zombies.ZombieDefensor
import Servicio.ServicioExtremidades
import kotlin.random.Random

class FactoriaZombie {
    fun crearZombie(): ArrayList<Zombie> {
        var movilidad: Int
        val zombies = ArrayList<Zombie>()
        val ListaExtremidades = ServicioExtremidades()

        var contador = 0
        val numeroZombies = 5

        while(contador < numeroZombies) {
            val tipoZombie = Random.nextInt(2)// 0 para ZombieAtacante, 1 para ZombieDefensor
            val nombre: String = generarNombreZombie()
            movilidad = Random.nextInt(101) //valor aleatorio entre 0 y 100

            when (tipoZombie) {
                0 -> {
                    val agresividad = Random.nextInt(11) //valor aleatorio entre 0 y 10
                    val extremidades = ListaExtremidades.seleccionExtremidad()
                    zombies.add(ZombieAtacante(nombre, movilidad, agresividad, extremidades))
                }

                else -> {
                    val disparosRestantes = Random.nextInt(1, 11) //Valor aleatorio entre 1 y 10
                    val agresividad = Random.nextInt(11)
                    val extremidades = ListaExtremidades.seleccionExtremidad()
                    zombies.add(ZombieDefensor(nombre, movilidad, agresividad, disparosRestantes, extremidades))
                }
            }
            contador++
        }
        return zombies
    }

    fun generarNombreZombie(): String {
        val numeros = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
        val nombre = "Zombie " + numeros.random()
        return nombre
    }
}