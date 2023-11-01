package BBDD.Extremidades

import BBDD.ConexionBD
import BBDD.Constantes
import java.sql.SQLException

class ExtremidadesDAOImpl: ExtremidadesDAO {
    private val conexion = ConexionBD()

    override fun seleccionarExtremidades(): List<Extremidades> {
        conexion.conectar()
        val tipos = arrayListOf<Extremidades>()

        try{
            conexion.conectar()
            val query = Constantes.extremidadesSQL
            val st = conexion.getStatement()
            val rs = st?.executeQuery(query)

            while (rs?.next() == true){
                val tipo = rs.getString("tipo")
                val extremidad = Extremidades(tipo)
                tipos.add(extremidad)
            }
            st?.close()
        }catch(e: SQLException){
            e.printStackTrace()
        }finally{
            conexion.desconectar()
        }
        return tipos
    }
}