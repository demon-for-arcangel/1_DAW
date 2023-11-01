fun main(args: Array<String>) {
    var banco = arrayListOf<Cuenta>()
    //var banco2 = ArrayList<Cuenta>()


    //Jose 17, Maria 50, Ana 22, Eva 16 y Juan 80
    // dni 1, dni 2, dni 3, dni 4, dni 5
    var nombre = arrayListOf("Jose", "Maria", "Ana", "Eva", "Juan")
    var grupo = arrayListOf()
    var edad = arrayListOf(17, 50, 22, 16, 80)
    var dni = 1
    //var dni = arrayListOf(1, 2, 3, 4, 5)

    for (i in 1 .. 5){
        var rd = (0 .. 1).random()
        var person = Persona ()
        person.dni = dni
        dni ++
        person.edad = edad[rd]
        grupo.add = grupo[rd]
    }
}