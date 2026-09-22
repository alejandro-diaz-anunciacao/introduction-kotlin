package org.ies.tierno.colections

fun average(numbers: List<Double>): Double? =
    if (numbers.isEmpty()) null else numbers.average()

fun main() {
    val numbers = listOf<Double>(3.4, 6.0, 8.9, 3.2)

    println("La media de todos los números es: " + sum(numbers))
}