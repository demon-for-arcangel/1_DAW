package BBDD.Ciudades

class Ciudades {
    var nombre: String = ""
    var id: Int = 0

    constructor(){}

    constructor(id: Int, nombre: String){
        this.id = id
        this.nombre = nombre
    }

    override fun toString(): String {
        return "$id $nombre"
    }
}