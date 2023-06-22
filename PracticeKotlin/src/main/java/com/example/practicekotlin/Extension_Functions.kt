package com.example.practicekotlin


//String class, and create an extension function that will append text to existing String."Hello there, [append a string]

fun main(){
    val string = "Hello there"
    println(string.append("Karan Matta".append("How are you?")))

    println("This is fun".removeFirstAndLastChar())
}

// we have used extension function to append a string to existing string
//fun String.append(toAppend: String): String{
//    return "${this.plus(" $toAppend")}"
//}
// we can also write the above function as
fun String. append (toAppend: String): String = this.plus (toAppend)


//Removing first and last character from a string

fun String.removeFirstAndLastChar() : String{
    return this.substring(1, this.length - 1)
}
