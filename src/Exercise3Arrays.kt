fun main() {
    println("Elige un ejercicio:")
    println("1. Insertar un número en una posición del array")
    println("2. Verificar si existe un número en un conjunto de enteros")
    println("3. Contar las repeticiones de un número en un conjunto")
    println("4. Ordenar un conjunto de enteros de mayor a menor sin usar sort")
    println("5. Añadir un elemento a un array de cadenas")
    println("6. Encontrar el primer número faltante en un conjunto entre 1 y 1,000,000")
    println("---------------------------------------------------------------------------")
    print("Ingresa el número del ejercicio: ")

    val opcion = readLine()?.toIntOrNull() ?: return

    when (opcion) {


        else -> println("Opción no válida.")
    }
}
