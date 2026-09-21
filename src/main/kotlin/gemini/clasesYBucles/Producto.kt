package org.ies.tierno.gemini.clasesYBucles

data class Producto(val nombre: String, val precio: Double)

fun calcularTotal(productos: List<Producto>): Double {
    var precioTotal: Double = 0.0
    for (producto in productos) {
        precioTotal += producto.precio
    }
    return precioTotal
}

fun main() {
    val libro = Producto("Libro", 19.99)
    val gtav = Producto("GTA V", 70.00)
    val lampara = Producto("Lámpara", 14.99)

    var productos = listOf<Producto>(libro, gtav, lampara)
    println(calcularTotal(productos))

}