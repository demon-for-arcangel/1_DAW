package Servicio

import BBDD.Tesela.FactoriaTesela
import BBDD.Tesela.TeselaReal

class TeselaServicio {
    private val tesela = FactoriaTesela()

    fun crearTesela(material: String, color: String, ancho: Int, largo: Int, colocacion: String, estadoConservacion: String): TeselaReal {
        return tesela.crearTesela(material, color, ancho, largo, colocacion, estadoConservacion)
    }
}