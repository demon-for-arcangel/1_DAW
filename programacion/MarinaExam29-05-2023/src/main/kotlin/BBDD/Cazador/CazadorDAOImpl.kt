package BBDD.Cazador

import BBDD.ConexionBD
import BBDD.Constantes
import java.sql.PreparedStatement

class CazadorDAOImpl: CazadorDAO {
    private val conexion = ConexionBD()
    override fun seleccionarCazador(): List<Cazador> {
        conexion.conectar()
        val query = Constantes.cazadorSql
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<Cazador>()
        while (rs?.next() == true){
            val caz = Cazador(rs.getString("nombre"), rs.getString("apellido"))
            lista.add(caz)
        }
        st?.close()
        conexion.desconectar()
        return lista
    }
}