package Servicio

import BBDD.Equipo.Equipo
import BBDD.Equipo.EquipoDAOImpl

class EquipoServicio {
    private val equipoDAO = EquipoDAOImpl()

    fun insertarEquipo(nombre: String, miembro: String): Int{
        return equipoDAO.insertarEquipo(Equipo(nombre, miembro))
    }

    fun seleccionarEquipo(): List<Equipo>{
        return equipoDAO.seleccionarEquipo()
    }

    fun borrarEquipo(nombre: String): Boolean {
        return equipoDAO.borrarEquipo(nombre)
    }
}