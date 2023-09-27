class Aldeano (val civilizacion: Civilizacion, var mina: Mina){
    var health: Int = 0
    init{
        when(civilizacion.nombre){
            "Españoles" -> health = 200
            "Bizantinos" -> health = 250
        }
    }

    companion object{
        fun SpanishAldeano() = Aldeano(Civilizacion("Españoles"))
        fun ByzantineAldeano() = Aldeano(Civilizacion("Bizantinos"))
    }
}