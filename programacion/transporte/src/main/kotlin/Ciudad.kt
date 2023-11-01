import kotlin.random.Random

class Ciudad {
    val sectores = Array(3) {Array<Sector>(3) {Sector()} }
   // val sectores1: Array<Array<Sector>> = Array(3) {Array(3) {Sector()} }
    val repartidores: ArrayList<Repartidor> = arrayListOf()

    /*fun generarPaquetes(){
        val random = Random()
        for (i in 0..2){
            for (j in 0..2){
                val numPaquetes = random.nextInt(3)
                for (k in 1..numPaquetes){
                    val tipoPaquete = when (radno)
                }
            }
        }
    }*/

    fun inicializarRepart{
        // inicializar repartidores y furgonetas
        val nombres = listOf("Carlos", "Laura", "Javier", "María", "Pablo", "Ana")
        for (i in 0 until 3){
            val id = String.format("%03d%c", Random.nextInt(1000), ('A'.toInt() + i).toChar)
            val nombre = nombres.random()
            val fila = i
            val furgoneta = Furgoneta()
            repartidores.add(Repartidor(id, nombre, fila, furgoneta))
        }
    }

    fun simular(){
        var segundos = 0
        while (segundos <120){
            Thread.sleep(2000)
            generarPaquetes()
            Thread.sleep(4000)
            cargarFurgonetas()
            Thread.sleep(4000)
            generarInforme()
            Thread.sleep(10000)
            amonestarRepartidores()
            segundos += 20
        }
        mostrarInforme()
    }

    fun generarPaquetes(){
        for (fila in sectores){
            for (sector in fila){
                val numPaquetes = Random.nextInt(3)
                for (i in 0 until numPaquetes){
                    val tipo = when (Random.nextInt(4)) {
                        0, 1 -> TipoPaquete.NORMAL
                        2 -> TipoPaquete.URGENTE
                        else -> TipoPaquete.CERTIFICADO
                    }
                    val destinatario = generarDestinatario()
                    val peso = Random.nextDouble(1.0, 10.0)
                    val esFragil = Random.nextBoolean()
                    val paquete = Paquete(destinatario, peso, esFragil, tipo)
                    sector.paquetes.add(paquete)
                }
            }
        }
    }

    fun generarDestinatario(): Destinatario {
        val nombres = listOf("Juan", "María", "Pablo", "Lucía", "Carlos", "Laura")
        val apellidos = listOf("García", "Pérez", "González", "Sánchez", "Martínez", "Fernández")
        val calles = listOf("Calle A", "Calle B", "Calle C", "Calle D", "Calle E", "Calle F")
        val ciudades = listOf("Madrid", "Barcelona", "Valencia", "Sevilla", "Bilbao", "Málaga")
        val telefono = String.format("%09d", Random.nextInt(1000000000))
        val nombre = nombres.random()
        val apellido = apellidos.random()
        val calle = calles.random()
        val ciudad = ciudades.random()
        return Destinatario("$nombre $apellido", calle, ciudad, telefono)
    }

    private fun cargarFurgonetas(){
        for (fila in 0 until numFilas) {
            for (repartidor in repartidores[fila]) {
                val sector = encontrarSectorConMasPaquetes(fila)
                if (sector != null) {
                    val paquetes = ArrayList<Paquete>()
                    paquetes.addAll(sector.obtenerPaquetes(TipoPaquete.URGENTE))
                    paquetes.addAll(sector.obtenerPaquetes(TipoPaquete.CERTIFICADO))
                    paquetes.addAll(sector.obtenerPaquetes(TipoPaquete.NORMAL))
                    repartidor.cargarFurgoneta(paquetes)
                    println("El repartidor ${repartidor.nombre} ha cargado los siguientes paquetes en su furgoneta: $paquetes")
                }
            }
        }
    }

    fun amonestarRepartidores(){
        for (i in 0 until numFilas) {
            val fila = sectores[i]
            var totalPaquetesFila = 0
            for (j in 0 until numColumnas) {
                totalPaquetesFila += fila[j].numPaquetes()
            }
            if (totalPaquetesFila > 20) {
                val repartidor = repartidores[i]
                repartidor.amonestar()
                println("Repartidor ${repartidor.nombre} de la fila ${i+1} ha sido amonestado por tener más de 20 paquetes en su fila.")
            }
        }
    }

