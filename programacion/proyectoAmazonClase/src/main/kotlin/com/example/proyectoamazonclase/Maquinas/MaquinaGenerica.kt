package com.example.proyectoamazonclase.Maquinas

import Fichero.FicheroObjetos
import Fichero.FicheroSerializable
import com.example.proyectoamazonclase.Caja.Caja

open class MaquinaGenerica {
    var id: Int = 0
    var gradoUtilizacion: Int = 0
    var uso = ArrayList<Int>() //cada vez que la maquina es usada se anota
    var historial = ArrayList<Caja>()

    var descartesMecanicos: Int = 0

    val ficheroSerializable = FicheroSerializable()

    constructor()
    constructor(id: Int, grado: Int){
        this.id = id
        this.gradoUtilizacion = grado
    }
    /*
    fun utilizarMaquina(){ //aumentaremos el grado de utilización por día un 4%
        if (gradoUtilizacion < 100){
            gradoUtilizacion += 4
        }
    }

    fun obtenerGradoUtilizacion(): Int{
        return gradoUtilizacion
    }

    open fun transportarCaja(caja: Caja, peso: Int) {
        if (peso > 100) {
            historial.add(caja)
        } else {
            descartesMecanicos++
        }
    }

    open fun transportarCajaPeligrosa(caja: Caja, esPeligrosa: Boolean){
        historial.add(caja)
        if (esPeligrosa) {
            ficheroSerializable.guardarCajaPeligrosa(caja)
        }
    }

    open fun obtenerDescartesMecanicos(): Int {
        return descartesMecanicos
    }*/

    override fun toString(): String {
        return "Identificador: $id\n Grado de Utilización: $gradoUtilizacion"
    }
}