class Repartidor() {
    val id: String = ""
    val nombre: String = ""
    val filaAsignada: Int = 0
    val furgoneta = ArrayList<Furgoneta>()
    var amonestaciones: Int = 0

    fun cargarFurgoneta() {
        if (furgoneta != null) {
            val sectorConMasPaquetes = filaAsignada.sectores.maxByOrNull { it.numPaquetes } ?: return
            var numPaquetesCargados = 0

            while (numPaquetesCargados < furgoneta!!.capacidad && sectorConMasPaquetes.numPaquetes > 0) {
                val paquete = sectorConMasPaquetes.paquetes.firstOrNull() ?: break
                furgoneta!!.cargarPaquete(paquete)
                sectorConMasPaquetes.eliminarPaquete(paquete)
                numPaquetesCargados++
            }

            if (numPaquetesCargados > 0) {
                println("El repartidor ${nombre} está cargando ${numPaquetesCargados} paquete(s) en su furgoneta.")
                furgoneta!!.mostrarContenido()
            }
        }
    }

    fun descargarFurgoneta() {
        if (furgoneta != null) {
            val paquetesEntregados = furgoneta!!.paquetes.toList()
            furgoneta!!.vaciarFurgoneta()

            println("El repartidor ${nombre} está entregando los siguientes paquetes:")
            for (paquete in paquetesEntregados) {
                println("- ${paquete.toString()}")
            }
        }
    }
}