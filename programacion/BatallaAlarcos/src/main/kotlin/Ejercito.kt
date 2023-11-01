class Ejercito {
    var jefe = ""
    var soldados = arrayListOf<Soldados>()

    constructor(jefe: String, soldados: Array<Soldados>){
        this.jefe = jefe
        this.soldados = soldados
    }

    fun hablarJefe(): String{
        return "Soy el jefe $jefe y me quedan ${soldados.size} soldados."
    }

    fun lucharContra(ejercitoOponente: Ejercito): Soldados{
        val soldadoNuestro = soldados.random()
        val soldadoOponente = ejercitoOponente.soldados.random()

        return if (soldadoNuestro.fuerza > soldadoOponente.fuerza){
            ejercitoOponente.soldados.remove(soldadoOponente)
            soldadoNuestro
        }else{
            soldados.remove(soldadoNuestro)
            soldadoOponente
        }
    }
}