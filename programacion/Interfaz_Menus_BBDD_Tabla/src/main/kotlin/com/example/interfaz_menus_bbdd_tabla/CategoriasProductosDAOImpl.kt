import java.lang.Exception
import java.sql.PreparedStatement

class CategoriasProductosDAOImpl: Categ {
    private val conexion = ConexionBD()
    override fun seleccionarCategoriaProducto(): List<CategoriaProducto>{
        val lista = ArrayList<CategoriaProducto>()
        val st: Statement? = null
        try {
            conexion.conectar()
            val query = "SELECT descripcion, nombre, cant, precio FROM categorias join productos on cod_grupo = cod_cat"
            st = conexion.getStatement()
            val rs = st?.executeQuery(query)
            while (rs?.next() == true) {
                val cat = CategoriaProducto(rs.getString("descripcion"), rs.getString("nombre"), rs.getInt("cant"), rs.getInt("precio"))
                lista.add(cat)
            }
        }catch (ex: Exception){

        }finally {
            st?.close()
            conexion.desconectar()
        }
        return lista
    }
}