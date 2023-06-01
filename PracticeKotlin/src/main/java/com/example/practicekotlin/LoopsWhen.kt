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

    //In When WE Can also check ranges
    when(amount){
        //When in range
        in 1..999 -> print("You're poor")
        // not in range
        !in 1000..10000 -> print("You're very poor")

        1000 -> println("You're wealthy")
        10000 -> println("You're very wealthy")
        else -> println("You're just getting by just fine")
    }

}