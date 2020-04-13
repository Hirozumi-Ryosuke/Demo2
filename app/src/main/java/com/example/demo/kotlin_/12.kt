package com.example.demo.kotlin_

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        object : Iterator<LocalDate> {
            var current = start

            override fun hasNext() =
                current <= endInclusive

            @RequiresApi(Build.VERSION_CODES.O)
            override fun next() = current.apply {
                current = plusDays(1)
            }
        }
    val newYear = LocalDate.ofYearDay(2020, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) { println(dayOff) }
}