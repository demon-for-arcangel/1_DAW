package Servicio

import BBDD.Cazador.Cazador
import BBDD.Constantes
import Fichero.CazadorSerializable

class ServicioCazador {
    fun leerFichero(nombre: String) {
        CazadorSerializable.leer(Constantes.FicheroCazador)
    }

    fun obtenerCazador(): Cazador {
        val nombre = ""
        val apellido = ""
        val cazador = Cazador(nombre, apellido)
        return cazador
    }
}