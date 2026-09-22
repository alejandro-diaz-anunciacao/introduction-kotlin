package org.ies.tierno.colections

fun junction(numbers1: List<Double>, numbers2: List<Double>): List<Double> =
        numbers1.union(numbers2).toList()

fun main() {
    val numbers1 = listOf<Double>(3.4, 6.0, 8.9, 4.7)
    val numbers2 = listOf<Double>(7.4, 8.9, 3.4, 34.1)

    val union = junction(numbers1, numbers2)
    println(union)
}