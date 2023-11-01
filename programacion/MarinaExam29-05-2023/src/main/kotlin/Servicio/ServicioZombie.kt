package Servicio

import BBDD.ZombieNormal.ZombieNormalDAOImpl
import Fichero.CazadorSerializable

class ServicioZombie {
    var zombie = ZombieNormalDAOImpl()

    fun crearFichero(s: String){
        CazadorSerializable.insertar(s, zombie.seleccionarZombie())
    }
}