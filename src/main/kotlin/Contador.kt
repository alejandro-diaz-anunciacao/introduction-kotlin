package org.ies.tierno

object Contador {
    var cont: Int = 1

    fun inc() = cont++
}


fun main() {

    Contador.inc()

    Contador.inc()

    print(Contador.cont)
}