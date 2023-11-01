package BBDD.Objetos

import BBDD.ConexionBD
import BBDD.Constantes
import java.lang.Exception
import java.sql.PreparedStatement

class ObjetosDAOImpl: ObjetosDAO {
    private val conexion = ConexionBD()

    override fun modificarObjetos(o: Objetos): Boolean {
        conexion.conectar()

        val query = Constantes.objetosSQL3
        var ps = conexion.getPreparedStatement(query)

        ps?.setString(1, o.nombre)
        ps?.setInt(2, o.peso)
        ps?.setBoolean(3, o.peligroso)
        ps?.setInt(4, o.id)

        var st = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()

        return st == 1
    }

    override fun seleccionarObjetos(): List<Objetos>{
        conexion.conectar()
        val query = Constantes.objetosSQL2
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<Objetos>()
        try{
            while (rs?.next() == true){
                val obj = Objetos(rs.getInt("id"), rs.getString("nombre"), rs.getInt("peso"), rs.getBoolean("peligroso"))
                lista.add(obj)
            }
        }catch (e:Exception){
            e.message
        }
        st?.close()
        conexion.desconectar()
        return lista
    }
}