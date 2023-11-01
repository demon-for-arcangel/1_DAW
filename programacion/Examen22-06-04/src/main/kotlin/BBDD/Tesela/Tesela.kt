package BBDD.Tesela

import java.io.Serializable

open class Tesela: Serializable {
    var id: Int = 0 //creamos el atributo id para que tengamos una clave primaria
    var material: String = ""
    var color: String = ""
    var ancho: Int = 0
    var largo: Int = 0
    var colocacion: String = ""

    constructor()
    constructor(id: Int, material: String, color: String, ancho: Int, largo: Int, colocacion: String){
        this.id = id
        this.material = material
        this.color = color
        this.ancho = ancho
        this.largo = largo
        this.colocacion = colocacion
    }

    override fun toString(): String {
        return "Tesela(id = '$id', material='$material', color='$color', ancho=$ancho, largo=$largo, colocacion='$colocacion')"
    }
}