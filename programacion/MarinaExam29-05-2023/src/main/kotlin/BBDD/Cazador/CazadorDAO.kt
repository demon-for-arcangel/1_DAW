package BBDD.Cazador

import BBDD.ConexionBD

interface CazadorDAO {
    fun seleccionarCazador(): List<Cazador>
}