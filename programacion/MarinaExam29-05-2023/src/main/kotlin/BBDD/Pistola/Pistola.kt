package BBDD.Pistola

class Pistola {
    var tipo: String = ""
    //val historialPuntuaciones: ArrayList<Int> = arrayListOf()
    val historialPuntuaciones = ArrayList<Int>() //Esta opción es mejor
    companion object {
        var totalDisparos: Int = 0
    }
    var recargas: Int = 0
    var disparosRestantes: Int = 0

    fun tiro(): Int{
        val puntuacion = (0..10).random()
        historialPuntuaciones.add(puntuacion)
        totalDisparos++
        return puntuacion
    }

    fun obtenerHistorialPuntuaciones(): List<Int>{
        return historialPuntuaciones
    }

    fun obtenerMediaDisparos(): Double{
        if (historialPuntuaciones.isEmpty()){
            return 0.0
        }
        val sumaPuntuaciones = historialPuntuaciones.sum()
        return sumaPuntuaciones.toDouble() / historialPuntuaciones.size
    }

    fun rondaTirada(numTiradas: Int): List<Int>{
        val tiradas: ArrayList<Int> = arrayListOf()
        if (totalDisparos < numTiradas){
            val puntuacion = tiro()
            tiradas.add(puntuacion)
        }
        return tiradas
    }

    fun recargar(){
        totalDisparos = 0
        recargas++
    }
}