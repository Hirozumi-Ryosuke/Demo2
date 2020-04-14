package com.example.demo.kotlin_

fun main() {
    data class Person(val name: String, val age: Int? = null) {

        fun isOlderThan(other: Person): Boolean? {
            if(age == null || other.age == null)
                return null
            return age > other.age
        }
    }
    println(Person("Sam", 35).isOlderThan(Person("Kay", 29)))
    println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
    println(Person("Sam", 35).isOlderThan(Person("Jane")))
}