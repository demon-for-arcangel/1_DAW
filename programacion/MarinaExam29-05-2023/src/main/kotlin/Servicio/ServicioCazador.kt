package Servicio

import BBDD.Cazador.CazadorDAOImpl
import Fichero.CazadorSerializable

class ServicioCazador {
    var cazador = CazadorDAOImpl()

    fun crearFichero(s: String){
        CazadorSerializable.insertar(s, cazador.seleccionarCazador())
    }
}