package com.example.demo.kotlin_1

fun main() {
    class Person(val firstName: String, val lastName: String): Comparable<Person> {
        override fun compareTo(other: Person): Int {
            return compareValuesBy(this, other, Person::lastName, Person::firstName)
        }
    }
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 > p2)
}