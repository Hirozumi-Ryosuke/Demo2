package com.example.demo.in_action.s.chapter_5_2

class Book(val title: String, val authors: List<String>)
fun main() {
    val books = listOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman"))
    )
    println(books.map { it.title })
    println(books.map { it.authors })
    println(books.flatMap { it.authors })
    println(books.flatMap { it.authors }.toSet())
}