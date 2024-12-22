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
        1 -> {
            // Creamos un array de ejemplo como el enunciado
            val array = mutableListOf(1, 2, 3, 4, 5, 6)

            // Imprimimos el array original
            println("Array original: $array")
            print("Introduce el número a insertar: ")
            val number = readLine()?.toIntOrNull() ?: return println("Número no válido") // Lee el número y valida si es un entero

            print("Introduce la posición en la que insertar el número: ")
            val position = readLine()?.toIntOrNull() ?: return println("Posición no válida") // Lee la posición y valida si es un entero

            // Llamamos a la función para insertar el número
            val result = insertNumber(array, number, position)

            // Si la inserción fue exitosa, mostramos el nuevo array, si no, mostramos un mensaje
            if (result != null) {
                println("Nuevo array: $result")
            } else {
                println("No se pudo insertar el número en la posición indicada.")
            }
        }
        2 -> {
            println("Ejercicio 2: Verificar si existe un número en un conjunto de enteros")
            print("Introduce los números del conjunto separados por comas: ")
            val conjunto = readLine()?.split(",")?.mapNotNull { it.toIntOrNull() }?.toSet() ?: return
            print("Introduce el número a buscar: ")
            val numero = readLine()?.toIntOrNull() ?: return
            val resultado = existeNumero(conjunto, numero)
            println("Resultado: $resultado")
        }
        3 -> {
            println("Ejercicio 3: Contar las repeticiones de un número en un conjunto")
            print("Introduce los números del conjunto separados por comas: ")
            val conjunto = readLine()?.split(",")?.mapNotNull { it.toIntOrNull() } ?: return
            print("Introduce el número a contar: ")
            val numero = readLine()?.toIntOrNull() ?: return
            val resultado = contarRepeticiones(conjunto, numero)
            println("Resultado: $resultado")
        }
        4 -> {
            println("Ejercicio 4: Ordenar un conjunto de enteros de mayor a menor")
            print("Introduce los números del conjunto separados por comas: ")
            val conjunto = readLine()?.split(",")?.mapNotNull { it.toIntOrNull() }?.toMutableList() ?: return
            val resultado = ordenarDescendente(conjunto)
            println("Resultado: $resultado")
        }

        else -> println("Opción no válida.")
    }
}

fun insertNumber(array: MutableList<Int>, number: Int, position: Int): MutableList<Int>? {
//    Ejercicio 1
//    Crea una función que dado un array de números inserte un número en una posición designada.
//    Devuelve el nuevo array o null en caso de que no sea posible
//    Ejemplo:     [1,2,3,4,5,6] inserta 4 en la posición 2 -> [1,2,4,3,4,5,6]
    // Verifica si la posición es válida
    if (position < 0 || position > array.size) {
        return null // Si la posición no es válida, retorna null
    }
    // Inserta el número en la posición indicada
    array.add(position, number)
    return array // Devuelve el array con el número insertado
}

// Ejercicio 2
//    Crea una función que dado un conjunto de enteros devuelva si existe un número dentro de él
//    Ejemplo:
//    [1,2,3,4,5,6] existe 3 -> true


fun existeNumero(conjunto: Set<Int>, numero: Int): Boolean {
    return numero in conjunto
}

// Ejercicio 3
//    Crea una función que dado un conjunto de enteros devuelva el número de veces que se repite un
//    número dado
//    Ejemplo:
//    [1,2,3,4,5,6] número 3 -> 1


fun contarRepeticiones(conjunto: List<Int>, numero: Int): Int {
    return conjunto.count { it == numero }
}

// Ejercicio 4
//    Crea una función que dado un conjunto de enteros los ordene de mayor a menor y devuelva el array
//    resultante. NO SE PUEDE USAR SORT
//    Ejemplo:
//    [6,2,3,4,5,1] -> [1,2,3,4,5,6]


fun ordenarDescendente(conjunto: MutableList<Int>): List<Int> {
    for (i in conjunto.indices) {
        for (j in i + 1 until conjunto.size) {
            if (conjunto[i] < conjunto[j]) {
                val temp = conjunto[i]
                conjunto[i] = conjunto[j]
                conjunto[j] = temp
            }
        }
    }
    return conjunto
}
