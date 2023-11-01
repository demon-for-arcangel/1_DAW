package BBDD.Ciudades

import BBDD.ConexionBD
import BBDD.Constantes
import java.lang.Exception
import java.sql.PreparedStatement

class CiudadesDAOImpl: CiudadesDAO {
    private val conexion = ConexionBD()

    override fun insertarCiudad(c: List<Ciudades>) {
        conexion.conectar()
        var result:Int?=null
        var ps: PreparedStatement? = null

        for(a in c) {
            val query = Constantes.ciudadSQL2
            ps = conexion.getPreparedStatement(query)
            try {
                ps?.setString(1, a.nombre)
                result = ps?.executeUpdate()
            } catch (e: Exception) {
                println("No Se puede insertar ${a.nombre}")
            }
        }
        ps?.close()
        conexion.desconectar()
    }

    override fun seleccionarCiudad(): List<Ciudades> {
        conexion.conectar()
        val query = Constantes.ciudadSQL1
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<Ciudades>()
        while (rs?.next() == true){
            val ciu = Ciudades(rs.getInt("id"), rs.getString("ciudad"))
            lista.add(ciu)
        }
        st?.close()
        conexion.desconectar()
        return lista
    }
}