fun main(args: Array<String>) {
    val ciudad = Ciudad()

    // Inicializamos la ciudad con repartidores y furgonetas vacías
   // ciudad.inicializarCiudad()
    println (ciudad.toString())

    // Configuramos el temporizador de la simulación
    ciudad.simular()
    ciudad.inicializarRepart()

    // Esperamos 2 minutos antes de parar la simulación
    Thread.sleep(120000)

    // Paramos el temporizador y mostramos la información final de la ciudad y los repartidores
    println("\nSIMULACIÓN TERMINADA\n")
    println("Estado final de la ciudad:\n$ciudad\n")
    println("Información de los repartidores:")
    ciudad.repartidores.forEach { repartidor ->
        println("\n${repartidor.toString()}")
        println("Contenido de la furgoneta: ${repartidor.furgoneta.toString()}")
    }
}