    private fun generarInforme() {
        val informe = when (Random.nextInt(4)) {
            0 -> generarInformeSector()
            1 -> generarInformeFila()
            2 -> generarInformeColumna()
            else -> generarInformeCiudad()
        }
        println(informe)
    }

    private fun generarInformeSector(){
        val fila = Random.nextInt(numFilas)
        val columna = Random.nextInt(numColumnas)
        val sector = sectores[fila][columna]
        val paquete = sector.obtenerPaquetes().size
        println("Informe de sector: Fila $fila, Columna $columna - Total paquetes: $paquete")
    }

    private fun generarInformeFila(){
        val fila = sectores.filter { it.fila == numFila }
        val paquetesFila = fila.flatMap { it.paquetes }
        val numPaquetesFila = paquetesFila.size
        val numPaquetesUrgentes = paquetesFila.filter { it.tipo == TipoPaquete.URGENTE }.size
        val numPaquetesCertificados = paquetesFila.filter { it.tipo == TipoPaquete.CERTIFICADO }.size
        val numPaquetesNormales = paquetesFila.filter { it.tipo == TipoPaquete.NORMAL }.size

        println("Informe de la fila $numFila:")
        println("Número de paquetes totales en la fila: $numPaquetesFila")
        println("Número de paquetes urgentes en la fila: $numPaquetesUrgentes")
        println("Número de paquetes certificados en la fila: $numPaquetesCertificados")
        println("Número de paquetes normales en la fila: $numPaquetesNormales")
    }

    private fun generarInformeColumna(){
        val info = StringBuilder()
        val paquetesPorTipo = arrayOf(0, 0, 0) // paquetes normales, urgentes, certificados
        val sectoresConPaquetes = mutableListOf<Int>()

        // Recorremos todos los sectores de la columna
        for (i in 0 until filas) {
            val sector = sectores[i][columna]
            val paquetes = sector.getPaquetes()

            // Sumamos los paquetes de cada tipo
            for (j in 0 until 3) {
                paquetesPorTipo[j] += paquetes[j].size
            }

            // Añadimos el sector a la lista si tiene paquetes
            if (paquetes.sumBy { it.size } > 0) {
                sectoresConPaquetes.add(sector.numero)
            }
        }

        // Generamos el informe
        info.append("INFORME DE COLUMNA $columna\n")
        info.append("-----------------------\n")
        info.append("Paquetes normales: ${paquetesPorTipo[0]}\n")
        info.append("Paquetes urgentes: ${paquetesPorTipo[1]}\n")
        info.append("Paquetes certificados: ${paquetesPorTipo[2]}\n")
        info.append("Sectores con paquetes: ${sectoresConPaquetes.joinToString(", ")}\n")

        return info.toString()
    }

    private fun generarInformeCiudad(){
        val paquetesPorTipo = mutableMapOf<TipoPaquete, Int>()
        val sectores = mutableListOf<Sector>()
        for (i in 0 until filas) {
            for (j in 0 until columnas) {
                val sector = matrizSectores[i][j]
                paquetesPorTipo.merge(TipoPaquete.NORMAL, sector.paquetesNormales.size, Int::plus)
                paquetesPorTipo.merge(TipoPaquete.URGENTE, sector.paquetesUrgentes.size, Int::plus)
                paquetesPorTipo.merge(TipoPaquete.CERTIFICADO, sector.paquetesCertificados.size, Int::plus)
                sectores.add(sector)
            }
        }

        val infoSectores = sectores.joinToString("\n") { sector ->
            "${sector.nombre}: N:${sector.paquetesNormales.size} U:${sector.paquetesUrgentes.size} C:${sector.paquetesCertificados.size}"
        }

        val infoRepartidores = listaRepartidores.joinToString("\n") { repartidor ->
            "Repartidor ${repartidor.nombre}: ${repartidor.furgoneta.contenido.joinToString(", ") { it.id }}"
        }

        return "INFORME DE CIUDAD:\n" +
                "Paquetes totales: N:${paquetesPorTipo[TipoPaquete.NORMAL]} U:${paquetesPorTipo[TipoPaquete.URGENTE]} C:${paquetesPorTipo[TipoPaquete.CERTIFICADO]}\n" +
                "Paquetes por sector:\n$infoSectores\n" +
                "Repartidores:\n$infoRepartidores"
    }
}