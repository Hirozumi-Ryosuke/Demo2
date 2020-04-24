package com.example.demo.in_action.s.chapter_7_2

fun main() {

    class Person(val name: String) {

    inner class Email {/*...*/}

    fun loadEmails(person: Person): List<Email> {
        println("Load emails for ${person.name}")
        return listOf(/*...*/)
    }
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

    val p = Person("Alice")
    p.emails
    p.emails
}
