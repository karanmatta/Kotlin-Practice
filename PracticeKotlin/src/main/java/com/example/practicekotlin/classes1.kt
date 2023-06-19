package com.example.practicekotlin


// val is immutable
// var is mutable

class Car{
    var color : String = "Red"
    var model: String = "BMW"

    fun drive(){
        println("Driving Vrooooooom")
    }
}

fun main(){
    val car = Car()
    car.color= "Blue"
    car.model = "Audi"

    println("Car color is ${car.color} and model is ${car.model}")

//    println(car.color)
//    println(car.model)
//    car.drive()

}