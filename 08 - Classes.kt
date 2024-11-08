fun main() {
    val mustang = Car("mustang","petrol",100)   //object named mustang - created of class car
    val beetle = Car("beetle","diesel",200)     //object named beetle - created of class car

//    name property is accessed using .
    println(mustang.name)
    println(mustang.type)

    println(beetle.name)
    println(beetle.type)

//    methods called
    mustang.drivecar()      //method called for mustang object
    beetle.drivecar()       //method called for beetle object
    mustang.applybrakes()
    beetle.applybrakes()
}

class Car(var name:String, var type:String, var kmran:Int){     // class created with name car and properties(constructor)
    fun drivecar(){     //method created with name drivecar (method and function is same)
        println("$name car is driving")
    }

    fun  applybrakes(){     //method created with name applybrakes (method and function is same)
        println("$name applied brakes")
    }
}