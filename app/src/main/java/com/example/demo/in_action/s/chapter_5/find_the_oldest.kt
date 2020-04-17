package com.example.demo.in_action.s.chapter_5

data class Person(val name: String, val age: Int)

fun main() {
    fun findTheOldest(people: List<Person>) {
        var maxAge = 0
        var theOldest: Person? = null
        for (person in people) {
            if (person.age > maxAge) {
                maxAge = person.age
                theOldest = person
            }
        }
        println(theOldest)
    }
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    findTheOldest(people)
    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))
}