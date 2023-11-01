package BBDD.Usuario

import BBDD.ConexionBD
import java.sql.Date
import java.sql.PreparedStatement

class UsuarioDAOImpl: UsuarioDAO {
    private val conexion = ConexionBD()

    override fun insertarUsuario(u: Usuario): Int {
        conexion.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null
        var correcto: Int = 1

        val query = "INSERT INTO usuario (nombre, primerApellido, segundoApellido, fechaNacimiento, numeroPersonal) VALUES (?, ?, ?, ?, ?);"
        ps = conexion.getPreparedStatement(query)
        try {
            ps?.setString(1, u.nombre)
            ps?.setString(2, u.primerApellido)
            ps?.setString(3, u.segundoApellido)
            val utilDate = u.fechaNacimiento
            val sqlDate = java.sql.Date.valueOf(utilDate)
            ps?.setDate(4, sqlDate)
            ps?.setInt(5, u.numeroPersonal)
            result = ps?.executeUpdate()
        } catch (e: Exception){
            println("no se puede insertar ${u.nombre}")
            correcto = 0
        }
        ps?.close()
        conexion.desconectar()
        return correcto
    }

    override fun seleccionarUsuario(): List<Usuario> {
        conexion.conectar()
        val query = "SELECT nombre, primerApellido, segundoApellido, fechaNacimiento, numeroPersonal DATE_FORMAT(fechaNacimiento, '%d/%m/%Y') AS fecha_Nacimiento FROM usuario"

        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<Usuario>()
        while (rs?.next() == true){
            val usu = Usuario(rs.getString("nombre"), rs.getString("primerApellido"), rs.getString("segundoApellido"), (rs.getDate("fechaNacimiento")).toLocalDate(), rs.getInt("numeroPersonal"), rs.getString("fecha_nacimiento"))
            lista.add(usu)
        }
        st?.close()
        conexion.desconectar()
        return lista
    }

    override fun borrarUsuario(numeroPersonal: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM usuario WHERE numeroPersonal = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, numeroPersonal)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}