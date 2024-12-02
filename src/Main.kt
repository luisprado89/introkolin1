fun main() {
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
    suma()
    multiplicacion()
    division()
    division2Enteros()

}
fun suma(){
    val num1 = 2
    val num2 = 2
    val resultado = num1+num2
    println("La suma de $num1 + $num2 es: $resultado")
}
fun multiplicacion(){
    val num1 = 2
    val num2 = 5
    val resultado = num1 * num2
    println("La multiplicación de $num1 * $num2 es: $resultado")
}
fun division(){
    val num1 = 5
    val num2 = 0
    val num3 = 5
    val num4 = 2

    // Realizamos las divisiones, controlando si el divisor es 0
    val resultado1 = if (num2 != 0) num1.toDouble() / num2 else null
    val resultado2 = if (num4 != 0) num3.toDouble() / num4 else null

    // Imprimimos los resultados
    if (resultado1 != null) {
        println("La division de $num1/$num2 es : $resultado1")
    } else {
        println("La division de $num1/$num2 es: null (división por cero)")
    }

    if (resultado2 != null) {
        println("La division de $num3/$num4 es : $resultado2")
    } else {
        println("La division de $num3/$num4 es: null (división por cero)")
    }
}
fun division2Enteros(){
    val num1 = 5
    val num2 = 2

    // Realizamos la división, controlando si el divisor es 0
    val resultado = if (num2 != 0) num1 / num2 else null

    // Imprimimos el resultado
    if (resultado != null) {
        println("La division de $num1/$num2 es : $resultado")
    } else {
        println("La division de $num1/$num2 es: null (división por cero)")
    }
}