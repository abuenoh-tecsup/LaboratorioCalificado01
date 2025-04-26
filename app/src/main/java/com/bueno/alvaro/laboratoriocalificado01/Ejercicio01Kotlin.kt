package com.bueno.alvaro.laboratoriocalificado01

class Ejercicio01Kotlin {

    fun verificarAnagrama(){
        println("Ingrese la primera palabra:") // Pedimos que el usuario ingrese la primera palabra
        val palabra1 = readLine() ?: "" // Leemos el valor ingresado, si no se ingresa valor se guarda como string vacio

        println("Ingrese la segunda palabra:") // Pedimos que el usuario ingrese la segunda palabra
        val palabra2 = readLine() ?: "" // Leemos el valor ingresado, si no se ingresa valor se guarda como string vacio

        if (palabra1.lowercase().toCharArray().sorted() == palabra2.lowercase().toCharArray().sorted())
        // Convertimos ambas palabras en minúsculas, en una lista y la ordenamos para que se pueda comparar si son completamente iguales
        {
            println("Las palabras ingresadas SI son anagramas.") // Si son iguales, se mostrará un mensaje en consola
        } else {
            println("Las palabras ingresadas NO son anagramas.") // Si no son iguales, se mostrará un mensaje en consola
        }
    }
}

// Aquí el main para ejecutar normalmente
fun main() {
    val ejercicio = Ejercicio01Kotlin() // Creamos una instancia de la clase Ejercicio01Kotlin
    ejercicio.verificarAnagrama() // Utilizamos la función que definimos anteriormente
}
