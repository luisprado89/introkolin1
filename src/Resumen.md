# Variables en Kotlin

Kotlin permite declarar variables de forma sencilla con tipos estáticos (determinados en tiempo de compilación). Este archivo resume los tipos de variables y las formas de declararlas, además de incluir conceptos clave del lenguaje.

---

## **1. Tipos de variables en Kotlin**

### **a. Mutable (`var`)**
- Usamos `var` para declarar variables que pueden cambiar su valor después de ser asignadas.
- Ejemplo:
  ```kotlin
  var edad: Int = 25  // Declaración con tipo explícito
  edad = 30           // Actualización del valor
  ```

### **b. Inmutable (`val`)**
- Usamos `val` para declarar variables cuyo valor no puede cambiar después de ser inicializadas. Son similares a las constantes.
- Ejemplo:
  ```kotlin
  val nombre: String = "Ana"  // Declaración con tipo explícito
  // nombre = "Luis"          // Esto genera un error
  ```

---

## **2. Formas de declarar variables**

### **a. Con inferencia de tipos**
- Kotlin puede deducir el tipo de la variable a partir del valor asignado.
- Ejemplo:
  ```kotlin
  var ciudad = "Madrid"  // Se infiere como String
  val temperatura = 20   // Se infiere como Int
  ```

### **b. Con tipo explícito**
- Puedes especificar el tipo de la variable después de su nombre.
- Ejemplo:
  ```kotlin
  var altura: Double = 1.75  // Tipo explícito
  val activo: Boolean = true
  ```

---

## **3. Tipos de datos básicos**

| **Tipo**   | **Descripción**                           | **Ejemplo de uso**     |
|------------|-------------------------------------------|------------------------|
| `Int`      | Números enteros                          | `var edad: Int = 25`   |
| `Double`   | Números decimales de doble precisión      | `val pi: Double = 3.14`|
| `Float`    | Números decimales de precisión simple     | `var peso: Float = 60.5f` |
| `Long`     | Enteros de gran tamaño                   | `val poblacion: Long = 7000000000L` |
| `Short`    | Enteros pequeños                         | `var codigo: Short = 42` |
| `Byte`     | Enteros de 8 bits                        | `val nivel: Byte = 127` |
| `Boolean`  | Valores lógicos                          | `val activo: Boolean = true` |
| `Char`     | Un único carácter                        | `val inicial: Char = 'A'` |
| `String`   | Una cadena de texto                      | `val saludo: String = "Hola"` |

---

## **4. Declaración con valores nulos**

En Kotlin, los valores nulos son controlados de manera explícita. Para que una variable acepte `null`, el tipo debe ser declarado con un signo de interrogación (`?`).

- Ejemplo:
  ```kotlin
  var nombre: String? = null  // Puede ser nulo
  nombre = "Luis"
  ```

Para acceder a las variables que pueden ser nulas sin causar errores, se utilizan mecanismos como:
- **Elvis operator (`?:`)**: Proporciona un valor por defecto.
- **Safe call (`?.`)**: Evita acceder al valor si es nulo.

---

## **5. Variables constantes**

Si necesitas declarar valores que nunca cambian durante la ejecución del programa, usa `const val`. Esto se hace a nivel de clase o global, no dentro de funciones.

- Ejemplo:
  ```kotlin
  const val PI = 3.14159
  ```

---

## **6. Bucles en Kotlin**

### **a. Bucle `for`**
Se utiliza para iterar sobre rangos, matrices, listas o cualquier estructura iterable.
- Ejemplo:
  ```kotlin
  for (i in 1..5) {
      println(i)  // Imprime 1, 2, 3, 4, 5
  }

  val lista = listOf("A", "B", "C")
  for (elemento in lista) {
      println(elemento)
  }
  ```

### **b. Bucle `while`**
Ejecuta un bloque de código mientras la condición sea verdadera.
- Ejemplo:
  ```kotlin
  var contador = 0
  while (contador < 5) {
      println(contador)
      contador++
  }
  ```

### **c. Bucle `do-while`**
Se ejecuta al menos una vez, incluso si la condición es falsa.
- Ejemplo:
  ```kotlin
  var numero = 0
  do {
      println(numero)
      numero++
  } while (numero < 5)
  ```

---
# Resumen sobre Arrays y Listas en Kotlin

## Arrays en Kotlin

Un **array** en Kotlin es una estructura de datos que contiene elementos del mismo tipo y tamaño fijo. Los arrays permiten almacenar un número específico de elementos que no cambia una vez que se ha creado el array.

### Tipos de Arrays en Kotlin

1. **Array de tipo genérico**
    - Usando la función `arrayOf()`, se puede crear un array de cualquier tipo.
   ```kotlin
   val numeros = arrayOf(1, 2, 3, 4, 5)  // Array de enteros
   val palabras = arrayOf("Kotlin", "Java")  // Array de cadenas
    ```

# Tipos de **Arrays**, **Listas**, **Colecciones** y **Mapas** en Kotlin

## Arrays

| **Tipo**                          | **Descripción**                                                       | **Ejemplo de uso**                                                    |
|-----------------------------------|-----------------------------------------------------------------------|----------------------------------------------------------------------|
| `Array`                           | Estructura de datos con un tamaño fijo y elementos del mismo tipo.    | `val array = arrayOf(1, 2, 3)`                                        |
| `IntArray` (Array de enteros)     | Array especializado para almacenar enteros.                          | `val arrayInt = intArrayOf(1, 2, 3)`                                  |
| `DoubleArray` (Array de dobles)   | Array especializado para almacenar números decimales.                | `val arrayDouble = doubleArrayOf(1.1, 2.2, 3.3)`                      |
| `BooleanArray` (Array de booleanos)| Array especializado para almacenar valores booleanos.                 | `val arrayBoolean = booleanArrayOf(true, false, true)`                 |
| `CharArray` (Array de caracteres) | Array especializado para almacenar caracteres.                       | `val arrayChar = charArrayOf('a', 'b', 'c')`                           |

