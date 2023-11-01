package com.example.marinaexamen05062023.Caja

class Caja {
    var capacidad: Int = 0
    val objetos = ArrayList<String>()
    var pesoAcumulado: Double = 0.0
    var descargasTotales: Int = 0

    companion object{
        var pesoSoportado: Int = 0
        var cantidadCajasCreadas: Int = 0
        var pesoTotalCajasCreadas: Double = 0.0

        fun obtenerCantidadCajasCreadas(): Int{
            return cantidadCajasCreadas
        }

        fun obtenerPesoTotalCajasCreadas(): Double{
            return pesoTotalCajasCreadas
        }

        init{
            cantidadCajasCreadas++
            pesoTotalCajasCreadas += pesoSoportado
        }
    }

    fun agregarObjeto(objeto: String, peso: Double){
        if ((pesoAcumulado + peso).toInt() == pesoSoportado && objetos.size < capacidad){
            objetos.add(objeto)
            pesoAcumulado += peso
        }else{
            println("No se puede agregar el objeto '$objeto' debido a restricciones de capacidad o peso")
        }
    }

    fun descargarCaja(){
        objetos.clear()
        pesoAcumulado = 0.0
        descargasTotales++
    }

    fun obtenerPesoAcumulado(): Double{
        return pesoAcumulado
    }

    fun obtenerHistoricoObjetos(): List<String>{
        return objetos.toList()
    }

    fun obtenerMediaPesoPorObjeto(): Double{
        if (objetos.isEmpty()){
            return 0.0
        }
        return pesoAcumulado / objetos.size
    }
}