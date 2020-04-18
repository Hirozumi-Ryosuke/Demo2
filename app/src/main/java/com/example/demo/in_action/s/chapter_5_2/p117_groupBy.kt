package com.example.demo.in_action.s.chapter_5_2

data class Person(val name: String, val age: Int)
fun main() {
    val people = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
    println(people.groupBy { it.age })

    val list = listOf("a", "ab", "b", "abc", "aa", "bba", "d", "cdda")
    println(list.groupBy(String::first))
    println(list.groupBy(String::indices))
    println(list.groupBy(String::length))
    println(list.groupBy(String::lastIndex))
    println(list.groupBy(String::javaClass))
    println(list.groupBy(String::last))
    println(list.groupBy(String::random))
    println(list.groupBy(String::random))
}