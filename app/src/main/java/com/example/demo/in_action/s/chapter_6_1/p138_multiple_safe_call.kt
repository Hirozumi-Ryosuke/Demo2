package com.example.demo.in_action.s.chapter_6_1

import java.lang.IllegalArgumentException

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun main() {
    fun Person.countryName() = company?.address?.country ?: "Unknown"
    val person = Person("Dmitry", null)
    println(person.countryName())

    fun printShippingLabel(person: Person) {
        val address = person.company?.address
            ?: throw IllegalArgumentException("No address")
        with(address) {
            println(streetAddress)
            println("$zipCode $city, $country")
        }
    }
    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person2 = Person("Hirozumi", jetbrains)

    printShippingLabel(person2)
    println(person2.countryName())
    printShippingLabel(Person("Alexey", null))

}