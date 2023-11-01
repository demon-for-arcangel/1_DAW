package BBDD.Ciudades

interface CiudadesDAO {
    fun insertarCiudad(c: List<Ciudades>)
    fun seleccionarCiudad(): List<Ciudades>
}