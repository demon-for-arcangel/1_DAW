package BBDD

import java.sql.*

class ConexionBD {
    var url="jdbc:mysql://localhost/viajes22"
    var user="root"
    var password=""
    var forname="com.mysql.cj.jdbc.Driver"
    var conn: Connection? = null
    
    constructor(ur: String, us: String, pa: String){
        this.url=ur
        this.user=us 
        this.password=pa
    }

    constructor()

    fun conectar(): Connection? {
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