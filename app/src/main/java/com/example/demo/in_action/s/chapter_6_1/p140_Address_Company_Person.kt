package com.example.demo.in_action.s.chapter_6_1

fun main() {
    fun printShippingLabel(person: Person) {
        val address = person.company?.address
            ?: throw IllegalArgumentException("No Address")
        with(address) {
            println(streetAddress)
            println("$zipCode $city, $country")
        }
    }
    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)

    printShippingLabel(person)
    printShippingLabel(Person("Alexey", null))

    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
    fail("Error occurred")
}