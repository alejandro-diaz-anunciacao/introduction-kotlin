package org.ies.tierno


fun sumatorioImperativo(n: Int): Int  {
    var res = 0
    for(i in 1..n){
        res += i
    }
    return res
}

fun sumatorio(n: Int): Int =
    (1..n).sum()



fun main() {
    println(sumatorioImperativo(6))
    println(sumatorio(6))
}