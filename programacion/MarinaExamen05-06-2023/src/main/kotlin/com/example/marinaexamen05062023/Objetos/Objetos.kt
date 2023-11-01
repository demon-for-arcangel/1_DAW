package com.example.marinaexamen05062023.Objetos

class Objetos {
    var id: Int = 0
    var nombre: String = ""
    var peso: Double = 0.0
    var peligroso: Int = 0

    constructor(){}

    constructor(id: Int, nombre: String, peso: Double, peligroso: Int){
        this.id = id
        this.nombre = nombre
        this.peso = peso
        this.peligroso = peligroso
    }

    override fun toString(): String {
        return "Objeto(id=$id, nombre=$nombre, peso=$peso, peligroso=$peligroso)"
    }
}