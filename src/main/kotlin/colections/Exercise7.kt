package org.ies.tierno.colections

fun pares(numbers: List<Int>): List<Int> = numbers.filter { it % 2 == 0}

fun main() {
    val numbers = listOf<Int>(7, 3, 2, 8, 4, 10, 5, 17, 9)

    println(pares(numbers))
}