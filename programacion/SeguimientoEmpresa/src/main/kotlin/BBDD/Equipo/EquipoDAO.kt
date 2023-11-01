package BBDD.Equipo

import BBDD.Equipo.Equipo

interface EquipoDAO {
    fun insertarEquipo(e: Equipo): Int
    fun seleccionarEquipo(): List<Equipo>
    fun borrarEquipo(nombre: String): Boolean
}