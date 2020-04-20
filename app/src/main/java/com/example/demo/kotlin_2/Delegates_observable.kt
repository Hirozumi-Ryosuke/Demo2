package com.example.demo.kotlin_2

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("<no name>") {
        property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

fun main() {
    val user = User()
    user.name = "first"
    user.name = "second"
}