package com.example.demo.kotlin_2

interface Base {
    val message: String
    fun print()
}

class BaseImpl(val x: Int): Base {
    override val message = "BaseImpl: x = $x"
    override fun print() = println(message)
}

class Derived(b: Base): Base by b {
    override val message = "Message of Derived"
}

fun main() {
    val b = BaseImpl(10)
    val derived = Derived(b)
    derived.print()
    println(derived.message)
}