package org.ies.tierno.lambdas

fun main() {
    val sum: (Int, Int) -> Int = {a, b -> a + b}
    val print: () -> Unit = {println("Hola mundo")}
}