## Listas

| **Tipo**                          | **Descripción**                                                       | **Ejemplo de uso**                                                    |
|-----------------------------------|-----------------------------------------------------------------------|----------------------------------------------------------------------|
| `List` (Inmutable)                | Lista de tamaño fijo que no puede modificarse.                        | `val listaInmutable = listOf(1, 2, 3)`                                |
| `MutableList` (Mutable)           | Lista de tamaño variable que permite modificaciones.                  | `val listaMutable = mutableListOf(1, 2, 3)`                          |
| `ArrayList` (Mutable)             | Lista dinámica de tamaño variable, permite agregar, eliminar y modificar elementos. | `val listaMutable = arrayListOf(1, 2, 3)`                            |

## Conjuntos (Sets)

| **Tipo**                          | **Descripción**                                                       | **Ejemplo de uso**                                                    |
|-----------------------------------|-----------------------------------------------------------------------|----------------------------------------------------------------------|
| `Set` (Inmutable)                 | Colección de elementos únicos, no permite duplicados.                 | `val conjunto = setOf(1, 2, 3)`                                       |
| `MutableSet` (Mutable)            | Conjunto de elementos únicos que permite modificaciones.              | `val conjuntoMutable = mutableSetOf(1, 2, 3)`                         |

## Mapas

| **Tipo**                          | **Descripción**                                                       | **Ejemplo de uso**                                                    |
|-----------------------------------|-----------------------------------------------------------------------|----------------------------------------------------------------------|
| `Map` (Inmutable)                 | Mapa de pares clave-valor donde las claves no se repiten.             | `val mapa = mapOf(1 to "uno", 2 to "dos")`                            |
| `MutableMap` (Mutable)            | Mapa de pares clave-valor que permite agregar, eliminar o modificar. | `val mapaMutable = mutableMapOf(1 to "uno", 2 to "dos")`              |

## Resumen:
- **Inmutables**:
    - `List`, `Set`, `Map`: No puedes modificar su contenido una vez creadas.
- **Mutables**:
    - `MutableList`, `MutableSet`, `MutableMap`: Permiten agregar, eliminar o modificar elementos.

Este cuadro resume las principales colecciones de datos que puedes usar en Kotlin, tanto en su forma inmutable como mutable, junto con algunos ejemplos básicos.



---
## **7. Smart Casts**
Kotlin verifica automáticamente el tipo de una variable antes de usarla, eliminando la necesidad de conversiones manuales.
- Ejemplo:
  ```kotlin
  fun imprimirLongitud(obj: Any) {
      if (obj is String) {
          println(obj.length)  // Smart cast a String
      }
  }
  ```

---

## **8. Funciones**

### **Declaración básica**
- Ejemplo:
  ```kotlin
  fun suma(a: Int, b: Int): Int {
      return a + b
  }

  val resultado = suma(3, 5)
  println(resultado)  // Imprime 8
  ```

### **Funciones de una sola línea**
- Ejemplo:
  ```kotlin
  fun cuadrado(x: Int) = x * x
  ```

---

## **9. Programación orientada a objetos (POO)**

### **a. Clases y objetos**
- Ejemplo:
  ```kotlin
  class Persona(val nombre: String, var edad: Int) {
      fun presentarse() {
          println("Hola, me llamo $nombre y tengo $edad años.")
      }
  }

  val persona = Persona("Ana", 25)
  persona.presentarse()
  ```

### **b. Herencia y polimorfismo**
- Ejemplo:
  ```kotlin
  open class Animal {
      open fun sonido() {
          println("Sonido genérico de animal")
      }
  }

  class Perro : Animal() {
      override fun sonido() {
          println("Ladrido")
      }
  }

  val animal: Animal = Perro()
  animal.sonido()  // Imprime "Ladrido"
  ```

### **c. Encapsulamiento**
- Ejemplo:
  ```kotlin
  class CuentaBancaria(private var saldo: Double) {
      fun depositar(cantidad: Double) {
          saldo += cantidad
      }

      fun obtenerSaldo(): Double {
          return saldo
      }
  }
  ```

### **d. Interfaces**
- Ejemplo:
  ```kotlin
  interface Volador {
      fun volar()
  }

  class Avion : Volador {
      override fun volar() {
          println("El avión está volando")
      }
  }
  ```

### **e. Clases abstractas**
- Ejemplo:
  ```kotlin
  abstract class Figura {
      abstract fun calcularArea(): Double
  }

  class Circulo(private val radio: Double) : Figura() {
      override fun calcularArea(): Double {
          return Math.PI * radio * radio
      }
  }
  ```

---

## **10. Corrutinas**
Permiten manejar operaciones asíncronas de manera eficiente.
- Ejemplo básico:
  ```kotlin
  import kotlinx.coroutines.*

  fun main() = runBlocking {
      launch {
          delay(1000L)
          println("Corrutina finalizada")
      }
      println("Inicio")
  }
  ```

---

## **11. Expresiones lambda**
Funciones anónimas que pueden ser almacenadas en variables o pasadas como argumentos.
- Ejemplo:
  ```kotlin
  val suma = { a: Int, b: Int -> a + b }
  println(suma(3, 5))  // Imprime 8
  ```

---

## 
