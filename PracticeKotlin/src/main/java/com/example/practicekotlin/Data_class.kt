package com.example.practicekotlin

fun main() {
    val person = Person(name = "Karan", lastname = "Matta", age = 24)
    val listofPeople = listOf<Person>(
        person,
        Person("Umang", "Garg", 31),
        Person("Arzoo", "Arora", 24)
    )

    println(person)
    println(listofPeople)
    listofPeople.forEach() { person ->
        println(person.age)
    }
//    val person = Person (name = "Joe", lastName = "Ball", age = 23)
//    val aroni = Person (name = "Ruti"
//            lastName = "Machava",
//        age = 54)
//    val ruti = Person (name = "Ruti",
//        lastName = "Machava"
//                age = 54)
//    val listOfPeople = listOf (person, aroni, ruti)
//    listOfPeople. forEach {  Person
//    println ()
//}
//}

}

data class Person(val name:String,val lastname:String,val age:Int)