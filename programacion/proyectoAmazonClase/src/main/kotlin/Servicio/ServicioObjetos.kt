package Servicio

import BBDD.Constantes
import Fichero.FicheroObjetos
import BBDD.Objetos.Objetos
import BBDD.Objetos.ObjetosDAOImpl

class ServicioObjetos {
    var objeto = ObjetosDAOImpl()

    fun seleccionObjeto(): List<Objetos>{
        return objeto.seleccionarObjetos()
    }

    fun onbtnFichero() {
        FicheroObjetos.escribir(Constantes.FicheroObjetos, objeto.seleccionarObjetos())
    }
    /*
    fun modificarObjeto(){}
     */
}