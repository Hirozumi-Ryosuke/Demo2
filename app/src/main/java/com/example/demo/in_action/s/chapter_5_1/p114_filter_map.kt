package com.example.demo.in_action.s.chapter_5_1

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * it })

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age > 30 })

    println(people.map { it.name })
    println(people.map(Person::name))

    println(people.filter { it.age > 30 }.map(Person::name))
    println(people.filter { it.age == people.maxBy(Person::age)!!.age })

    println(people.map(Person::name).filter { it.startsWith("A") })
    println(people.map(Person::name).filter { it.endsWith("e") })

    val maxAge = people.maxBy(Person::age)!!.age
    println(people.filter { it.age == maxAge })

    println(people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("A") }
        .toList()
    )
    println(people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("A") }
    )
}