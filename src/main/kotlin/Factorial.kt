package org.ies.tierno


fun factorialImperativo(n: Int): Int  {
    var res = 1
    for(i in 1..n){
        res *= i
    }
    return res
}

fun factorial(n: Int): Int =
    // 1, 2 ,3, 4
    // 2, 3, 4
    // 6, 4
    // 24
    (1..n).reduce { n1, n2 -> n1 * n2 }



fun main() {
    println(factorialImperativo(6))
    println(factorial(6))
}