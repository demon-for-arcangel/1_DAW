package BBDD

class Constantes {
    companion object{
        val url = "jdbc:mysql://localhost/nombreBasedeDatos"
        val user = "root"
        val password = ""
        val forname = "com.mysql.cj.jdbc.Driver"

        val teselaSQL1 = "UPDATE teselaReales SET ancho=?, alto=?, material=?, color=?, colocacion=?, estado=? WHERE id=?"
        val teselaSQL2 = "INSERT INTO tesela (id, material, color, ancho, largo, colocacion, estadoConservacion) VALUES (?, ?, ?, ?, ?, ?);"

        val FicheroTeselas = "teselas.txt"
    }
}