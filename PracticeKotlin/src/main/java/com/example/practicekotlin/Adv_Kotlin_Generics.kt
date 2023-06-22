package com.example.practicekotlin

fun main() {
    val listOfItems = listOf<String>("Karan", "Matta", "Umang", "Garg", "Arzoo", "Arora")
    val listOfNumbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val finder1 = Finder(listOfNumbers)
    finder1.findItem(element = 5) {
        println("Item found $it")
    }

    val finder = Finder(listOfItems)
    finder.findItem(element = "Karan") {
        println("Item found $it")

    }
}

// We Cant find integer from the list of string , using this finder class. So we will use Generics

class Finder<T>(private val list: List<T>){
    fun findItem(element: T, foundItem:(element: T?) -> Unit){
        val itemFoundList =list.filter {
            it == element
        }

        if(itemFoundList.isNullOrEmpty()){
            foundItem(null)
        }else{
            foundItem(itemFoundList.first())
        }
    }
}

// Using Generics <T> we can use this finder class for any type of list
