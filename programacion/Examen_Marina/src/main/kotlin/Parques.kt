class Parques: Lugares() {
    var numAtracciones: Int = 0
    var numJuegos: Int = 0

    override fun mediaCalidad(precioEntrada: Int): Int{
        var media: Int
        var excepcion = 0
        media = numAtracciones / precioEntrada
        if (media != 0){
            return media
        }else{
            return excepcion
        }
    }
}