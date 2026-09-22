package org.ies.tierno.colections

fun max(numbers: List<Double>): Double? =
    if (numbers.isEmpty()) null else numbers.max()

fun main() {
    val numbers = listOf<Double>(3.4, 6.0, 8.9, 4.7)

    println("El número mayor es: " + max(numbers))
}