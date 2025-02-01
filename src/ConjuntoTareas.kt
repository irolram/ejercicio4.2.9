import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class ConjuntoTareas() {

    val tareas: MutableSet<Tarea> = mutableSetOf()

    companion object {

        fun generarFecha():String {
            val fechaHoraActual: LocalDateTime = LocalDateTime.now()
            // Formatear la fecha y hora para imprimir
            val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
            val fechaFormateada: String = fechaHoraActual.format(formatter)

            return fechaFormateada

        }
    }

    fun eliminarTareas(id: Int) {

        var tareaEliminada: Tarea? = null

        for (tarea in tareas) {
            if (tarea.id == id) {
                tareaEliminada = tarea
            }
        }
        tareas.remove(tareaEliminada)
    }

    fun agregarTarea(tarea: Tarea) {

        tareas.add(tarea)
    }

    fun cambiarEstadoTarea(tarea: Tarea) {

        if (tarea.estado == "Pendiente") {
            tarea.estado = "Realizado"
            tarea.fecha = generarFecha()
        }

    }

    fun mostrarTareasPendientes() {

        for (tarea in tareas) {

            if (tarea.estado == "Pendiente") {
                println(tarea)
            }
        }

    }
    fun mostrarTareasRealizadas(){
        for (tarea in tareas) {
            if (tarea.estado == "Realizado") {
                println(tarea)

            }
        }
    }
}