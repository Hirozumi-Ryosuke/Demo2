package com.example.demo.kotlin_1

import kotlin.math.abs

data class Plan(val t: Int, val x: Int, val y: Int)
fun main(){
    val n = readLine()!!.toInt()
    val plans = Array(n + 1) {
        when (it) {
            0 -> Plan(0, 0, 0)
            else -> {
                val (t, x, y) = readLine()!!.split(" ").map(String::toInt)
                Plan(t, x, y)
            }
        }
    }
    (0 until n).forEach { k ->
        val dt = plans[k + 1].t - plans[k].t
        val distance = abs(plans[k + 1].x - plans[k].x) + abs(plans[k + 1].y - plans[k].y)
        when {
            (distance <= dt && distance % 2 == dt % 2).not() -> {
                println("No")
                return
            }
        }
    }
    println("Yes")
}