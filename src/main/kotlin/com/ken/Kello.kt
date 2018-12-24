package com.ken

fun main(args: Array<String>) {
    //println("hello K");
    //Human().hello();
    val h = Human()
    h.hello()
    var age = 19; //var can change, val can't
    age =20;
    var weight = 66.5
    weight = 7.0
    var name = "Ken"
}

class Human{
    fun hello(){
        println("Hello Ktn")
    }
}