package BaseDatos


interface AlumnadoDAO {
    fun insertarAlumnado(a:Alumnado): Int
    fun seleccionarAlumnado(): List<Alumnado>
    fun borrarAlumnado(id: Int): Boolean
    //fun modificarAlumnado(nombreAnterior: String, edadAnterior: Int, fechaNacimientoAnterior: Date, matriculadoAnterior: Boolean, nuevoNombre: String, nuevaEdad: Int, nuevaFechaNacimiento: Date, nuevoMatriculado: Boolean): Int
    //fun borrarAlumnado(nombre: String, edad: Int, fechaNacimiento: Date, matriculado: Boolean): Int
}