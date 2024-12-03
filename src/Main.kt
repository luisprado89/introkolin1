import java.util.Scanner

val  scanner = Scanner(System.`in`)//Usamos Scanner para recibir datos por teclado

fun main() {
    //principal()
    //exercise1()
    //exercise2()
    //exercise3()
    //exercise4()
    //exercise5()
    exercise6()

}//main

fun principal(){

    //1. Tipos de datos
    //Enteros
    val integer: Int = 29
    val long: Long = 1000000000L

    //Flotante
    val float: Float = 3.14f
    val double: Double = 3.1415926500054343

    //Booleanos
    var isFavorite: Boolean = true
    isFavorite = false

    //Caracteres (Char)
    val character: Char = 'k'
    //Cadenas (Los famosos Strings)
    val regards: String = "Hola mundo"
    // Imprimir por terminal
    println("Entero: "+integer)
    println("Long: "+long)
    println("isFavorite: "+isFavorite)
    println("regards: "+regards)


    /*
    Operadores de comparación

    == (Igual a): Compara si dos valores son iguales. Devuelve true si lo son, false en caso contrario.
    != (Distinto de): Compara si dos valores son diferentes. Devuelve true si lo son, false en caso contrario.
    < (Menor que): Devuelve true si el primer valor es menor que el segundo, false en caso contrario.
    > (Mayor que): Devuelve true si el primer valor es mayor que el segundo, false en caso contrario.
    <= (Menor o igual a): Devuelve true si el primer valor es menor o igual al segundo, false en caso contrario.
    >= (Mayor o igual a): Devuelve true si el primer valor es mayor o igual al segundo, false en caso contrario.
     */
    /*
    El if y el else son estructuras de control de flujo en programación que permiten tomar decisiones basadas en condiciones. En esencia:

    if: Significa "si" en inglés. Evalúa una condición. Si la condición es verdadera (true), ejecuta un bloque de código.
    else: Significa "sino". Se utiliza para ejecutar otro bloque de código cuando la condición del if es falsa (false).

    Funcionamiento básico

    if revisa una condición.
    Si la condición es verdadera, ejecuta el bloque de código asociado al if.
    Si la condición es falsa y existe un else, ejecuta el bloque de código asociado al else.
    */

    val numero = 5
    val resultado = if (numero > 0) "Positivo" else "Negativo o Cero"
    println(resultado)


    //2. Bucles
    //For(y sus derivados), while, doWhile
    for (i in 0..5){
        println("Value for i; "+i)
    }
    for (i in 0..5 step 2){
        println("Value for i de 2 en 2; "+i)
    }

    //while
    var valueA = 3
    var valueB = 10

    while (valueA < valueB){
        //formas de incrementar el valor
        //valueA++
        //valueA.inc()// aveces da problemas este
        //valueA= valueA+1
        valueA+=1
        println("Hola soy pepe.")
    }

    do {
        valueA++
    }while (valueA<valueB)

    //3. When (Cases)<- Switch en Java
    val day = 5

    when(day){
        1 -> println("Hoy es Lunes")
        2 -> println("Hoy es Martes")
        3 -> println("Hoy es Miercoles")
        4 -> println("Hoy es Jueves")
        5 -> println("Hoy es Viernes")
        6 -> println("Hoy es Sabado")
        7 -> println("Hoy es Domingo")
        else->{
            println("No has ingresado un dia valido")
        }
    }
}

