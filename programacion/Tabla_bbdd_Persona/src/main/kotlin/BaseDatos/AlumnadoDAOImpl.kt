package BaseDatos

import java.sql.PreparedStatement


class AlumnadoDAOImpl:AlumnadoDAO {
    private val conexion= ConexionBD()

    override fun insertarAlumnado(a:Alumnado): Int {
        conexion.conectar()
        var result:Int?=null
        var ps: PreparedStatement? = null
        var correcto:Int = 1

        val query = "INSERT INTO alumno (id,nombre, edad, fecha_nacimiento, matriculado) VALUES (?,?, ?, ?, ?);"
        ps = conexion.getPreparedStatement(query)
        try {
            ps?.setInt(1, a.id)
            ps?.setString(2, a.nombre)
            ps?.setInt(3, a.edad)
            val utilDate = a.fechaNacimiento
            val sqlDate = java.sql.Date.valueOf(utilDate)
            ps?.setDate(4, sqlDate)
            ps?.setBoolean(5, a.matriculado)
            result = ps?.executeUpdate()
        }catch (e:Exception){
            println("no Se puede insertar ${a.nombre}")
            correcto = 0
        }
        ps?.close()
        conexion.desconectar()
        return correcto
    }

    override fun seleccionarAlumnado(): List<Alumnado>{
        conexion.conectar()
        //val query = "SELECT nombre,edad,fecha_nacimiento,matriculado FROM ALUMNO"
        val query = "SELECT id,nombre, edad, fecha_nacimiento, matriculado, DATE_FORMAT(fecha_nacimiento, '%d/%m/%Y') AS fecha_nacimiento_string FROM ALUMNO"

        val st = conexion.getStatement()
        val rs = st?.executeQuery(query)
        val lista = ArrayList<Alumnado>()
        while (rs?.next() == true) {
            val alu = Alumnado(rs.getInt("id"),rs.getString("nombre"),rs.getInt("edad"),(rs.getDate("fecha_nacimiento")).toLocalDate(),rs.getBoolean("matriculado"),rs.getString("fecha_nacimiento_string"))
            lista.add(alu)
        }
        st?.close()
        conexion.desconectar()
        return lista
    }
    override fun borrarAlumnado(id: Int): Boolean {
        conexion.conectar()
        val query = "DELETE FROM alumno WHERE id = ?"
        val ps = conexion.getPreparedStatement(query)
        ps?.setInt(1, id)
        val result = ps?.executeUpdate()
        ps?.close()
        conexion.desconectar()
        return result == 1
    }

}





