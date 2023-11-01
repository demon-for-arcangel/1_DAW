package BBDD.Usuario

import java.time.LocalDate

class Usuario {
    var nombre: String = ""
    var primerApellido: String = ""
    var segundoApellido: String = ""
    var fechaNacimiento = LocalDate.now()
    var numeroPersonal: Int = 0

    constructor(){}

    constructor(n: String, p: String, s: String, f: LocalDate, id: Int){
        this.nombre = n
        this.primerApellido = p
        this.segundoApellido = s
        this.fechaNacimiento = f
        this.numeroPersonal = id
    }

    constructor(string: String?, string1: String?, string2: String?, toLocalDate: LocalDate?, int: Int, string3: String?)
    constructor(numeroPersonal: String)

    override fun toString(): String {
        return "Nombre: $nombre, Apellidos: $primerApellido $segundoApellido, fecha de nacimiento: $fechaNacimiento, numero personal: $numeroPersonal"
    }
}