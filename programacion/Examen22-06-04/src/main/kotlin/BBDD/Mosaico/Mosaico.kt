package BBDD.Mosaico

import BBDD.Recreacion.Recreacion

class Mosaico {
    var tipo: String = ""
    var localizacion: String = ""
    var anioCreacion: Int = 0
    var recreaciones = ArrayList<Recreacion>()

    constructor()
    constructor(tipo: String, localizacion: String, anioCreacion: Int){
        this.tipo = tipo
        this.localizacion = localizacion
        this.anioCreacion = anioCreacion
    }

    override fun toString(): String {
        return "Mosaico(tipo='$tipo', localizacion='$localizacion', anioCreacion=$anioCreacion, recreaciones=$recreaciones)"
    }
}