package com.example.demo.in_action.s.chapter_5_1

fun main() {
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    fun Person.isAdult() = age >= 21
    val predicate = Person::isAdult
    println(predicate(p))

    val personsAgeFunction = Person::age
    println(personsAgeFunction(p))

    val alicesAgeFunction = p::age
    println(alicesAgeFunction())

    val alicesAgeFunction2 = { p.age }
    println(alicesAgeFunction2())
}