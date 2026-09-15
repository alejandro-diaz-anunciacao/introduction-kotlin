package org.ies.tierno

fun averageImperativo(n1: Int, n2: Int, n3: Int, n4: Int): Double =
    (n1 + n2 + n3 + n4).toDouble() / 4

fun average(n1: Int, n2: Int, n3: Int, n4: Int): Double =
    listOf(n1, n2, n3, n4).average()


fun main() {
    println(average(6, 3, 4, 5))
    println(averageImperativo(6, 3, 4, 5))
}