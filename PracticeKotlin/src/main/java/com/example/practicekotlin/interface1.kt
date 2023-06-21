package com.example.practicekotlin

//An interface specifies what a class can Implement, regardless of inheritance status

// Interface

class Button(val lable: String):{

}

interface clickEvent{
    fun onClick(message : String)
    fun onLongClick()
}