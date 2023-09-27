class Mina : Aldeano{
    private var tipo: String = ""
    var trabajadores = arrayListOf<Aldeano>()
    private var items: Int = 0

    // constructor para parametrizar el tipo de mina y la cantidad de items
    constructor(tipo: String, items: Int):{
        this.items = items
        this.tipo = tipo
    }

    fun trabajaAldeano(trabajador: Aldeano){
        trabajadores.add(trabajador)
    }

    fun removeAldeano(trabajador: Aldeano){
        trabajadores.add(trabajador)
    }

    fun extractItems(){

    }

    fun añadirAldeano(){
        val random = (0..9).random()
        if (random < 4){
            addTrabajador(SpanishAldeano(this))
        }else{
            if (random < 6){
                addTrabajador(ByzantineAldeano(this))
            }
        }
    }

    fun addTrabajador(trabajador: Aldeano){
        trabajadores.add(trabajador)
    }

    fun attack(){
        if ((1..5).random() == 1){
            val randomTrabajador = trabajadores.random()
            if (randomTrabajador.civilizacion.nombre == "Españoles"){
                removeAldeano(randomTrabajador)
                addTrabajador(ByzantineAldeano(this))
            }
        }
    }
}