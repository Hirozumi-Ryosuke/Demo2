package com.example.demo.in_action.s.chapter_5_1

fun main() {
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(!people.all(canBeInClub27))

    println(people.count(canBeInClub27))
    println(people.find(canBeInClub27))
}