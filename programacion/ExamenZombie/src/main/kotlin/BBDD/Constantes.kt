package BBDD

class Constantes {
    companion object {
        val url="jdbc:mysql://localhost/zombie"
        val user="root"
        val password=""
        val forname="com.mysql.cj.jdbc.Driver"

        //SQL
        val extremidadesSQL = "SELECT id,tipo from extremidades;"

        //Ficheros
        val FicheroZombie = "zombies.txt"
        val mensajeFicheros = "Error en Fichero"
        val FicheroCazador = "cazador.txt"
    }
}