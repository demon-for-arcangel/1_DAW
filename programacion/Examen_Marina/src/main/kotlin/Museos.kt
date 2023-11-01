class Museos: Lugares() {
    var tematica = arrayListOf("arte", "historia", "ciencia")
    var numSalas: Int = 0

    override fun mediaCalidad(precioEntrada: Int): Int{
        var media: Int
        var excepcion = 0
        media = precioEntrada / numSalas
        if (media != 0){
            return media
        }else{
            return excepcion
        }
    }
}