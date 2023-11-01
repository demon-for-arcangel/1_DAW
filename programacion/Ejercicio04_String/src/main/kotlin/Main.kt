/*
Dada una cadena y un carácter verificar cuantas veces se repite el carácter en la cadena
Ej:
Entrada: cad = "casa blanca", car = a
Salida: El carácter 'a' se repite 4 veces
 */

fun main(args: Array<String>) {
    var i: Int = 0

    println("Introduce una cadena: ")
    var cadena: String = readln()//leer por pantalla la cadena pedida por el usuario

    println("Dime el carácter que desea buscar:")
    var vocal: String = readln() //leemos el carácter deseado como cadena el cual guardaremos después como un char para buscar en la cadena pedida

    var caracter: Char = vocal.first() //convertimos la vocal en un char
    var repeticiones: Int = 0

    while (i < cadena.length){
        var posicion: Char = cadena[i] //obtenemos la posición i
        if (posicion == caracter){
            repeticiones++
        }
        i++
    }
    println("El carácter solicitado se repite $repeticiones veces")
}