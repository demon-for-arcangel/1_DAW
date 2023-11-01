package Servicio

import BBDD.Viaje.Viaje
import BBDD.Viaje.ViajeDAOImpl

class ViajeServicio {
    private val viajeDAO=ViajeDAOImpl()

    fun seleccionarViaje(): List<Viaje> {
        return viajeDAO.seleccionarViaje()
    }
}