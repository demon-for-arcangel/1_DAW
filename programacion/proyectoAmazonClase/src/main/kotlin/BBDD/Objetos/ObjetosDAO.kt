package BBDD.Objetos

interface ObjetosDAO {
    fun modificarObjetos(o: Objetos): Boolean
    fun seleccionarObjetos(): List<Objetos>
    //fun borrarObjeto(id: Int): Boolean
}