package com.example.demo.in_action.s.chapter_8

enum class Delivery { EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    when (delivery) {
        Delivery.EXPEDITED ->
            return { order -> 6 + 2.1 * order.itemCount }
        else ->
            return { order -> 1.2 * order.itemCount }
    }
}

fun main() {
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println("Shipping costs ${calculator(Order(3))}")
}