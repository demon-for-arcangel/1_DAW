fun main(args: Array<String>) {
    var Gatera = ArrayList<Gato>()
    var g1 = Gato()
    g1.nombre = "Garfield"

    Gatera.add(g1)

    println("Soy g1 "+ g1.toString())
    //println("soyg1"+ g1)
    println("soy Gatera[0] " + Gatera[0].toString())
    //println("soy Gatera[0] " + Gatera[0])

    Gatera.add(g1)

    g1 = Gato()
    Gatera.add(g1)
    g1 = Gato()

    var colonia1 = ColoniaDeGatos(g1)
}