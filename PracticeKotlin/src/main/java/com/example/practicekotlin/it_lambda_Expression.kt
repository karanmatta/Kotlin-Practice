package com.example.practicekotlin

fun main(){
    println(catAge(10))
}

val catAge : (Int)-> Int = { it*7}