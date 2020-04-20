package com.example.demo.in_action.s.chapter_6_1


fun main() {
    class Person(val firstName: String, val lastName: String) {
        override fun equals(other: Any?): Boolean {
            val otherPerson: Person = when (other) {
                is Person -> other
                else -> return false
            }
            /*val otherPerson = other as? Person ?: return false*/

            return otherPerson.firstName == firstName &&
                    otherPerson.lastName == lastName
        }

        override fun hashCode(): Int =
            firstName.hashCode() * 37 + lastName.hashCode()

    }
    val p1 = Person("Dmitry", "Jemerov")
    val p2 = Person("Dmitry", "Jemerov")
    println(p1 == p2)
    println(p1.equals(42))
}