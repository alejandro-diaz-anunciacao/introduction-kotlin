package org.ies.tierno.colections

fun sum(numbers: List<Double>): Double = numbers.sum()

// fun sum (numbers: List<Double): Double = numbers.reduce { a, b -> a + b }

fun main() {
    val numbers = listOf<Double>(3.4, 6.0, 8.9, 4.7)

    println("La suma de todos los números es: " + sum(numbers))
}