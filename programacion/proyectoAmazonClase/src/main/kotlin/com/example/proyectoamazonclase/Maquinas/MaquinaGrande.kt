package com.example.proyectoamazonclase.Maquinas

import com.example.proyectoamazonclase.Caja.Caja

class MaquinaGrande {
    var nombre: String = "MCG"
    var Diasmax: Int = 28
    var cajasTransportadas = ArrayList<Caja>()

    constructor(): super()

    fun comprobarCaja(c: Caja):Int{
        var x:Int=0
        if (c.pesoAcumulado>100){
            x=1
        }
        return x
    }

    override fun toString(): String {
        return "MaquinaGrande(nombre='$nombre', Dias Maximos=$Diasmax)"
    }
}