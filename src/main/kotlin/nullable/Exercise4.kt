package org.ies.tierno.nullable

fun first(numbers: List<Int>?): Int? = numbers?.firstOrNull()

fun main() {
    var numbers = listOf<Int>()

    println(first(numbers))
}