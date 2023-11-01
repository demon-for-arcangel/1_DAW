package com.example.interfaz_menus_bbdd_tabla

class CategoriaProducto{
    var descripcion: String = ""
    var nombre: String = ""
    var cantidad: Int = 0
    var precio: Int = 0

    constructor(d: String, n: String, c: Int, p: Int){
        descripcion = d
        nombre = n
        cantidad = c
        precio = p
    }

    override fun toString(): String {
        return "CategoriaProducto(descripcion='$descripcion', '$nombre'"
    }
}