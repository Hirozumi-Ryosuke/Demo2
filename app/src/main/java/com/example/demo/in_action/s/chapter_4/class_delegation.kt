package com.example.demo.in_action.s.chapter_4

fun main() {
    class CountingSet<T>(
        val innerSet: MutableCollection<T> = HashSet()
    ) : MutableCollection<T> by innerSet {

        var objectsAdded = 0

        override fun add(element: T): Boolean {
            objectsAdded++
            return innerSet.add(element)
        }

        override fun addAll(elements: Collection<T>): Boolean {
            objectsAdded += elements.size
            return innerSet.addAll(elements)
        }
    }
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 2, 3))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
    val cset2 = CountingSet<Int>()
    cset2.addAll(listOf(1, 1, 1))
    println("${cset2.objectsAdded} objects were added, ${cset2.size} remain")
    val cset3 = CountingSet<Int>()
    cset3.addAll(listOf(1, 2, 1))
    println("${cset3.objectsAdded} objects were added, ${cset3.size} remain")
}