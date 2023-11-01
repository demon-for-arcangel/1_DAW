open class Cuenta {
    var titulares = ArrayList<Persona>()
    var numeroCuenta: Int = 0
    private var saldo: Double = 0.0 //ponemos el private para eliminar el get y el set del saldo
    open var comision = true

    fun addTitular(p: Persona){
        if (titulares.size < 3){
            titulares.add(p)
        }else{
            println("Se ha alcanzado el máximo de titulares.")
        }
    }

    fun deleteTitular(p: Persona){
        if (titulares.size <= 1){ // titulares.isEmpty() si esta vacio
            println("No se puede borrar.")
        }else{
            if (titulares.remove(p)){
                println("Borrado con éxito.")
            }else{
                println("Error al borrar.")
            }
        }
    }

    fun deleteTitular(dni: Int){ //segunda manera, es preferible la primera opción // con esta opción eliminariamos todos mientras en la otra no eliminamos el primero solo
        if (titulares.size <= 1){
            println("No se puede borrar.")
        }else{
            for(persona in titulares){ // de titulares se esta sacando persona (persona o el nombre que queramos)
                if (persona.dni == dni){
                    titulares.remove(persona) //podemos poner lo anterior para comprobar si lo borra o no lo borra
                }
            }
        }
    }

    override fun toString(): String { //estamos sobreescribiendo de la clase Any
        return "Cuenta(titulares=$titulares, numeroCuenta=$numeroCuenta, saldo=$saldo, comision=$comision)"
    }

    open fun ingresarDinero(cantidad: Double){
        if (cantidad > 0){
            saldo += cantidad
        }
    }

    open fun sacarDinero(cantidad: Double): Boolean{
        var correcto = false
        if (cantidad > 0){
            if (cantidad < saldo){
                saldo -= cantidad // saldo = saldo - cantidad
                correcto = true
            }
        }
        return correcto
    }

    fun getSaldo(): Double{
        return saldo
    }
}