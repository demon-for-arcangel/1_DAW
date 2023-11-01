package BBDD.Tesela
/*
En la base de datos tendremos una tabla teselaReal
En esta tabla encontraremos los siguientes atributos:
- id --> tipo Int será nuestra clave primaria
- material --> tipo String
- color --> tipo String
- ancho --> tipo Int
- largo --> tipo Int
- colocacion --> tipo String
- estadoConservacion --> String

create table teselaReal(
id number(10) primary key,
material varchar2(30),
color varchar2(30),
ancho number(100),
largo number(100),
colocacion varchar2(30),
estadoConservacion varchar2(30)
);

 */

class TeselaReal: Tesela {
    var estadoConservacion: String = ""

    constructor(id: Int, material: String, color: String, ancho: Int, largo: Int, colocacion: String, estadoConservacion: String): super(id, material, color, ancho, largo, colocacion){
        this.estadoConservacion = estadoConservacion
    }

    constructor()

    override fun toString(): String {
        return "TeselaReal --> ${super.toString()}\nEstado de conservacion: $estadoConservacion"
    }
}