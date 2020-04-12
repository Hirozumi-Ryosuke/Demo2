package com.example.demo.addition_

import java.util.HashSet

fun main() {
    class CountingSet<T>(
        val innerSet: MutableCollection<T> = HashSet<T>()
    ) : MutableCollection<T> by innerSet{

        var objectsAdded = 0

        override fun add(element: T): Boolean {
            objectsAdded++
            return innerSet.addAll(listOf(element))
        }

        override fun addAll(elements: Collection<T>): Boolean {
            objectsAdded += elements.size
            return innerSet.addAll(elements)
        }
    }

    val cset = CountingSet<Int>().also {
        it.addAll(listOf(1, 1, 2, 5, 10, 1 ))
    }
    println(cset.objectsAdded.toString() + " objects were added, " + cset.size + " remain")
}
