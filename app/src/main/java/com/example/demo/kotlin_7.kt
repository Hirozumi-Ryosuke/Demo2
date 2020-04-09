package com.example.demo

import java.lang.Appendable
import java.lang.StringBuilder

fun main(){
    fun <T> T.ensureTrailingPeriod()
            where T : CharSequence, T : Appendable {
        when {
            endsWith('.').not() -> append('.')
        }
    }
    StringBuilder("Hello World").also {
        it.ensureTrailingPeriod()
        println(it)
    }
}
