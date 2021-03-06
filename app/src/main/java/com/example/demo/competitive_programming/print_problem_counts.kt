package com.example.demo.competitive_programming

fun main() {
    fun printProblemCounts(responses: Collection<String>) {
        var clientErrors = 0
        var serverErrors = 0
        responses.forEach {
            when {
                it.startsWith("4") -> clientErrors++
                it.startsWith("5") -> serverErrors++
            }
        }
        println("$clientErrors client errors, $serverErrors server errors")
    }

    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}