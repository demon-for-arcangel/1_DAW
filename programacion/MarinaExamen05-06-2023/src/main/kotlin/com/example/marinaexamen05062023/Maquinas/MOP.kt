package com.example.marinaexamen05062023.Maquinas

import Ficheros.FicheroSerializable

class MOP: MaquinaGenerica {
    var cajasPeligrosas = ArrayList<String>()

    constructor(id: Int, grado: Double) : super(id, grado){}

    fun obtenerCajasPeligrosas(): List<String>{
        return cajasPeligrosas
    }

    override fun transportarCajaPeligrosa(caja: String, esPeligrosa: Boolean) {
        super.transportarCaja(caja, esPeligrosa)
        if (esPeligrosa) {
            cajasPeligrosas.add(caja)
            ficheroSerializable.guardarCajaPeligrosa(caja)
        }
    }
}