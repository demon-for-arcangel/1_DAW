package com.example.examenzombie.Pistola

class Pistola {
    var tipo: String = ""
    var historicoTiros = ArrayList<Int>()
    var numDisparos: Int = 0
    var numRecargas: Int = 0
    var cantBalas: Int = 0

    constructor( tipo: String, cantBalas: Int){
        this.tipo = tipo
        this.cantBalas = cantBalas
    }
    constructor(nombre: String){
        tipo = nombre
    }

    fun Tiro(): Int {
        if (numDisparos < cantBalas){
            var puntuacion = (0..10).random()
            historicoTiros.add(puntuacion)
            numDisparos++
            return puntuacion
        }
        return -1 //indicador de que no quedan tiros disponibles
    }

    fun rondaTiradas(numTiradas: Int): List<Int>{
        val tiradas = ArrayList<Int>()
        //Opcion 1
        /*repeat(numTiradas){
            val tiro = Tiro()
            if (tiro != -1){
                tiradas.add(tiro)
            }
        }*/

        //Opcion 2
        if (cantBalas < numTiradas){
            var puntuacion = Tiro()
            tiradas.add(puntuacion)
        }
        return tiradas
    }

    fun mediaTiros(): Int{
        if (historicoTiros.isEmpty()){
            return 0
        }
        var sumaTiros = historicoTiros.sum()
        return sumaTiros / historicoTiros.size
    }

    fun numVecesDisparada(): Int{
        return numDisparos
    }

    fun numVecesRecargada(): Int{
        return numRecargas
    }

    fun recargar(){
        numRecargas++
        numDisparos = 0
    }
}