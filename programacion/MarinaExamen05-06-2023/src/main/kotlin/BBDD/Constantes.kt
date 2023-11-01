package BBDD

class Constantes {
    companion object {
        var url="jdbc:mysql:://localhost/amazon"
        var user="root"
        var password=""
        var forname="com.mysql.cj.jdbc.Driver"

        var objetos1 = "SELECT id, nombre, peso, peligroso FROM objetos"
    }
}