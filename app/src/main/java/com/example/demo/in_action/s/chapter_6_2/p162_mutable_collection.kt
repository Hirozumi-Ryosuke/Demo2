package com.example.demo.in_action.s.chapter_6_2

fun main() {
    fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
        for (item in source) {
            target.add(item)
        }
    }
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println(target)
}