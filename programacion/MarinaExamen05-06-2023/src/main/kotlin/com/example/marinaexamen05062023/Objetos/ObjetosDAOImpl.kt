package com.example.marinaexamen05062023.Objetos

import BBDD.ConexionBD
import BBDD.Constantes
import java.lang.Exception
import java.sql.PreparedStatement

class ObjetosDAOImpl: ObjetosDAO {
    private val conexion = ConexionBD()
    override fun insertarObjeto(obj: List<Objetos>) {
        conexion.conectar()
        var result: Int? = null
        var ps: PreparedStatement? = null

        for (a in obj){
            val query = Constantes.objetos1
            ps = conexion.getPreparedStatement(query)
            try{
                ps?.setString(1, a.nombre)
                result = ps?.executeUpdate()
            }catch(e: Exception){
                println("No se puede insertar ${a.nombre}")
            }
        }
        ps?.close()
        conexion.desconectar()
    }
}