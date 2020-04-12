package com.example.demo.competitive_programming

import java.math.BigInteger

fun main() {
    tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {
        return when (n) {
            0 -> b
            else -> getFibonacciNumber(n - 1, a + b, a)
        }
    }
    println(getFibonacciNumber(10_000, BigInteger("1"), BigInteger("0")))
}