package BBDD.Equipo

import java.time.LocalDate

class Equipo {
    var nombre: String = ""
    var miembro: String = ""

    constructor(){}

    constructor(n: String, m: String){
        this.nombre = n
        this.miembro = m
    }

    override fun toString(): String {
        return "Nombre: $nombre, Miembro: $miembro"
    }
}