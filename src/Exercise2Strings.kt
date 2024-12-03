fun main() {
    //Menu de opciones
    println("Elige un ejercicio:")
    println("1. Concatenar dos cadenas")
    println("2. Sustituir un carácter en una frase")
    println("3. Borrar un carácter al principio o al final de una frase")
    println("4. Duplicar las dos primeras letras de una palabra")
    println("5. Comprobar que los 2 primeros y los 2 últimos caracteres son iguales")
    println("6. Comprobar que 2 textos son iguales sin tener en cuenta mayúsculas")
    print("Ingresa el número del ejercicio: ")
    // Lee la línea de texto ingresada por el usuario,
    val opcion = readLine()?.toIntOrNull()?: return
    // ?.toIntOrNull() Intenta convertir la entrada a un número entero (Int), si la entrada no es válida, se devuelve null
    // Si la conversión a número es nula (es decir, la entrada no es un número válido), se termina la función
    // ?: return Si es null, ejecuta el operador Elvis y ejecuta "return", lo que termina la función inmediatamente

// Usamos un bloque 'when' para seleccionar la opción
    when (opcion) {
        1 -> { 
            println("Ejercicio 1: Concatenar dos cadenas")
            print("Introduce la primera cadena: ")
            val cadena1 = readLine() ?: ""  // Lee la primera cadena, y si no se proporciona nada, asigna una cadena vacía
            print("Introduce la segunda cadena: ")
            val cadena2 = readLine() ?: ""  // Lee la segunda cadena, y si no se proporciona nada, asigna una cadena vacía
            val resultado = concatenateStrings(cadena1, cadena2)  // Llama a la función para concatenar las cadenas
            println("Resultado de la concatenación: $resultado")  // Muestra el resultado de la concatenación
        }
        else -> println("Opción no válida.")  // Si el usuario elige una opción no válida, muestra un mensaje de error
    }
}
fun concatenateStrings(cadena1: String, cadena2: String): String {
    //Ejercicio 1
    //Crea una función que dados 2 strings los concatene y los devuelva
    //Ejemplo:
    //"esta es una cadena" y "otra cadena" -> "esta es una cadenaotra cadena"

    return cadena1 + cadena2  // Devuelve la concatenación de las dos cadenas
}
