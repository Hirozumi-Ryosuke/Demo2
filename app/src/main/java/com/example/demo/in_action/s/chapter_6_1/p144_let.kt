@file:Suppress("NAME_SHADOWING")

package com.example.demo.in_action.s.chapter_6_1

@Suppress("UNREACHABLE_CODE")
fun main() {
    fun sendEmailTo(email: String) {
        println("Sending email to $email")
    }
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }
    email?.let { email -> sendEmailTo(email) }

    email = null
    email?.let { sendEmailTo(it) }
    email?.let { email -> sendEmailTo(email) }
}