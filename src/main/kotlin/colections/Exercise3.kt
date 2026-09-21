package org.ies.tierno.colections

fun last(list: List<Int>): Int = list.last()

fun main() {
    val numbers = listOf<Int>(3, 64, 136, 2, 0, 14)

    println(numbers.last())
}