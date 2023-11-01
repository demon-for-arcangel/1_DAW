package BBDD.ZombieDefensor

import BBDD.ZombieAtacante.ZombieAtacante

class ZombieDefensor: ZombieAtacante {
    var disparosRestantes: Int = 0

    constructor(){}
    constructor(string: String?)
    constructor(movilidad: Int, nombre: String, agresividad: Int, disparosRestantes: Int)

    fun disparosRestantes(): Int{
        return disparosRestantes
    }
}