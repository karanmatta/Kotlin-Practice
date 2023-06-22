package com.example.practicekotlin

//An interface specifies what a class can Implement, regardless of inheritance status

// Interface

fun main(){
    val button = Button(label = "Button")
    button.onClick(message = "Hello World")


    val character = Character(name = "Character")
    character.onClick(message = "Clicked by Karan Matta")
}

class Button(val label: String): ClickEvent{
    override fun onClick(message: String) {
        println("Clicked by $label and here is the message $message")
    }


}
class Character(val name: String): ClickEvent{
    override fun onClick(message: String) {
        println("Clicked by $name and here is the message $message")
    }

}


// The moment we inherit an interface, we have to implement all the methods in the interface

interface ClickEvent{
    fun onClick(message : String)
}