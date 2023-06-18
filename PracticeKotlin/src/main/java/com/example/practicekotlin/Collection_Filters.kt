package com.example.practicekotlin

fun main(){
    val myListOfNames = listOf("Karan","Arzoo", "Umang")
//filter
   val found= myListOfNames.filter {
        it == "Karan"

        it.startsWith("A") }.forEach{ println(it) }
    print (found)
    val myListOfNames1 = listOf ("James", "Paul", "Rafael", "Gina")
        val found1 = myListOfNames. filter {
        it == "Paul"
        }
    print (found1)

    val found3 = myListOfNames. filter {

        it.startsWith("r", ignoreCase = true) && it.endsWith('L')
    }
    print (found3)



}