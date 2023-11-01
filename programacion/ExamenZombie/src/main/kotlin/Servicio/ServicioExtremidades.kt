package Servicio

import BBDD.Extremidades.Extremidades
import BBDD.Extremidades.ExtremidadesDAOImpl

class ServicioExtremidades{
    private val extremidades = ExtremidadesDAOImpl()

    fun seleccionExtremidad(): List<Extremidades>{
         return extremidades.seleccionarExtremidades()
    }
}