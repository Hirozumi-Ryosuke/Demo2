package com.example.demo.in_action.s.chapter_4

sealed class Expr
class Num(val value: Int): Expr()
class Sum(val left: Expr, val right: Expr): Expr()

fun main() {
    fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
        }
    println(eval(Sum(Sum(Num(1),Num(2)),Num(4))))
}
