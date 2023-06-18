package com.example.practicekotlin

// Set is a collection of unique elements
// Ordering is not guaranteed
// Set is immutable
fun main() {
    val myset = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    println(myset)

    // We can also use mutable set
    val myset2 = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(myset2)
    myset2.add(69)

    // We can only add Unique elements in set
    myset2.add(69)
    println(myset2)

    // Maps
    // Maps are key value pairs
    // Maps are immutable
//    val mymap = mapOf(1 to "A", 2 to "B", 3 to "C")
//    println(" maps: $mymap")
//
//    // We can also use mutable map
//    val mymap2 = mutableMapOf(1 to "A", 2 to "B", 3 to "C")
//    println(mymap2)
//    mymap2.put(4, "D")
//    println(mymap2)

     val secretMap = mapOf("up" to 1 , "down" to 2 , "left" to 3 , "right" to 4)
    println(secretMap.values)
    if("up" in secretMap.keys){
        println("You can go up")
    }
    if(4 in secretMap.values){
        println("You can go right")
    }

    // mutable map
    val secretMap2 = mutableMapOf("up" to 1 , "down" to 2 , "left" to 3 , "right" to 4)
    println(secretMap2.values)

    secretMap2["forward"]= 5
    println(secretMap2)


}

