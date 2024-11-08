// polymorphism - parent can hold the reference of its child
fun main() {
    val circle: Shape = Circle(4.0)     //created object of circle with passing reference of shape
    val square: Shape = Square(4.0)         //created object of square with passing reference of shape

    println(circle.area())
    println(square.area())

    println()   // just for space

    val shapes = arrayOf(Circle(3.0), Circle(4.0), Square(4.0), Triangle(3.0, 4.0))     // array of data
    calculateareas(shapes)      // array of data passed in calculatearea() method
}

fun calculateareas(shapes: Array<Shape>) {       // created a function for calculating area and passed array with reference of Shape()
    for (shape in shapes) {              // used forloop to traverse array
        println(shape.area())           // used area method of reference Shape() class
    }
}

open class Shape() {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle(val base: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}

// method calling works in a hierarchy CHILD class --> PARENT class --> ANY class
// if the method is called from inheritance it will first search for CHILD class (if not found) -> search for PARENT class (if not found) --> search for ANY class
