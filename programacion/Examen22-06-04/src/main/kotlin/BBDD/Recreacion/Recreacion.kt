package BBDD.Recreacion

import BBDD.Escena.Escena

class Recreacion {
    var lado: String = ""
    var escenas = ArrayList<Escena>()

    constructor()
    constructor(lado: String){
        this.lado = lado
    }

    override fun toString(): String {
        return "Recreacion(lado='$lado', escenas=$escenas)"
    }
}