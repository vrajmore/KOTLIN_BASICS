fun main() {

    var car =Automobile("car",4,5,"petrol")
    var car2 =Automobile("car2","petrol")
    var person = Person1("mukesh", 15)
    println(person.name)
    println(person.age)

}

class Automobile(val name:String, val tyres:Int, val maxseating:Int, val enginetype:String){   // primary properties in constructor
    init {      // init block is used to execute the block of code as soon as the object is created for class
        println("$name is created")
    }
    init {      // multiple init blocks can be created
        println("second init block")
    }

    constructor(nameParam: String, engineParam: String):
            this(nameParam, 4, 5, engineParam)      //created a secondary constructor(passing primary constructor is compulsory using this keyword)
    fun drive(){}
    fun applybrakes(){}

}

class Empty{}   //constructor empty

class Person1(nameParam:String, ageParam:Int){     //no primary properties defined (values are passed to properties using this parameters)
    val name:String = nameParam    //properties
    var age:Int = ageParam         //properties
}