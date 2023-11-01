class Furgoneta {
    val matricula: String = ""
    val marca: String = ""
    val modelo: String = ""
    val paquetes = ArrayList<Paquete>()

    fun cargarPaquetes(paquetesSector: ArrayList<Paquete>){
        // Ordenar los paquetes por tipo (urgente, certificado, normal) y agregarlos a la furgoneta.
        val paquetesUrgentes = paquetesSector.filter{it.urgente}
        val paquetesCertificados = paquetesSector.filter{it.certificado}
        val paquetesNormales = paquetesSector.filter{!it.urgente && !it.certificado}
        val paquetesCargados = paquetesUrgentes + paquetesCertificados + paquetesNormales

        // Cargar los paquetes en la furgoneta, como máximo cuatro paquetes
        for (i in 0 until minOf(paquetesCargados.size, 4 - paquetes.size)){
            paquetes.add(paquetesCargados[i])
        }
        /* var i = 0
        while (i < sector.paquetes.size && paquetesCargados < MAX_PAQUETES_FURGONETA) {
            val paquete = sector.paquetes[i]
            if (paquete.tipo == TipoPaquete.URGENTE) {
                furgoneta.cargarPaquete(paquete)
                sector.paquetes.removeAt(i)
                paquetesCargados++
            }
            i++
        }

        i = 0
        while (i < sector.paquetes.size && paquetesCargados < MAX_PAQUETES_FURGONETA) {
            val paquete = sector.paquetes[i]
            if (paquete.tipo == TipoPaquete.CERTIFICADO) {
                furgoneta.cargarPaquete(paquete)
                sector.paquetes.removeAt(i)
                paquetesCargados++
            }
            i++
        }

        i = 0
        while (i < sector.paquetes.size && paquetesCargados < MAX_PAQUETES_FURGONETA) {
            val paquete = sector.paquetes[i]
            if (paquete.tipo == TipoPaquete.NORMAL) {
                furgoneta.cargarPaquete(paquete)
                sector.paquetes.removeAt(i)
                paquetesCargados++
            }
            i++
        }*/
    }
}