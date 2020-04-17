package com.example.demo.in_action.s.chapter_4

class Client(val name: String, private val postalCode: Int) {

    override fun toString() = "Client(name = $name, postalCode = $postalCode)"

    override fun equals(other: Any?): Boolean {
        return when (other) {
            null, !is Client -> false
            else -> name == other.name && postalCode == other.postalCode
        }
    }
/*
        if (other == null || other !is Client)
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }
*/
    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }
}
fun main() {
    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    println(client1)
    println(client2)
    println(client1 == client2)
}