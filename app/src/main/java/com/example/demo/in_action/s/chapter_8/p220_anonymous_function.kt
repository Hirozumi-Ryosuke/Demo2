package com.example.demo.in_action.s.chapter_8

fun main() {
    data class Person(val name: String, val age: Int)

    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    fun lookForAlice(people: List<Person>) {
        people.forEach(fun (person) {
            if (person.name == "Alice") return
            println("${person.name} is not Alice")
        })
    }
    lookForAlice(people)
}