package com.example.practicekotlin

import java.lang.Exception

fun main(){
    Repository.startFetch ()
getResult (result = Repository. getCurrentState())
Repository. finishedFetch ()
getResult(result = Repository.getCurrentState())
Repository.error ()
getResult(result = Repository.getCurrentState ())

}

fun getResult(result: Result){
    return when(result){
        is Error -> {
            println(result.exception.toString())
        }
        is Success -> {
            println(result.dataFetched?:"Ensure you start the fetch")
        }
        is Loading -> {
            println("Loading")
        }
        is NotLoading -> {
            println("Not Loading")
        }


        else -> {
            println("N/A")
        }
    }

}

// Repository is a singleton object
object Repository {
    private var loadState: Result = NotLoading
    private var dataFetched: String? = null
    fun startFetch () {
        loadState = Loading
        dataFetched = "data"
    }
    fun finishedFetch () {
        loadState = Success(dataFetched=dataFetched)
        dataFetched = null
    }
    fun error() {
        loadState = Error(exception = Exception("Error"))
    }
    fun getCurrentState () : Result {
        return loadState
    }

}

//// Enum class is used to define a set of constants
//enum class Result{
//    SUCCESS,// We cant DEFine variables in enum class
//    ERROR,
//    IDLE,
//    LOADING
//}

abstract class Result
data class Success(val dataFetched: String?): Result()
data class Error(val exception : Exception?): Result()
object Loading: Result()
object NotLoading: Result()