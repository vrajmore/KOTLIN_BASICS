//  interface is used to get common behaviour or methods (forcefully implemented) in multiple classes
//  a class can extend only one class but can implement multiple interface
fun main() {
    dragobjects(arrayOf(
        Circle2(2.0),
        Square2(5.0),
        Triangle2(2.0,5.0),
        Player("smiley")
        ))
}
fun dragobjects(objects: Array<Draggable>){             //  method in which interface(Draggable) is passed init
    for (obj in objects){
        obj.drag()
    }
}

interface Draggable{                                    // interface created
    fun drag()                                      //method of interface (must define whichever class implements)
}

abstract class Shape2: Draggable {                      //  abstract class implementing draggable interface
    abstract fun area(): Double

}

class Circle2(val radius: Double) : Shape2() {                          //  class extends shape2
    override fun area(): Double {
        return Math.PI * radius * radius
    }
    override fun drag() {
        println("circle is dragging")
    }
}

class Square2(val side: Double) : Shape2() {                            //  class extends shape2
    override fun area(): Double {
        return side * side
    }
    override fun drag() {
        println("square is dragging")
    }
}

class Triangle2(val base: Double, val height: Double) : Shape2() {      //  class extends shape2
    override fun area(): Double {
        return 0.5 * base * height
    }
    override fun drag() {
        println("triangle is dragging")
    }
}

class Player(val name:String): Draggable{                               //  class implementing interface
    override fun drag() {
        println("$name is dragging")
    }
}