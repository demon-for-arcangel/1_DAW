package BBDD

class Constantes {
    companion object {
        val url = "jdbc:mysql://localhost/supermercadosimple"
        val user = "root"
        val password = ""
        val forname = "com.mysql.cj.jdbc.Driver"

        //Productos
        val productosSql = "SELECT (nombre, cod_prod, cod_cat, cant, precio) VALUES (?, ?, ?, ?, ?)"
        val productoSql1 = "INSERT INTO productos (nombre, cod_prod, cod_cat, cant, precio VALUES (?, ?, ?, ?, ?)"
    }
}