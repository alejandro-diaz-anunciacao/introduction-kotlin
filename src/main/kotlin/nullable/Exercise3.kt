package org.ies.tierno.nullable

import kotlin.system.measureNanoTime

fun getLength(nombre: String?): Int? = nombre?.run { length }

fun main() {
    val nombre = null
    val length = getLength(nombre)
    println(length)
}