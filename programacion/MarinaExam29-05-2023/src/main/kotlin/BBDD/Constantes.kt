package BBDD

class Constantes {
    companion object{
        var url="jdbc:mysql:://localhost/zombie"
        var user="root"
        var password=""
        var forname="com.mysql.cj.jdbc.Driver"

        var PuedoRealizarTarea: Int = 1
        var noPuedoRealizarTarea: Int = 0

        var cazadorSql = "SELECT nombre, apellido, zombiesCazados, pistolas from cazador"
        var zombieASql = "SELECT nombre from zombieAtacante"
        var zombieNSql = "SELECT nombre from zombieNormal"
        var zombieDSql = "SELECT nombre from zombieDefensor"
    }
}