package BBDD

import java.sql.*

class ConexionBD {
    val url=Constantes.url
    val user=Constantes.user
    val password=Constantes.password
    val forname=Constantes.forname
    var conn: Connection? = null

    fun conectar() {
        try {
            Class.forName(forname)
            conn = DriverManager.getConnection(url, user, password)
        } catch (e: SQLException) {
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
    }
    fun desconectar() {
        try {
            conn?.close()
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }
    fun getStatement(): Statement? {
        return conn?.createStatement()
    }

    fun getPreparedStatement(sql: String): PreparedStatement? {
        return conn?.prepareStatement(sql)
    }
}