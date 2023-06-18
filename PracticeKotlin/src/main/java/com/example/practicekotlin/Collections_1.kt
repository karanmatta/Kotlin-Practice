package com.example.practicekotlin

//A Collection is a group of related items that can be referred to as a single unit.
//Kotlin has two types of collections: Immutable and Mutable.
//Immutable Collections: Immutable collections are read-only collections.
//A collection usually contains a number of objects/items in a certain order of the same type

//Immutable Collections: Immutable collections are read-only collections.
//Immutable collections are created using the standard library functions listOf<T>() and setOf<T>().
//Immutable collections do not provide functions for modifying the collection.
//Immutable collections are covariant. This means that a collection of type List<T> is a subtype of List<U> if T is a subtype of U.
//Immutable collections are thread-safe. Multiple threads can read the same collection at the same time.
//Immutable collections are efficient. They don't allocate memory for the elements, but use the existing memory pool.

//Mutable Collections: Mutable collections are read-write collections.
//Mutable collections are created using the standard library functions mutableListOf<T>() and mutableSetOf<T>().
//Mutable collections provide functions for modifying the collection.
//Mutable collections are invariant. This means that a collection of type MutableList<T> is not a subtype of MutableList<U>, even if T is a subtype of U.
//Mutable collections are not thread-safe. You should not use mutable collections from multiple threads at the same time.
//Mutable collections are less efficient. They allocate memory for the elements.



fun main(){
    // IMMUTABLE LIST: CANT ADD DYNAMICALLY
    val myListofName = listOf("Karan","Arzoo","Umang","Jyoti")


    for(item in myListofName){
        println("Names: $item")
    }

    // Another Method to loop through
    myListofName.forEach { println(it) }
    println(myListofName)


    // MUTABLE LIST: CAN ADD DYNAMICALLY
    val myListofName2 = mutableListOf("Karan","Arzoo","Umang","Jyoti")
    myListofName2.add("Kirti")
    print("Mutable: $myListofName2")
    myListofName2.removeAt(0)
    print("Mutable: $myListofName2")

    // Other Methods of Mutable
    //size
    println("Size: ${myListofName2.size}")
    //contains
    println("Contains: ${myListofName2.contains("Kirti")}")
    //get
    println("Get: ${myListofName2[0]}")
    //indexOf
    println("IndexOf: ${myListofName2.indexOf("Umang")}")
    //lastIndexOf
    println("LastIndexOf: ${myListofName2.lastIndexOf("Jyoti")}")
    //remove
    println("Remove: ${myListofName2.remove("Kirti")}")
    //removeAt
    println("RemoveAt: ${myListofName2.removeAt(0)}")
    //clear
    println("Clear: ${myListofName2.clear()}")
    //isEmpty
    println("IsEmpty: ${myListofName2.isEmpty()}")
    //set
    println("Set: ${myListofName2.set(0,"Karan")}")
    //subList
    println("SubList: ${myListofName2.subList(0,2)}")
    //sort
    println("Sort: ${myListofName2.sort()}")
    //reverse
    println("Reverse: ${myListofName2.reverse()}")
    //shuffle
    println("Shuffle: ${myListofName2.shuffle()}")

    //retainAll
    //  Andar quotes dene k lie \" \" use krte h
    println("\"RetainAll\": ${myListofName2.retainAll(listOf("Karan","Arzoo"))}")
    //addAll
    println("AddAll: ${myListofName2.addAll(listOf("Karan","Arzoo"))}")

    // List can have duplicate values
}