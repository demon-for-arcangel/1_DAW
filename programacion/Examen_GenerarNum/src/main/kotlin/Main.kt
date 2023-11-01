/*
Generar numeros del 0 al 99 incluidos, al generarlo introducir en un vector en su casilla correspondiente
Contador de las veces que se han intentado rellenar una casilla del vector.
Termina cuando este rellenado totalmente el vector con sus numeros correspondientes.
Al finalizar mostrará el vector y el número de veces que ha intentado rellenar cada casilla.
 */

fun main(args: Array<String>) {

    var v=Array<Int>(100){0} //crear un vector relleno de 0, con un tamaño de 100
    do{
        cargarNumero(v)
    }while(seguirRellenando(v))
    imprimirSolucion(v)
}
fun cargarNumero(v:Array<Int>){
    val MENOR:Int = 0
    val MAYOR:Int = 99
    var aleatorio: Int = (MENOR..MAYOR).random()
    v[aleatorio] = v[aleatorio] + 1
}
fun seguirRellenando(v:Array<Int>):Boolean{
    //sumar todos los numeros y si es cero. (otra opcion)
    //revisar el array
    var seguir : Boolean = false
    for(i in v.indices){  // while (i<v.size) && (!seguir) esta opcion es más eficiente
        //if ((v[i])==0){seguir=true}
        if ((v[i])==0){seguir=true} // donde la posición en el vector sea 0 seguir es verdadero y sigue rellenando
    }
    return seguir
}
fun imprimirSolucion(v:Array<Int>){
    var j: Int = 0
    for(i in v.indices){
        if (j % 10 == 0){println()}
        print("[${v[i]}]")
        j++
        //if (j < 9) {
           // print("[${v[i]}]")
        //}else{
           // print("[${v[i]}]")
           // j = 0
        //}
       // j++
    }
    println()
}