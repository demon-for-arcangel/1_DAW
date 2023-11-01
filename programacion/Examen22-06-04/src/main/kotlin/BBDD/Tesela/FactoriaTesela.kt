package BBDD.Tesela

class FactoriaTesela {
    fun crearTesela(material: String, color: String, ancho: Int, largo: Int, colocacion: String, estadoConservacion: String): TeselaReal {
        var id: Int = (0..1000).random()

        return TeselaReal(id, material, color, ancho, largo, colocacion, estadoConservacion)
    }
}