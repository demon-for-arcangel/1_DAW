package BBDD.Objetos

class Objetos {
    var id: Int = 0
    var nombre: String = ""
    var peso: Int = 0
    var peligroso: Boolean = false

    constructor(){}

    constructor(id: Int, nombre: String, peso: Int, peligroso: Boolean){
        this.id = id
        this.nombre = nombre
        this.peso = peso
        this.peligroso = peligroso
    }

    constructor(nombre: String, peso: Int, peligroso: Boolean){
        this.nombre = nombre
        this.peso = peso
        this.peligroso = peligroso
    }

    constructor(nombre: String){
        this.nombre = nombre
    }

    override fun toString(): String {
        return ("Id: $id, Nombre: $nombre, Peso: $peso, Peligroso: $peligroso")
    }
}