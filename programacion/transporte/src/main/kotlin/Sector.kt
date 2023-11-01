class Sector {
    val paquetes = ArrayList<Paquete>()

    fun agregarPaquete (paquete: Paquete){
        paquetes.add(paquete)
    }

    fun eliminarPaquete (paquete: Paquete){
        paquetes.remove(paquete)
    }

    fun cantidadTotal (): Int {
        return paquetes.size
    }

    fun cantidadPaqTipo (tipo: TipoPaquete): Int {
        return paquetes.count (it.tipo == tipo)
    }
}