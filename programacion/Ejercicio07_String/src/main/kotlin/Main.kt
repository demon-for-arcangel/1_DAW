//Pedir un numero de telefono en formato cadena y convertirlo de la siguiente manera:
//numero de telefono: 34555332211
//numero cadena: (+34)-555-332211

fun main(args: Array<String>) {

    var i: Int = 0
    var cad1: String = ""
    var cad2: String = ""
    var cad3: String = ""

    println("Número de teléfono:")
    var tlf: String = readln()

    while (i < tlf.length){
        if(i < 2) { //la posición del dígito es menor que dos entra en el bucle
            cad1 = cad1 + tlf[i] //el dígito en esa posición se guarda en cad1
        }else{
            if(i < 5 ){
                cad2+=tlf[i]
            }else{
                cad3+=tlf[i]
            }
        }
        i++
    }
    println(("Numero cadena: (+") + cad1 + (")-") + cad2 + ("-") + cad3 )
}