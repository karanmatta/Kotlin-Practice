package com.example.practicekotlin


fun main(){
    /** var - mutable ..*/

    sayHello1("Karan")
    sayHello("Karan")
}

//Lambda Expression that return nothing

val sayHello : (String)-> Unit = { name -> println("Hello $name")}
//It
val sayHello1 : (String)-> Unit = { println("Hello $it")}