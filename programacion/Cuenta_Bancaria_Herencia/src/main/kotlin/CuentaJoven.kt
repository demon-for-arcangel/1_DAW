class CuentaJoven: Cuenta() {
    override var comision = false
    companion object{  //variable estática
        var afortunados: Int = 1000
    }

    init{ //funcion que se ejecuta antes del constructor
        afortunados --
    }

    override fun ingresarDinero(cantidad: Double) {
        var suma = 0.0
        if (cantidad > 0){
            // cantidad = cantidad + 50
            suma = cantidad + 50
            super.ingresarDinero(suma)
            //super.ingresarDinero(cantidad + 50) // significa que esta llamando a su clase superior en este caso esta llamando a Cuenta.
        }
    }
}