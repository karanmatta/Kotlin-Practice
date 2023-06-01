package com.example.practicekotlin

fun main(){

    calculate(1,10)
    even(1,10,2)

}

// pass parameters to function
fun calculate(first : Int, second : Int){
    println(first + second)
}

fun even(first : Int, second : Int,multipleOf : Int ){
    for(i in first..second){
        if(i%multipleOf==0){
            println("$i is Even")
        }
    }
}

// return value from function