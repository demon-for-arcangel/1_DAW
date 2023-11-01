package com.example.marinaexamen05062023.Maquinas

class MCG: MaquinaGenerica {
    constructor(id: Int, grado: Double) : super(id, grado){}

    override fun transportarCaja(caja: String, peso: Double) {
        if (peso > 100){
            super.transportarCaja(caja, peso)
        }else{
            descartesMecanicos++
        }
    }

    override fun obtenerDescartesMecanicos(): Int{
        return descartesMecanicos
    }
}