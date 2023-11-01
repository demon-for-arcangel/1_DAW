package com.example.marinaexam29052023

import BBDD.ZombieAtacante.ZombieAtacante
import BBDD.ZombieDefensor.ZombieDefensor
import BBDD.ZombieNormal.ZombieNormal
import kotlin.random.Random
import kotlin.random.nextInt

class FactoriaZombie {
    companion object{
        fun crearZombieAtacanteAleatorio(): ZombieAtacante{
            var contador = 0
            val nombre = "Zombie ${contador++}"
            val movilidad = Random.nextInt(0..100)
            val agresividad = Random.nextInt(0..100)

            return ZombieAtacante(movilidad, nombre, agresividad)
        }

        fun crearZombieDefensorAleatorio(): ZombieDefensor {
            var contador = 0
            val nombre = "Zombie ${contador++}"
            val movilidad = Random.nextInt(0..100)
            val agresividad = Random.nextInt(0..100)
            val disparosRestantes = Random.nextInt(0..8)

            return ZombieDefensor(movilidad, nombre, agresividad, disparosRestantes)
        }
    }
}