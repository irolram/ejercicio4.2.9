
fun main() {
    val tarea1 = Tarea(45345, "Limpiar vasos")
    val tarea2 = Tarea(45433, "Comerciar")
    val tarea3 = Tarea(1433, "Pescar")


    val conjuntoDeTarea = ConjuntoTareas()

    conjuntoDeTarea.agregarTarea(tarea1)
    conjuntoDeTarea.agregarTarea(tarea2)
    conjuntoDeTarea.agregarTarea(tarea3)

    conjuntoDeTarea.eliminarTareas(tarea1.id)
    conjuntoDeTarea.cambiarEstadoTarea(tarea2)
    conjuntoDeTarea.mostrarTareasPendientes()
    conjuntoDeTarea.mostrarTareasRealizadas()


}