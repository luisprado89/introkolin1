
data class Alumno(
    val nombre: String,
    var isApproved: Boolean = true,
    var isProgressing: Boolean = true
) {
    var needHelp: Boolean = false
        private set

    init {
        updateNeedHelp()
    }

    fun updateProgress(isApproved: Boolean, isProgressing: Boolean) {
        this.isApproved = isApproved
        this.isProgressing = isProgressing
        updateNeedHelp()
    }

    private fun updateNeedHelp() {
        needHelp = !isApproved && !isProgressing
    }
}

data class Clase(val nombre: String, val alumnos: MutableList<Alumno>)

fun main() {
    val clase1 = Clase("Clase 1", mutableListOf(
        Alumno("Ana"),
        Alumno("Carlos"),
        Alumno("Laura"),
        Alumno("Pedro", isApproved = true),
        Alumno("Maria"),
        Alumno("Luis", isApproved = false), // Luis está reprobado
        Alumno("Daniela", isApproved = false, isProgressing = false), // Daniela no está progresando
        Alumno("Sofia", isApproved = true),
        Alumno("Mateo", isApproved = true),
        Alumno("Antonio", isApproved = false, isProgressing = false)))

    val clase2 = Clase("Clase 2", mutableListOf(
        Alumno("Juan"),
        Alumno("Paula"),
        Alumno("Diana", isApproved = true),
        Alumno("Ricardo"),
        Alumno("Carmen", isApproved = true),
        Alumno("Julia", isApproved = false), // Julia está reprobada
        Alumno("Jorge",  isApproved = false, isProgressing = false), // Jorge no está progresando
        Alumno("Clara", isApproved = false),
        Alumno("Valeria"),
        Alumno("Tomás", isApproved = false, isProgressing = false)
    ))

    val clases = listOf(clase1, clase2)

    println("Elige un ejercicio:")
    println("1. Crear clases y alumnos")
    println("2. Mostrar alumnos cuyo nombre contiene 'a'")
    println("3. Mostrar alumnos suspendidos que no están progresando")
    println("4. Mostrar alumnos suspendidos que necesitan ayuda")
    println("5. Obtener alumnos suspendidos de todas las clases")
    print("Ingresa el número del ejercicio: ")

    when (readLine()?.toIntOrNull()) {
        1 -> {
            println("Clases creadas:")
            clases.forEach { clase ->
                println("${clase.nombre}:")
                clase.alumnos.forEach { println(it) }
            }
        }
        2 -> {
            println("Alumnos cuyo nombre contiene 'a':")
            clases.forEach { clase ->
                println("${clase.nombre}:")
                clase.alumnos.filter { "a" in it.nombre.lowercase() }.forEach { println(it.nombre) }
            }
        }
        3 -> {
            println("Alumnos suspendidos que no están progresando:")
            clases.forEach { clase ->
                println("${clase.nombre}:")
                clase.alumnos.filter { !it.isApproved && !it.isProgressing }.forEach { println(it.nombre) }
            }
        }
        4 -> {
            println("Alumnos suspendidos que necesitan ayuda:")
            clases.forEach { clase ->
                println("${clase.nombre}:")
                clase.alumnos.filter { it.needHelp }.forEach { println(it.nombre) }
            }
        }
        5 -> {
            println("Alumnos suspendidos de todas las clases:")
            val suspendidos = clases.flatMap { it.alumnos.filter { alumno -> !alumno.isApproved } }
            suspendidos.forEach { println(it.nombre) }
        }
        else -> println("Opción no válida.")
    }
}