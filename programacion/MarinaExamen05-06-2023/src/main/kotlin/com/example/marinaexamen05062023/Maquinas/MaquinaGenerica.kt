package com.example.marinaexamen05062023.Maquinas

import Ficheros.FicheroSerializable
import Ficheros.FicheroTexto

open class MaquinaGenerica {
    var identificador: Int = 0
    var gradoUtilizacion: Double = 0.0
    var cajasTransportadas = ArrayList<String>()
    var descartesMecanicos: Int = 0

    val ficheroSerializable = FicheroSerializable()

    constructor(){}
    constructor(id: Int, grado: Double){
        this.identificador = id
        this.gradoUtilizacion = grado
    }

    fun utilizarMaquina(){ //aumentaremos el grado de utilización por día un 4%
        if (gradoUtilizacion < 100.0){
            gradoUtilizacion += 4.0
        }
    }

    fun obtenerGradoUtilizacion(): Double{
        return gradoUtilizacion
    }

    open fun transportarCaja(caja: String, peso: Double) {
        if (peso > 100) {
            cajasTransportadas.add(caja)
        } else {
            descartesMecanicos++
        }
    }

    open fun transportarCajaPeligrosa(caja: String, esPeligrosa: Boolean){
        cajasTransportadas.add(caja)
        if (esPeligrosa) {
            ficheroSerializable.guardarCajaPeligrosa(caja)
        }
    }

    open fun obtenerDescartesMecanicos(): Int {
        return descartesMecanicos
    }

    fun guardarHistorialEnArchivo(ficheroTexto: FicheroTexto){
        cajasTransportadas.forEach { caja ->
            ficheroTexto.escribirTexto(caja)
        }
    }

    override fun toString(): String {
        return "Identificador: $identificador\n Grado de Utilización: $gradoUtilizacion"
    }
}