package com.example.practicekotlin

fun main(){
    /** var - mutable ..*/

    /*
    if amount is equal to 100 , then you are wealthy , else you are just getting by just fine
     */
val amount = 900

    if(amount ==1000){
        print("You're wealthy")
    }else if(amount > 1000){
        print("You're very wealthy")
    }else{  // else is optional
        print("You're just getting by just fine")
    }

    when(amount){
        1000 -> print("You're wealthy")
        10000 -> print("You're very wealthy")
        else -> print("You're just getting by just fine")
    }

}