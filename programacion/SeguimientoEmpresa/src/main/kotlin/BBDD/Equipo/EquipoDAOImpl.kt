package BBDD.Equipo

import BBDD.ConexionBD
import BBDD.Equipo.Equipo
import java.sql.PreparedStatement

class EquipoDAOImpl: EquipoDAO {
    private val conexion = ConexionBD()

    override fun insertarEquipo(e: Equipo): Int {
        conexion.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null
        var correcto: Int = 1

        val query = "INSERT INTO equipo (nombre, miembro) VALUES (?, ?);"
        ps = conexion.getPreparedStatement(query)
        ps?.setString(1, e.nombre)
        ps?.setString(2, e.miembro)
        result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return correcto
    }

    override fun seleccionarEquipo(): List<Equipo> {
        conexion.conectar()
        val query = "SELECT nombre, miembro FROM equipo"

        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<Equipo>()
        while (rs?.next() == true){
            val equi = Equipo(rs.getString("nombre"), rs.getString("miembro"))
            lista.add(equi)
        }
        st?.close()
        conexion.desconectar()
        return lista
    }

    override fun borrarEquipo(nombre: String): Boolean {
        conexion.conectar()
        val query = "DELETE FROM equipo WHERE nombre = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setString(1, nombre)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }
}