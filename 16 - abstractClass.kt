// abstract can be defined as a template which can be later used by child class to define methods

fun main() {
    val circle = Circle1(4.0)
    println(circle.area())
    circle.display()
}


//  abstract class can not be instantiated

abstract class A{       //  this class is intentionally made abstract to void making an instance of this class (it must be inherited)
    fun method(){
        println("i am a method")
    }
}

abstract class Shape1{          // need to make class abstract as it contains abstract method (class should be abstract if it has abstract methods)
    var name: String = ""
    abstract fun area():Double      // abstract method (must be declared by child class)(abstract method can not have a body)
    abstract fun display()          // abstract method (must be declared by child class)(abstract method can not have a body)
}

class Circle1(val radius: Double): Shape1(){    //circle1 class extending shape1

    override fun area(): Double {           // must override the area() method as it is made abstract by the parent class
        return Math.PI * radius * radius
    }

    override fun display() {                // must override the display() method as it is made abstract by the parent class
        println("circle is getting displayed")
    }

}