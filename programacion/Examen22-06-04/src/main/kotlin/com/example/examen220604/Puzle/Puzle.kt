package com.example.examen220604.Puzle

class Puzle {
    var tipo: String = ""
    var capacidad: Int = 0
    var dificultad: String = ""

    private val piezasPuestas = ArrayList<String>()
    private val historicoPiezas = ArrayList<String>()

    constructor(tipo: String, capacidad: Int, dificultad: String){
        this.tipo = tipo
        this.capacidad = capacidad
        this.dificultad = dificultad
    }
    companion object {
        private var cantidadPuzlesCreados: Int = 0
        private var cantidadPiezasPuestas: Int = 0

        //obtenemos la cantidad de los puzles creados
        fun getCantidadPuzlesCreados(): Int {
            return cantidadPuzlesCreados
        }

        //obtenemos la cantidad de las piezas que han sido puestas
        fun getCantidadPiezasPuestas(): Int {
            return cantidadPiezasPuestas
        }
    }

    fun getPiezasPuestas(): List<String> {
        return piezasPuestas.toList()
    }

    fun getPiezasRestantes(): Int {
        return capacidad - piezasPuestas.size
    }

    fun agregarPieza(pieza: String) {
        if (piezasPuestas.size < capacidad) {
            piezasPuestas.add(pieza)
            historicoPiezas.add(pieza)
            cantidadPiezasPuestas++
        }
    }

    fun agregarPiezas(piezas: ArrayList<String>) {
        if (piezasPuestas.size + piezas.size <= capacidad) {
            piezasPuestas.addAll(piezas)
            historicoPiezas.addAll(piezas)
            cantidadPiezasPuestas += piezas.size
        }
    }

    //descargar Puzle de forma total
    fun descargarPuzle(): List<String> {
        val piezasDescargadas = piezasPuestas.toList()
        piezasPuestas.clear()
        return piezasDescargadas
    }

    //descargar Puzle diciendo un número de piezas
    fun descargarPiezas(numeroPiezas: Int): List<String> {
        val cantidadPiezasDescargar: Int
        if (numeroPiezas < piezasPuestas.size) {
            cantidadPiezasDescargar = numeroPiezas
        } else {
            cantidadPiezasDescargar = piezasPuestas.size
        }

        val piezasDescargadas = ArrayList<String>()

        for (i in 1..cantidadPiezasDescargar) {
            piezasDescargadas.add(piezasPuestas.removeLast())
        }
        return piezasDescargadas
    }
}