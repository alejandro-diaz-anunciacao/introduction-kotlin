package org.ies.tierno.colections

fun totalPrice(orders: List<Order>): Double = orders.sumOf { it.price }

fun main() {
    val orders = listOf(
        Order(id = 1, price = 45.5, items = emptyList()),
        Order(id = 2, price = 120.0, items = emptyList()),
        Order(id = 3, price = 15.99, items = emptyList())
    )

    println("La suma total de los pedidos es de: " + totalPrice(orders))
}