package BBDD.Usuario

import BBDD.ConexionBD
import BBDD.Constantes
import java.lang.Exception
import java.sql.PreparedStatement

class UsuarioDAOImpl: UsuarioDAO {
    private val conexion = ConexionBD()

    override fun insertarUsuario(u: Usuario): Int {
        conexion.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null
        var correcto: Int = 1

        val query = Constantes.usuarioSQL1
        ps = conexion.getPreparedStatement(query)
        try{
            ps?.setInt(1, u.id)
            ps?.setString(2, u.nombre)
            ps?.setString(3, u.fecha_nacimiento)
            result = ps?.executeUpdate()
        } catch (e: Exception){
            println("No se puede insertar ${u.nombre}")
            correcto = 0
        }
        ps?.close()
        conexion.desconectar()
        return correcto
    }

    override fun seleccionarUsuario(): List<Usuario> {
        conexion.conectar()
        val query = Constantes.usuarioSQL2
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<Usuario>()
        while (rs?.next() == true){
            val usu = Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("fecha_nacimiento_string"))
            lista.add(usu)
        }
        st?.close()
        conexion.desconectar()
        return lista
    }
}