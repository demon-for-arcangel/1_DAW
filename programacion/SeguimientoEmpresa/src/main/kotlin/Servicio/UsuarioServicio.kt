package Servicio

import BBDD.Usuario.Usuario
import BBDD.Usuario.UsuarioDAOImpl
import java.time.LocalDate

class UsuarioServicio {
    private val usuarioDAO = UsuarioDAOImpl()

    fun insertarUsuario(nombre: String, primerApellido: String, segundoApellido: String, fechaNacimiento: LocalDate, numeroPersonal: Int): Int{
        return usuarioDAO.insertarUsuario(Usuario(nombre, primerApellido, segundoApellido, fechaNacimiento, numeroPersonal))
    }

    fun seleccionarUsuario(): List<Usuario>{
        return usuarioDAO.seleccionarUsuario()
    }

    fun borrarUsuario(n: Int): Boolean {
        return usuarioDAO.borrarUsuario(n)
    }
}