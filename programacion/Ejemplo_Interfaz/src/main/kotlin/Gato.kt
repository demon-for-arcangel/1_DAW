class Gato:serVivo, animal {
    var nombre: String = "Sin Nombre"

    override var vivo: Boolean = false
    override fun estaVivo(valor: Int): Boolean {
        return vivo
    }

    override fun crecer() {
        TODO("Not yet implemented")
    }

    override fun morir() {
        TODO("Not yet implemented")
    }

    override fun nacer() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return nombre
    }
}