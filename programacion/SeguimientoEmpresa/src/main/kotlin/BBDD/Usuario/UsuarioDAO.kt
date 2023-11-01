package BBDD.Usuario

interface UsuarioDAO {
    fun insertarUsuario(u: Usuario): Int
    fun seleccionarUsuario(): List<Usuario>
    fun borrarUsuario(numeroPersonal: Int): Boolean
}