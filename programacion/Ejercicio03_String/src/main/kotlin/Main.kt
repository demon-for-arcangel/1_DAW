fun main() {
    //Dada una cadena mostrar por pantalla la cantidad de vocales que tiene
    //Con while que recorra la cadena con un contador y un if, cadena entre vocales que me devuelve.

    println("Introduce una cadena: ")
    var word: String = readln()
    print("La cantidad de vocales es ")
    print(checkVocals(word))
}

fun checkVocals(word: String): Int {
        var i: Int = 0
        var vocales: Int = 0
        while (i < word.length){
            if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u') {
                vocales++
            }
            i++
        }
    return vocales
}