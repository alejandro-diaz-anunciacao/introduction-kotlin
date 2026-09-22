package org.ies.tierno.nullable

// Devuelve el número, en el caso de ser nulo devuelve 0
fun getOrZero(num: Int?): Int = num?: 0

fun main() {
    val num = null
    println(getOrZero(num))
}