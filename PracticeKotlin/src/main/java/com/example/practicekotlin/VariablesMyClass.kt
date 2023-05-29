package com.example.practicekotlin

fun main(){
    // Variables

    var myName = "Kotlin" // String
     myName = "Hi"
// var is mutable

    val myAge = 4// Integer
    // val cant be reassigned like var. It is immutable
    //println("Hello World!")
    //println(myName)
   // println(myAge)

    // variables must be initialized to something before calling them

    val name = "John"
   // print("Hello $name")
    // Dollar Sign is used to call a variable inside a string


    // Explicit way to initialize
    val name2: String = "James"// Compiler already knows that it is a string. So it redundant to write String, we don't need to write it

    val age: Int = 4

    print("Hello $name2, you are $age years old")


    val byteNumber: Byte = 127  // 8 bits
    val shortNumber: Short = 12999
    val number: Long = 123456789
    val e = 2.7182818284
    val floatNumber: Float = 3.14f // f is used to tell the compiler that it is a float number
}

//Basic types in Kotlin

// Integers
// Byte, Short, Int, Long

// Floating Point Numbers

// Float, Double

// Booleans

// True, False

// Characters

// The Long type



