package com.example.practicekotlin

package com.example.practicekotlin


fun main(){

//    calculate(11,1000,"multiple",11)
    //calculate(message = "multiple",multipleOf = 11)// Yha pr default parameters ko chorkr Baaki parameters paas kie
    calculate(first = 10,second = 100,message = "multiple",multipleOf = 11)// Yha pr default value ko override krdia

}

fun calculate(first:Int =11, second: Int =1000,message : String, multipleOf :Int){
    for (i in first..second){
        if(i%multipleOf==0){
            println("$i is $message of $multipleOf")
        }
        // Function
    }


    // Default Arguments: if nothing is found in the function call, then the default value will be used


}