class Monumentos{
    var fechaConstru: String = ""
    var nombreArqui: String = ""

    fun mediaCalidad(precioEntrada: Int, valoracion: Int): Int{
        var media: Int
        var excepcion = 1
        media = precioEntrada / valoracion
        if (media != 0){
            return media
        }else{
            return excepcion
        }
    }
}