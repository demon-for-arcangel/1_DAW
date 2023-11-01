/*
CIFRADO CÉSAR
el mensaje debe tener sus letras en mayúsculas
reemplazar cada letra por la que sigue según el abecedario, la z reemplazar por la a
reemplazar cada dígito por el siguiente número, excepto el 9 que sera reemplazado por el 0
*/
fun main(args: Array<String>) {
    val abc: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    //val num: String = "0123456789"
    var mensaje: String
    var i: Int = 0
    var j: Int = 0
    var mensaje_cifrado: String = ""
    val desplazamiento = 1

    println("Ingrese el mensaje deseado: ")
    mensaje = readLine().toString()
    mensaje = mensaje.uppercase() //convertir la String en mayúsculas

    while(i < mensaje.length){
        while(j < abc.length){
            if(mensaje[i] == abc[j]){
                if((j + desplazamiento) >= abc.length){
                    mensaje_cifrado += abc[(j + desplazamiento) % abc.length]
                }else{
                    mensaje_cifrado += abc[j + desplazamiento]
                }
            }
            j++
        }
        i++
    }
    println("El mensaje cifrado es: $mensaje_cifrado")
}