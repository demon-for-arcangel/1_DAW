package BBDD.ZombieNormal

import BBDD.ConexionBD
import BBDD.Constantes
import BBDD.ZombieAtacante.ZombieAtacante

class ZombieNormalDAOImpl: ZombieNormalDAO {
    private val conexion = ConexionBD()
    override fun seleccionarZombie(): ArrayList<ZombieNormal> {
        conexion.conectar()
        val query = Constantes.zombieNSql
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<ZombieNormal>()
        while (rs?.next() == true){
            val zomN = ZombieNormal(rs.getString("nombre"))
            lista.add(zomN)
        }
        st?.close()
        conexion.desconectar()
        return lista
    }
}