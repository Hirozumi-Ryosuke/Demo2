package com.example.demo.in_action.s.chapter_6

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun main() {
    /*fun Person.countryName() = company?.address?.country?: "Unknown"
    val person = Person("Dmitry", null)*/
    fun Person.countryName(): String {
        val country = this.company?.address?.country
        return if (country != null) country else "Unknown"
    }
    val person = Person("Dmitry", null)
    println(person.countryName())
}