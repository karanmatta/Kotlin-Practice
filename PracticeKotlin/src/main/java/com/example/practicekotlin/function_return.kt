package com.example.practicekotlin

fun main(){
println( calculate(10   ))

    // we can also use the value returned by the function
    val catAge = calculate(10)*2
    println("Double of Your cat age is $catAge") // Printing
}

//fun calculate(age:Int) :Int{
//    return age * 7
//        //println("Your cat age is $catAge") // Printing
//
//    // Return value from function
//
//} This Function can be simply written as

fun calculate(age:Int) = age * 7 // Its the same function as above



