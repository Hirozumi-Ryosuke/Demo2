package com.example.demo.in_action.s.chapter_7_1

class Person(
    private val firstName: String,
    private val lastName: String
): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(
            this,
            other,
            { person -> person.lastName },
            { person -> person.firstName }
        )
    }
}

fun main() {
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 < p2)
    println(p1 > p2)
    println(p1 != p2)
    println(p1 == p2)
}