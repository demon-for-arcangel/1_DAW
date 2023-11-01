package BBDD.Destinos

class Destino {
    var id: Int = 0
    var nombre: String = ""

    constructor(){}

    constructor(id: Int, nombre: String){
        this.id = id
        this.nombre = nombre

    }

    override fun toString(): String {
        return "$id - $nombre"
    }
}