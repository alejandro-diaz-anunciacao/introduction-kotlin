package org.ies.tierno.colections

data class Order(val id: Int, val price: Double, val items: List<OrderItem>)
data class OrderItem(val itemId: Int, val price: Double)

fun orderPrice(orders: List<Order>): List<Double> = orders.map { it.price }

fun main() {
    val orders = listOf(
        Order(id = 1, price = 45.5, items = emptyList()),
        Order(id = 2, price = 120.0, items = emptyList()),
        Order(id = 3, price = 15.99, items = emptyList())
    )

    println(orderPrice(orders))
}