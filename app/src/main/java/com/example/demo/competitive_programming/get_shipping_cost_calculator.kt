package com.example.demo.competitive_programming
enum class Delivery { EXPEDITED }

fun main() {

    class Order(val itemCount: Int)

    fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
        when (delivery) {
            Delivery.EXPEDITED -> return { order -> 6 + 2.1 * order.itemCount }
            else -> return { order -> 1.2 * order.itemCount }
        }
    }
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println("Shipping costs ${calculator(Order(3))}")

}