fun exercise1(){
    //Ejercicio 1
    //Crea una función que dado 2 números enteros los sume y devuelva el resultado
    //Ejemplo: 2+2 -> 4

    println("Ejercicio 1: Suma")
    print("Introduce el primer número: ")
    val num1 = scanner.nextInt()
    print("Introduce el segundo número: ")
    val num2 = scanner.nextInt()
    val resultado = num1 + num2
    println("La suma de $num1 + $num2 es: $resultado")
}
fun exercise2() {
    //Ejercicio 2
    //Crea una función que dado 2 números enteros los multiplique y devuelva el resultado
    //Ejemplo:    2*2 -> 4

    println("Ejercicio 2: Multiplicación")
    print("Introduce el primer número: ")
    val num1 = scanner.nextInt()
    print("Introduce el segundo número: ")
    val num2 = scanner.nextInt()
    val resultado = num1 * num2
    println("La multiplicación de $num1 * $num2 es: $resultado")
}
fun exercise3() {
    //Ejercicio 3
    //Crea una función que dado 2 números enteros (dividendo y divisor) los divida y devuelva el resultado solo si el divisor no es 0 en caso contrario devuelve nulo
    //Ejemplo:
    //5/0 -> null
    //5/2 -> 2,5

    println("-------------------------------------------")
    print("Introduce el primer número: ")
    val num1 = scanner.nextInt()
    print("Introduce el segundo número: ")
    val num2 = scanner.nextInt()

    val resultado = if (num2 != 0) num1.toDouble() / num2 else null

    if (resultado != null) {
        println("La división de $num1/$num2 es: $resultado")
    } else {
        println("La división de $num1/$num2 es: null (división por cero)")
    }
}
fun exercise4() {
    //Ejercicio 4
    //Crea una función que dado 2 números enteros los divida y devuelva la parte entera de la división. Si el divisor es 0 devuelve nulo
    //Ejemplo:     5/2 -> 2
    println("-------------------------------------------")
    print("Introduce el primer número: ")
    val num1 = scanner.nextInt()
    print("Introduce el segundo número: ")
    val num2 = scanner.nextInt()

    val resultado = if (num2 != 0) num1 / num2 else null

    if (resultado != null) {
        println("La división entera de $num1/$num2 es: $resultado")
    } else {
        println("La división de $num1/$num2 es: null (división por cero)")
    }
}
fun exercise5(){
    //Ejercicio 5
    //Crea una función que calcule el porcentaje de victorias de un equipo de futbol según los partidos que ha jugado y los que ha ganado
    //Ejemplo:
    //jugados 10 partidos ganados 9 -> 90%

    print("Introduce los partidos Jugados: ")
    val partidosJugados = scanner.nextInt()

    print("Introduce los partidos Ganados: ")
    val partidosGanados = scanner.nextInt()

    // Verificamos que no se haya jugado 0 partidos para evitar una división por cero
    if (partidosJugados != 0) {
        // Calculamos el porcentaje de victorias
        // Convertimos a Double para que el cálculo sea en punto flotante por que sino nos da error
        val porcentaje = (partidosGanados.toDouble() / partidosJugados) * 100
        // Imprimimos el resultado con formato
        println("El porcentaje de victorias es: %.0f%%".format(porcentaje))//Aplicamos format a la constante
        /*Plantilla .format en Kotlin  https://sparkbyexamples.com/kotlin/format-string-in-kotlin-with-examples/
        %d: Formato para enteros (decimal).
        %f: Formato para números de punto flotante (double, float).// pi = 3.14159 -> .format("%.2f",pi) sou 3.14
        %s: Formato para cadenas de texto.
        %x: Formato para enteros en hexadecimal.
        %%: Representa el símbolo % literal. ->  necesario para mostrar por pantalla -> 90%
        */
    } else {
        // Si no se han jugado partidos, mostramos un mensaje adecuado
        println("No se puede calcular el porcentaje de victorias (ningún partido jugado).")
    }
}
fun exercise6(){
    //Ejercicio 6
    //Crea una función que dados 2 números devuelva el de mayor valor
    //Ejemplo:
    //4 y 7 -> 7

    println("-------------------------------------------")
    print("Introduce el primer número: ")
    val num1 = scanner.nextInt()
    print("Introduce el segundo número: ")
    val num2 = scanner.nextInt()
    //Verificamos el numero mayor entre num1 y num2
    val mayor = if (num1>num2) num1 else num2
    //Imprimimos el resultado por pantalla
    println("El mayor entre $num1 y $num2 es: $mayor")
}