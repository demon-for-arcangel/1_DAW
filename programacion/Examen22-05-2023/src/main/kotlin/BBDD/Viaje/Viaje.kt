package BBDD.Viaje

import java.time.LocalDate

class Viaje {
    var id: Int = 0
    var id_usuario: Int = 0
    var id_destino: Int = 0
    var fecha_viaje = LocalDate.now()
    var pagado: Boolean = false

    constructor(id: Int, id_usuario: Int, id_destino: Int, fecha_viaje: LocalDate, pagado: Boolean, string: String){
        this.id = id
        this.id_usuario = id_usuario
        this.id_destino = id_destino
        this.fecha_viaje = fecha_viaje
        this.pagado = pagado
    }

    override fun toString(): String {
        return "$id $id_usuario $id_destino $fecha_viaje $pagado"
    }
}