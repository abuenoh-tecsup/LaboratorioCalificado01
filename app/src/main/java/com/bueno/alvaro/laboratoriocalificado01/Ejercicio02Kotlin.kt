package com.bueno.alvaro.laboratoriocalificado01

class Ejercicio02Kotlin {

    fun contarVocales() {
        println("Ingrese una frase o palabra:") // Pedimos al usuario que ingrese un texto
        val texto = readLine() ?: "" // Leemos el texto ingresado, si no se ingresa valor se guarda como string vacio

        var contador = 0 // Creamos una variable para contar la cantidad de vocales

        // Recorremos cada letra del texto en minúscula
        for (letra in texto.lowercase()) {
            // Si la letra es igual a alguna de las vocales
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++ // Aumentamos el contador en 1
            }
        }

        // Mostramos en consola el valor final del contador
        println("El texto tiene $contador vocales")
    }
}

// main para ejecutar
fun main() {
    val ejercicio = Ejercicio02Kotlin() // Creamos una instancia de la clase Ejercicio02Kotlin
    ejercicio.contarVocales() // Utilizamos la función que definimos anteriormente
}
