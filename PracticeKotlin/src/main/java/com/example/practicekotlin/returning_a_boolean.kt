package com.example.practicekotlin

fun main() {

    /** var - mutable ..*/
    val catAge = calculateCatAge(10)
    //println("This cat is $catAge years old")

    if (checkAge(catAge)) {
        println("This cat is old ($catAge))")
    } else {
        println("This cat is young($catAge)")

    }
}


    fun calculateCatAge(age: Int) = age * 7

    fun checkAge(catAge: Int): Boolean {
        return catAge > 50
    }



