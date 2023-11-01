package Servicio

import BBDD.Destinos.Destino
import BBDD.Destinos.DestinoDAOImpl

class DestinoServicio {
    private val destinoDAO = DestinoDAOImpl()

    fun seleccionarDestino(): List<Destino>{
        return destinoDAO.seleccionarDestino()
    }
}