package com.example.demo.in_action.s.chapter_8

fun foo(callback: (() -> Unit)?) {
    if (callback != null) {
        callback()
    }
}

