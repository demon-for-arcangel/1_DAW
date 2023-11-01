/*
Calcular la frecuencia de aparición de las vocales de un texto
Se debe presentar en forma de histograma
Ej:
a 15 ***************
e 8 ********
etc
 */

fun main(args: Array<String>) {
    var i: Int = 0
    var cad1: Int = 0
    var cad2: Int = 0
    var cad3: Int = 0
    var cad4: Int = 0
    var cad5: Int = 0
    var v_a: String = ""
    var v_e: String = ""
    var v_i: String = ""
    var v_o: String = ""
    var v_u: String = ""

    println("Ingrese el texto del que quiera presentar el histograma:")
    var texto: String = readln()
    texto = texto.lowercase() //convertimos la cadena en minúsculas

    while (i < texto.length){ //.length indica la longitud o tamaño
        if (texto[i] == 'a'){
            cad1++
            v_a += "*"
        }
        if (texto[i] == 'e'){
            cad2++
            v_e += "*"
        }
        if (texto[i] == 'i'){
            cad3++
            v_i += "*"
        }
        if (texto[i] == 'o'){
            cad4++
            v_o += "*"
        }
        if (texto[i] == 'u'){
            cad5++
            v_u += "*"
        }
        i++
    }
    println("a" + " " + cad1 + " " + v_a)
    println("e" + " " + cad2 + " " + v_e)
    println("i" + " " + cad3 + " " + v_i)
    println("o" + " " + cad4 + " " + v_o)
    println("u" + " " + cad5 + " " + v_u)
}