/*
Clase cuadrado, con los atributos, debe dar una interfaz donde pueda calcular el area, el perimetro y que los imprima.
Clase circulo, que tenga funciones (metodos) area y perimetro y los imprima
Maximo dos constructores
En el programa principal habra una prueba de que td lo realizado funcione
 */
fun main(args: Array<String>) {
    var c = Cuadrado(25)

    /*
    ERRORRR
        var perimetro = c.getlado()*4

        println(perimetro)
     */

    //OBJETOS
    println(c.perimetro())

    c.imprimirPerimetro()

    c.imprimirArea() //o tamb println (c.area())

    /* MAAAAALLLLLLL
    println(c.getlado() * c.getlado())
     */
    /*
    maaalll
    var p = c.getlado()
    println(p * p)
     */

    //// CON CUADRADO2
    var d=Cuadrado2(2)
    println(d.getperimetro())
    println(d.getarea())
}