package BBDD.Empleados

class Empleados {
    var DNI: Int = 0
    var nombre: String = ""
    var puesto: Int = 0

    constructor(dni: Int, nom: String, puesto: Int){
        DNI = dni
        nombre = nom
        this.puesto = puesto
    }
}