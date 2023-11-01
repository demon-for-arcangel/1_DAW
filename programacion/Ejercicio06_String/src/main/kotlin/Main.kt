//Solicitar al usuario una cadena en la que buscará y otra que será la cadena buscada
//El programa indica cuantas veces aparece la segunda cadena en la primera.

fun main(args: Array<String>) {
    var i: Int = 0

    var palabra: String = ""
    var contador: Int =0

    println("Escribe una frase")
    var cadena: String = readln()

    println("Dime lo que quieres buscar")
    var longest: String = readln()
    cadena = cadena + " "
    while(cadena.length > i) {
        if (cadena[i]!= ' '){
            palabra += cadena[i]
        }else {
            if (palabra == longest){
                contador++
            }
            palabra = ""
        }
        i ++
    }
    println("La palabra esta $contador veces")
}