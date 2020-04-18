package com.example.demo.in_action.s.chapter_5_2

val people = listOf(Person("Alice", 29), Person("Bob", 31))
fun main() {
    println(people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("A") }
        .toList()
    )
    println(people.map(Person::name).filter { it.startsWith("A") })
    /*That means this chain of calls will create two lists:
    * one to hold the results of the filter function and another for the results of map.*/
}