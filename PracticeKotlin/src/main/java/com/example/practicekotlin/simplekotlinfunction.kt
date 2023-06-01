package com.example.practicekotlin

 fun main(){
    /** var - mutable ..*/

 sayhello()
 }

fun sayhello(){
    for(i in 1..10){
        if(i%2==0) {
            println("$i is Even")
        }
    }
    println("Hello this is a function")
}