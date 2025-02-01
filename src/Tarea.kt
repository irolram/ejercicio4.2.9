class Tarea(var id: Int, val descripcion: String, var estado: String = "Pendiente") {

    var fecha: String = ""



    override fun toString(): String {

        if (estado == "Pendiente"){
            return "Tarea(id=$id, estado=$estado, descripcion='$descripcion')"
        }else{
            return "Tarea(id=$id, estado=$estado, descripcion='$descripcion', fecha='$fecha')"
        }

    }
}