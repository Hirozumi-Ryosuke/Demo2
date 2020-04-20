package com.example.demo.in_action.s.chapter_2

fun main() {
    fun fizzBuzz(i: Int) = when {
        i % 15 == 0 -> "FizzBuzz "
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i "
    }
/*    (1..100).forEach { i ->
        print(fizzBuzz(i))
    }*/

    for (i in 1..100) {
        print(fizzBuzz(i))
    }

/*    (100 downTo 1 step 2).forEach { i ->
        print(fizzBuzz(i))
    }*/
}