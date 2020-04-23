package com.example.demo.in_action.s.chapter_7_2

class Person(val name: String) {
/*    private var _emails: List<Email>? = null

    val emails: List<Email>
        get() {
            if (_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }*/
    val emails by lazy { loadEmails(this) }
}

class Email {/*...*/}
fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

fun main() {
    val p = Person("Alice")
    p.emails
    p.emails
}
