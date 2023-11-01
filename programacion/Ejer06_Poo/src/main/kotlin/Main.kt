import kotlin.random.Random

fun main(args: Array<String>) {
    var snake1 = Serpiente()

    var nido = ArrayList<Serpiente>()
    while(Serpiente.cantidad < 20){
        var ser = Serpiente()
        nido.add(ser)
    }

    var i = 0
    while (1 < 300) { //simulación de un año 5 minutos por 60 segundos = 300
        //Thread.sleep(1000) //no tenemos que crear una instancia porque es un método estático
        var i2 = 0
        while (i2 < nido.size){
            nido[i2].edad < 10)
            if (nido[i2].edad < 10){
                var i3 = (1..10).random()
                when (i3) {
                    in 1..8 -> nido[i2].crece()
                    else -> nido[i2].cambiarPiel()
                }
            } else {
                if (nido[i2].edad < 10){
                    var i3 = (1..10).random()
                    when (i3) {
                        in 1..9 -> nido[i2].decrece()
                        else -> nido[i2].cambiarPiel()
                    }
                }
            }
            i2++
        }
        i++
    }
    //var i4 = Random.nextInt(0, nido.size)
    //nido.removeAt(i4)
}
