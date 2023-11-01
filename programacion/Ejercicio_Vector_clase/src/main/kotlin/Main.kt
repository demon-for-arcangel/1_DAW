/*
Creamos un vecto en 5 elementos, creamos vacío, de tipo int,
Después de crearlo lo rellenamos de los números (1, 2, 3, 4, 5)
Saldra en un bucle y hacer el inverso del vector (5, 4, 3, 2, 1)
 */
fun main(args: Array<String>) {
//utlizando reverse
    var numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var i = 0
    while(i < numeros.size){
        print(numeros[i])
        i++
    }
    println()
    numeros.reverse()
    i = 0;
    while(i < numeros.size){
        print(numeros[i])
        i++
    }

/* creando otro array
    var numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var numeros_aux: Array<Int?> = arrayOfNulls<Int>(5)
    var i = 0
    var desdeelfinal: Int = numeros.size-1
    while (i<numeros.size){
        numeros_aux[i] = numeros[desdeelfinal]
        //println(numeros[i])
        i++
        desdeelfinal--
    }

    i=0
    while (i>=0){
        numeros[i]=numeros_aux[i]!!
        //println(numeros[i])
        i++
    }
 */

/* con un solo array
    var i = 0
    var elemento: Int
    var elemento2: Int
    desdeelfinal = numeros.size-1
    while (i<numeros.size){
        elemento = numeros[i]
        elemento2 = numeros[desdeelfinal]
        numeros[desdeelfinal] = elemento
        numeros[i] = elemento2
        i++
        desdeelfinal--
    }
 */
}