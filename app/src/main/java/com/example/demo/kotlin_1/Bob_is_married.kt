package com.example.demo.kotlin_1

class Person(val name: String, var isMarried: Boolean)

fun main() {
    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)
}