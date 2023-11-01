package BBDD.Viaje
import BBDD.ConexionBD

class ViajeDAOImpl: ViajeDAO {
    private val conexion = ConexionBD()

    override fun seleccionarViaje(): List<Viaje> {
        conexion.conectar()
        val query = "SELECT id, id_usuario, id_destino, fecha_viaje, pagado, DATE_FORMAT(fecha_viaje, '%d/%m/%Y') AS fecha_viaje_string FROM viaje"

        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<Viaje>()
        while (rs?.next() == true) {
            val viaje = Viaje(rs.getInt("id"),rs.getInt("id_usuario"),rs.getInt("id_destino"),(rs.getDate("fecha_viaje")).toLocalDate(),rs.getBoolean("pagado"),rs.getString("fecha_viaje_string"))
            lista.add(viaje)
        }
        st?.close()
        conexion.desconectar()
        return lista
    }
}