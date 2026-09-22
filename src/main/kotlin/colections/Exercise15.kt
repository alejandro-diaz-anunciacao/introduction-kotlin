package org.ies.tierno.colections

fun orderItems(orders: List<Order>): List<OrderItem> = orders.flatMap { it.items }

fun main() {
    val orders = listOf(
        Order(
            id = 1,
            price = 45.5,
            items = listOf(OrderItem(itemId = 1, price = 20.0), OrderItem(itemId = 2, price = 25.5))
        ),
        Order(
            id = 2,
            price = 120.0,
            items = listOf(OrderItem(itemId = 3, price = 120.0))
        ),
        Order(
            id = 3,
            price = 15.99,
            items = emptyList()
        )
    )

    println(orderItems(orders))
}