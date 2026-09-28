package org.ies.tierno.nullable

fun min(numbers: List<Double>): Double? = numbers.ifEmpty { null }?.min()

fun main() {
    val numbers = listOf<Double>(3.1, 5.2)

    println(min(numbers))
}