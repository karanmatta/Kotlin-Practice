package com.example.practicekotlin

//Every Class in Kotlin inherits from Any Class. We don't need to write it explicitly

fun main(){
    val caar = Caar(color = "Red", model = "BMW")
    val secondcar = Caar(color = "Blue", model = "Audi")
    val thirdcar = Caar(color = "Green", model = "Mercedes")
//println("Car color is ${caar.color} and model is ${caar.model}")
//    println("Car color is ${secondcar.color} and model is ${secondcar.model}")
//    println("Car color is ${thirdcar.color} and model is ${thirdcar.model}")

    caar.speed(100,200)
    secondcar.drive()

    // : means extends

    val name: String = "Karan"


    val truck = Truck(color = "magenta", model = "F16")
    println("Truck")
    truck.drive()
    // Customize Drive for truck

    truck.speed(100,200)
1


}
// All classes are closed by default
open class Caar(var color: String = "Blue", var model: String = "xndle") {

    // We Cant directly write Code in this constructor
    // We can only initialize the variables
    //But we Can use init block to write code
    // So init block is used to initialize the variables
    // Jo upr wala objects h .... Wo ignore ho jaaenge agar humne Init k andar variable ki value dedi
    init {
        if(color== "Blue") {
            println("Color is Blue")
        }else{
            println("Color is not Blue")
        }
    }

//class Caar(color: String = "Blue", model: String = "andle") {
//    var color: String = color
//    var model: String = model



    open fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Speed is $minSpeed to $maxSpeed")
    }

    open fun drive() {
        println("Drive. . . vroooooomm")
    }
}

class Truck(color: String,model: String) : Caar(color,model) {

    override fun drive() {
        println("Truck is driving")
    }

    override fun speed(minSpeed: Int, maxSpeed: Int) {
        val fullspeed = maxSpeed * minSpeed
        println("Truck speed is $fullspeed")
        println("Truck speed is $minSpeed to $maxSpeed")
    }


}