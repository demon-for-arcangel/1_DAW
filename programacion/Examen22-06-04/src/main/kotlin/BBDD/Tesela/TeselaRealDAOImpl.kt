package BBDD.Tesela

import BBDD.ConexionBD
import BBDD.Constantes
import java.lang.Exception
import java.sql.PreparedStatement

class TeselaRealDAOImpl: TeselaRealDAO {
    private val conexion = ConexionBD()
    override fun insertarTesela(tesela: List<TeselaReal>) {
        conexion.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null

        for (a in tesela){
            val query = Constantes.teselaSQL2
            ps = conexion.getPreparedStatement(query)
            try{
                ps?.setInt(1, a.id)
                result = ps?.executeUpdate()
            }catch(e: Exception){
                println("No se puede insertar ${a.id}")
            }
        }
        ps?.close()
        conexion.desconectar()
    }
}