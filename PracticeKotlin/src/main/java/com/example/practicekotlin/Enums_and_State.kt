package com.example.practicekotlin

fun main(){


}

fun getResult(result: Result){
    return when(result){
        Result.SUCCESS -> println("Success")
        Result.FAILURE -> println("Failure")
        Result.ERROR -> println("Error")
    }

}

// Enum class is used to define a set of constants
enum class Result{
    SUCCESS,
    FAILURE,
    ERROR

}