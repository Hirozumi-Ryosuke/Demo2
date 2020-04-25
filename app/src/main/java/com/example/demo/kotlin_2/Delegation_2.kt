package com.example.demo.kotlin_2

interface Nameable {
    var name: String
}

class JackName: Nameable {
    override var name: String = "Jack"
}

class LongDistanceRunner: Runnable {
    override fun run() {
        println("long")
    }
}

class Person(name: Nameable, runner: Runnable): Nameable by name, Runnable by runner

fun main() {
    val person = Person(JackName(), LongDistanceRunner())
    println(person.name)
    person.run()
}