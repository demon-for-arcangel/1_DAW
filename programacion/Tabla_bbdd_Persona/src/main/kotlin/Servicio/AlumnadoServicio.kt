package Servicio

import BaseDatos.*
import java.time.LocalDate



class AlumnadoServicio {
    private val alumnoDAO= AlumnadoDAOImpl()

    fun insertarAlumno(id: Int,nombre: String, edad: Int, fechaNacimiento: LocalDate, matriculado: Boolean): Int {
        return alumnoDAO.insertarAlumnado(Alumnado(id,nombre, edad, fechaNacimiento, matriculado))
    }

    fun seleccionarAlumnos(): List<Alumnado> {
        return alumnoDAO.seleccionarAlumnado()
    }

    fun borrarAlumnado(n:Int): Boolean {
        return alumnoDAO.borrarAlumnado(n)
    }

}