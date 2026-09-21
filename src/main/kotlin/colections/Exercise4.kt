package org.ies.tierno.colections

fun sum10(numbers: List<Int>) = numbers.map { it + 10 }

fun main() {
    val numbers = listOf<Int>(3, 64, 136, 2, 0, 14)

    val numbersPlus10 = sum10(numbers)

    numbersPlus10.forEach { println(it) }
}