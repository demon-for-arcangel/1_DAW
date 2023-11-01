class Sede {
    val repartidores = ArrayList<Repartidor>()

    fun contratarRepartidor(nombre: String, apellido: String, edad: Int, dni: String, direccion: String): Repartidor {
        val nuevoRepartidor = Repartidor(nombre, apellido, edad, dni, direccion, ciudad.sectores[0].furgonetas[0])
        repartidores.add(nuevoRepartidor)
        return nuevoRepartidor
    }

    fun despedirRepartidor(repartidor: Repartidor) {
        repartidores.remove(repartidor)
    }
}