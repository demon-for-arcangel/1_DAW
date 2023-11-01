package BBDD.Usuario

import java.io.Serializable
import java.time.LocalDate

class Usuario: Serializable {
    var id: Int = 0
    var nombre: String = ""
    var fecha_nacimiento: String = ""

    constructor(id: Int, nombre: String, fecha_nacimiento: String) {
        this.id = id
        this.nombre = nombre
        this.fecha_nacimiento = fecha_nacimiento
    }

    override fun toString(): String {
        return "$id - $nombre"
    }
}