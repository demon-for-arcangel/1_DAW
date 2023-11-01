package BBDD.Productos

interface ProductosDAO {
    fun insertarProductos(prod: List<Productos>)
}