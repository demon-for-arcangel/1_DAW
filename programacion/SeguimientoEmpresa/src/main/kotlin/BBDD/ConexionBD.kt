package BBDD

import java.sql.*

class ConexionBD {
    val url="jdbc:mysql://localhost/emociones"
    val user="root"
    val password=""
    val forname="com.mysql.cj.jdbc.Driver"
    var conn: Connection? = null
    open fun conectar(): Connection? {
        try {
            Class.forName(forname)
            conn = DriverManager.getConnection(url, user, password)
        } catch (e: SQLException) {
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
        return conn
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