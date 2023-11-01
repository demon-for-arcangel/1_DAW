package BBDD.ZombieNormal

import java.io.Serializable

open class ZombieNormal: Serializable {
    var movilidad: Int = 0
    var nombre: String = ""

    constructor(){}
    constructor(mov: Int, nom: String){
        this.movilidad = mov
        this.nombre = nom
    }
    constructor(nom: String)

    fun autonomo(): Boolean{
        return movilidad > 40
    }
/*
    open fun comprobarMovilidad(){
        when (movilidad){
            100 -> println("El zombie se puede mover normalmente.")
            0 -> println("El zombie no se puede mover.")
            in (40..100) -> println("El zombie es autónomo")
            else -> println("El zombie no es autónomo")
        }
    }*/
    override fun toString(): String {
        return "$movilidad $nombre"
    }
}