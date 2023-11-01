package com.example.proyectoamazonclase.Caja

import BBDD.Objetos.Objetos

class Caja {
    var tipo: String = ""
    var NumObjetos: Int = 0 //numero máximo de objetos
    var Maxpeso: Int = 0
    var pesoAcumulado: Int = 0
    var descargas: Int = 0

    var objetos = ArrayList<Objetos>()

    constructor(tipo: String, objetosMax: Int, peso: Int){
        this.tipo = tipo
        NumObjetos = objetosMax
        Maxpeso = peso
    }

    constructor(tipo: String, NumObjetos: Int, Maxpeso: Int, pesoAcumulado: Int){
        this.tipo = tipo
        this.NumObjetos = NumObjetos
        this.Maxpeso = Maxpeso
        this.pesoAcumulado = pesoAcumulado
    }

    fun agregarObjeto(): Int{
        if (NumObjetos != 0 && Maxpeso > pesoAcumulado){
            var objeto = Objetos()
            objetos.add(objeto)
            NumObjetos--
            pesoAcumulado = pesoAcumulado + objeto.peso
        }
        return NumObjetos
    }

    fun comprobarPeso(): Int{
        if (Maxpeso > pesoAcumulado){
            return pesoAcumulado
        }else{
            return Maxpeso
        }
    }

    fun descargarCaja(){
        objetos.clear()
        pesoAcumulado = 0
        descargas++
    }

    fun obtenerHistorico(): List<Objetos> {
        return objetos.toList()
    }

    fun obtenerMediaPesoPorObjeto(): Int{
        if (objetos.isEmpty()){
            return 0
        }
        return pesoAcumulado / objetos.size
    }

    override fun toString(): String {
        return "Caja(tipo='$tipo', NumObjetos=$NumObjetos, Maxpeso=$Maxpeso, pesoAcumulado=$pesoAcumulado, descargas=$descargas, objetos=$objetos)"
    }
}