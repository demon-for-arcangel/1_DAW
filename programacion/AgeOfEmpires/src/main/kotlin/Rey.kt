class Rey (val name: String, val civilizacion: Civilizacion) {
    fun addAldeano(aldeano: Aldeano){ //Añadimos el aldeano a la civilizacion del rey
        civilizacion.addAldeano(aldeano)
    }
}