package BBDD

class Constantes {
    companion object {
        var url="jdbc:mysql://localhost/amazon"
        var user="root"
        var password=""
        var forname="com.mysql.cj.jdbc.Driver"

        val objetosSQL1 = "INSERT INTO objetos (id, nombre, peso, peligroso) VALUES (?, ?, ?, ?)"
        val objetosSQL2 = "SELECT id, nombre, peso, peligroso FROM objetos"
        val objetosSQL3 = "UPDATE objetos SET nombre=?, peso=?, peligroso=? WHERE id=?"

        val FicheroObjetos = "Objetos.txt"
    }
}