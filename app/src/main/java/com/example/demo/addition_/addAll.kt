package com.example.demo.addition_

import java.util.HashSet

fun main() {
    class CountingSet<T>(
        val innerSet: MutableCollection<T> = HashSet<T>()
    ) : MutableCollection<T> by innerSet {

        var objectsAdded = 0

        override fun add(element: T): Boolean {
            objectsAdded++
            return innerSet.addAll(listOf(element))
        }

        override fun addAll(c: Collection<T>): Boolean {
            objectsAdded += c.size
            return innerSet.addAll(c)
        }
    }

    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}
