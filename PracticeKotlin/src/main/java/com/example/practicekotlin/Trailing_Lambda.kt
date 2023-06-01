package com.example.practicekotlin

// Trailing Lambda

// We can pass a lambda expression outside the parenthesis of a function call
// We can pass function as a parameter to another function

//it is a default name of a single parameter in lambda expression

fun main(){
    enhancedMessage(message = "Hello Karan"){
        println(it)
        add(10,20)
    }
}

fun enhancedMessage(message : String,funAsParameter:(String) ->  Int){
    println("$message ${funAsParameter("Hey")}")
}

fun add(a:Int,b:Int):Int{
    return a+b
}
