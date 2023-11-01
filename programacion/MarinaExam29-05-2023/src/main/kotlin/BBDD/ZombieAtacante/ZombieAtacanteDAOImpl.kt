package BBDD.ZombieAtacante

import BBDD.ConexionBD
import BBDD.Constantes

class ZombieAtacanteDAOImpl: ZombieAtacanteDAO {
    private val conexion = ConexionBD()
    override fun seleccionarZombie(): ArrayList<ZombieAtacante> {
        conexion.conectar()
        val query = Constantes.zombieASql
        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<ZombieAtacante>()
        while (rs?.next() == true){
            val zomA = ZombieAtacante(rs.getString("nombre"))
            lista.add(zomA)
        }
        st?.close()
        conexion.desconectar()
        return lista
    }
}