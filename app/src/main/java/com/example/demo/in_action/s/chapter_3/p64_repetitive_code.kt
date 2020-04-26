package com.example.demo.in_action.s.chapter_3

import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

fun main() {

    fun saveUser(user: User) {
        if (user.name.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty Name")
        }
        if (user.address.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty Address")
        }
    }
    saveUser(User(1, "", ""))
}