//Leer una frase y encontrar la palabra de mayor longitud.
// El programa debe imprimir tanto la palabra como el número de caracteres de la misma.

fun main() {
    var i: Int = 0
    println("Introduce una frase")
    var cad: String = readln()
    var palabra: String = ""
    var longitud: String = ""

//length cuenta el número de caracteres de una cadena
    while(cad.length > i){
        if (cad[i] != ' '){
            palabra += cad[i]
        }else{
            if (palabra.length > longitud.length){
                longitud = palabra
            }
            palabra = ""
        }
        i++
    }
    println("La palabra más larga es $longitud")
    println("Su longitud es ${longitud.length}")
}