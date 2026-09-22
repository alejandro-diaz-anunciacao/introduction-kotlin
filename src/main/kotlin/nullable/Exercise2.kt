package org.ies.tierno.nullable

import kotlin.system.measureNanoTime

fun printName(nombre: String?) {
    // Imprime unicamente si nombre no es null
    nombre?.let { println(nombre) } ?: println("Nombre desconocido")

}

fun main() {
    val nombre = null
    printName(nombre)
}