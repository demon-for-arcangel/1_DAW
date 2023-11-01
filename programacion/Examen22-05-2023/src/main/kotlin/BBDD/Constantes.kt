package BBDD

class Constantes {
    companion object{
        val url = "jdbc:mysql://localhost/viajes22"
        val user = "root"
        val password = ""
        val forname = "com.mysql.cj.jdbc.Driver"

        val ciudadSQL1 = "INSERT INTO usuario (nombre, fecha_nacimiento) VALUES (?, STR_TO_DATE(?, '%d/%m/%Y));"
        val ciudadSQL2 = "SELECT id, nombre, DATE_FORMAT(fecha_nacimiento, '%d/%m/%Y') AS fecha_nacimiento_string FROM Usuario"

        val destinoSQL1 = "SELECT id, nombre, precio, disponible VALUES (?, ?, ?, ?, ?)"

        val usuarioSQL1 = "INSERT INTO usuario (nombre, fecha_nacimiento) VALUES (?, ?)"
        val usuarioSQL2 = "SELECT id, nombre, DATE_FORMAT(fecha_nacimiento, '%d/%m/%Y') AS fecha_nacimiento_string FROM Usuario"

    }
}