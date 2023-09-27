fun main(args: Array<String>) {
    val spanishCivilization = Civilizacion("Españoles")
    val byzantineCivilization = Civilizacion("Bizantinos")
    val isabel = Rey("Isabel I", spanishCivilization)
    val constantino = Rey("Constantino II", byzantineCivilization)

    val mine = Mina()

    val aldeanos = arrayListOf<Aldeano>()

    //creamos 10 aldeanos españoles y 10 aldeanos bizantinos
    repeat(10){
        aldeanos.add(Aldeano.SpanishAldeano())
        aldeanos.add(Aldeano.ByzantineAldeano())
    }

    aldeanos.forEach { mine.addTrabajador(it) } //asignar a los aldeanos a la mina

    // Simulacion durante 1 minuto = 60 segundos

    //Cada 2 segundos, intentamos añadir un nuevo aldeano a la mina

    // Cada 5 segundos,sufrimos el ataque de un cura bizantino que intenta convertir a un aldeano
}