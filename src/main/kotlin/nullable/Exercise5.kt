package org.ies.tierno.nullable

fun average(numbers: List<Double>): Double? = numbers.ifEmpty { null }?.average()

fun main() {
    val numbers = listOf<Double>(3.0, 7.1)

    println(average(numbers))
}