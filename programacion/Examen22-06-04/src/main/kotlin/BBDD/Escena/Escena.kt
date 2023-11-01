package BBDD.Escena

import BBDD.Tesela.Tesela

class Escena {
    var numFilas: Int = 0
    var numColumnas: Int = 0
    var numTeselas: Int = 0
    var orden: Int = 0
    var diosesParticipantes = ArrayList<String>()
    var ideaPrincipal: String = ""
    var teselas = ArrayList<Tesela>()

    constructor()
    constructor(numFilas: Int, numColumnas: Int, numTeselas: Int, orden: Int, dioses: ArrayList<String>, ideaPrincipal: String) {
        this.numFilas = numFilas
        this.numColumnas = numColumnas
        this.numTeselas = numTeselas
        this.orden = orden
        diosesParticipantes = dioses
        this.ideaPrincipal = ideaPrincipal
    }

    override fun toString(): String {
        return "Escena(numFilas=$numFilas, numColumnas=$numColumnas, numTeselas=$numTeselas, orden=$orden, diosesParticipantes=$diosesParticipantes, ideaPrincipal='$ideaPrincipal', teselas=$teselas)"
    }
}