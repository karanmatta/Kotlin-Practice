package com.example.practicekotlin

fun main(){

    // We can specifically Tell what type of list is
    // Initializing a list
    val newList = mutableListOf<String>()

    newList.add("Karan")

    for(i in 1..10){
        newList.add(i,"Karan $i")
    }
    println(newList)

    // Immutable List initialization
    val immutableList = listOf<String>("Karan","Karan1","Karan2","Karan3","Karan4","Karan5","Karan6","Karan7","Karan8","Karan9","Karan10")
    println(immutableList)

}