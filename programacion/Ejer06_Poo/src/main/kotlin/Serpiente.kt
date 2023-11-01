class Serpiente {
    var edad: Int = 0
    var cuerpo = ArrayList<Anilla>()


    fun decrece(){

    }

    fun crece(){
        cuerpo.add(Anilla())
    }

    fun comprobarEdad(): Int{
        return edad
    }
}