package com.example.demo.in_action.s.chapter_8

fun main() {
    data class Person(val name: String, val age: Int)

    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    fun lookForAlice(people: List<Person>) {
        people.forEach {
            if (it.name == "Alice") {
                println("Found!")
                return
            }
        }
        println("Alice is not found")
    }
    lookForAlice(people)
}