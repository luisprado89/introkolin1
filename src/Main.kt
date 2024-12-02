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
    val num1 = 10
    val num2 = 2
    val resultado = num1 / num2
    println("La division de $num1/$num2 es : $resultado")
}