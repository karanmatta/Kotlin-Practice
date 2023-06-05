package com.example.practicekotlin

fun main(){
    println(sum(10,20))
}

val sum: (Int,Int)-> Int = {x,y -> x+y}