package BBDD.Tesela

class TeselaFicticia: Tesela {
    var coloresSimulacion = ArrayList<String>()

    constructor()
    constructor(id: Int, material: String, color: String, ancho: Int, largo: Int, colocacion: String, coloresSimulacion: ArrayList<String>): super(id, material, color, ancho, largo, colocacion){
        this.coloresSimulacion = coloresSimulacion
    }

    override fun toString(): String {
        return "TeselaFicticia --> ${super.toString()}\nColor en Simulacion: $coloresSimulacion"
    }
}