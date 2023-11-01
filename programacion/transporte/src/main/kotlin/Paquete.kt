open class Paquete() : Destinatario() {
    val destinatario = Destinatario("$nombre $apellido", direccion, ciudad, telefono)
    val peso: Double = 0.00
    val fragil: Boolean = true
    val urgente: Boolean = true
    val certificado: Boolean = true
}