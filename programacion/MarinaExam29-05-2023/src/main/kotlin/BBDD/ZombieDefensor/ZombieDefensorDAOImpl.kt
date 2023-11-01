package BBDD.ZombieDefensor

import BBDD.ConexionBD
import BBDD.Constantes
import BBDD.ZombieAtacante.ZombieAtacante

class ZombieDefensorDAOImpl: ZombieDefensorDAO {
    private val conexion = ConexionBD()
    override fun seleccionarZombie(): ArrayList<ZombieDefensor> {
        conexion.conectar()
        val query = Constantes.zombieDSql
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<ZombieDefensor>()
        while (rs?.next() == true){
            val zomD = ZombieDefensor(rs.getString("nombre"))
            lista.add(zomD)
        }
        st?.close()
        conexion.desconectar()
        return lista
    }
}