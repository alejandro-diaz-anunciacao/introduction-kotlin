package org.ies.tierno.nullable

fun max(numbers: List<Double>): Double? = numbers.ifEmpty { null }?.max()

fun main() {
    val numbers = listOf<Double>(3.1, 5.2)

    println(max(numbers))
}