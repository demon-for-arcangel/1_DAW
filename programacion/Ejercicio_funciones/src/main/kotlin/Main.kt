fun main() {
    println("Soy el programa principal")
    var x: Int = 2
    var y: Int = 3
    pantalla() //llama a la función pantalla
    suma(x,y) //llama a la fun suma y le metemos los valores de x e y
    x= x + retornaelSiete() // se suma el valor de x con la funcion retornaelSiete y se guarda el resultado en la variable x
    print("El numero es " + retornaelSiete()) //Se imprime por pantalla añadiendo el valor de la función
    suma3(2,4)
    resta(5, 7, 3)
    restaRetorno(10, 15, 8)
}

fun pantalla(){ //función pantalla / Colocar las funciones en otro archivo
    println("Imprimo por pantalla")
}

fun suma(x_aux: Int, y_aux: Int){ //función suma
    println("La x vale $x_aux")
    println("La y vale $y_aux")
} //en el momento que se ejecuta desaparece y no volveremos a tener las variables a no ser que llamemos otra vez a la función

fun retornaelSiete(): Int{
    return 7
}

fun suma3(x: Int, y: Int){
    var x2: Int = x
    x2++
    x2 = x2 * y
    println(x2)
}