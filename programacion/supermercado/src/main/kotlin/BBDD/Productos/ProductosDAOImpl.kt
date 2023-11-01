package BBDD.Productos

import BBDD.ConexionBD
import BBDD.Constantes
import java.lang.Exception
import java.sql.PreparedStatement

class ProductosDAOImpl: ProductosDAO {
    private val conexion = ConexionBD()

    override fun insertarProductos(prod: List<Productos>) {
        conexion.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null

        for (a in prod){
            val query = Constantes.productosSql
            ps = conexion.getPreparedStatement(query)
            try{
                ps?.setString(1, a.nombre)
                ps?.setInt(2, a.cod_prod)
                ps?.setInt(3, a.cod_cat)
                ps?.setInt(4, a.cant)
                ps?.setInt(5, a.precio)
            } catch (e: Exception){
                println("No se puede insertar ${a.nombre}")
            }
            ps?.close()
            conexion.desconectar()
        }
    }
}