open class Lugares {
    var nombre: String = ""
    companion object{
        var precioEntrada: Int = (0..100).random()
    }
    var valoracion: Int = (0..10).random()
    var tipoTuristico = arrayListOf("museos", "parques", "monumentos")

    constructor(){
        tipoTuristico[(0 until tipoTuristico.size).random()]
    }

    open fun mediaCalidad(): Int{
        var media: Int
        var excepcion = 0
        media = precioEntrada / valoracion
        if (media != 0){
            return media
        }else{
            return excepcion
        }
    }
i}