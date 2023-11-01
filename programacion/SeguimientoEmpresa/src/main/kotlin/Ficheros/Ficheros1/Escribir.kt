package Ficheros.Ficheros1
import java.io.FileWriter
import java.io.PrintWriter


fun main(args: Array<String>) {
    try {
        val ruta = "./Ejemplo/datos.txt"
        val fw = FileWriter(ruta, true)
        fw.write("soy escrito con el método write")
        fw.write("\n")
        val salida = PrintWriter(fw)
        salida.println("Línea 1 a escribir en el fichero")
        salida.println("Línea 2 a escribir en el fichero")
        salida.flush() //asegurarnos que todos los datos se escriben antes de cerrar el flujo de escritura
        salida.close()
    } catch (e: Exception) {
        println(e.message)
    }

}
/*
SEGUNDA FORMA

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption

fun main() {
    val ruta = Path.of("datos.txt")
    val lineas = ArrayList<String>()

    // Agregar líneas al archivo en diferentes momentos
    lineas.add("Línea 1")
    lineas.add("Línea 2")
    lineas.add("Línea 3")

    // Escribir todas las líneas en el archivo
    Files.newBufferedWriter(ruta, StandardOpenOption.CREATE, StandardOpenOption.APPEND).use { writer ->
        lineas.forEach {
            writer.write(it)
            writer.newLine()
        }
    }
}
*/