package BBDD.Destinos
import BBDD.ConexionBD
import BBDD.Constantes

class DestinoDAOImpl: DestinoDAO {
    private val conexion = ConexionBD()

    override fun seleccionarDestino(): List<Destino> {
        conexion.conectar()
        val query = Constantes.destinoSQL1

        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<Destino>()
        while (rs?.next() == true){
            val destino = Destino(rs.getInt("id"), rs.getString("nombre"))
            lista.add(destino)
        }
        st?.close()
        conexion.desconectar()
        return lista
    }
}