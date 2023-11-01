package BBDD.Zombies

import BBDD.Extremidades.Extremidades

class ZombieDefensor: ZombieAtacante {
    var numDisparos: Int = 0
    var disparosRecibidos: Int = 0

    constructor()

    constructor(nombre: String, movilidad: Int, agresividad: Int, disparosRecibidos: Int, extremidades: List<Extremidades>){
        this.nombre = nombre
        this.movilidad = movilidad
        this.agresividad = agresividad
        this.disparosRecibidos = disparosRecibidos
        this.extremidades = extremidades
    }

    constructor(nombre: String, movilidad: Int, disparosRecibidos: Int){
        this.nombre = nombre
        this.movilidad = movilidad
        this.disparosRecibidos = disparosRecibidos
    }


    fun disparosRestantes(): Int{
        return numDisparos - disparosRecibidos
    }

    fun recibirDisparo(){
        disparosRecibidos++
    }

    override fun toString(): String {
        return "${super.toString()}\nNúmero de disparos restantes: ${disparosRestantes()}"
    }
}