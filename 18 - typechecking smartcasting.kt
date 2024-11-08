fun main() {
    val circle = Circle3(4.0)
    val player = Player3("smiley")

    val arr = arrayOf(circle, player)
    for (obj in arr){
        if (obj is Circle3){            // used to check weather the obj belongs to circle3 class (type checking)
            println(obj.area())
        }else{
            (obj as Player3).saymyname()    //as obj belongs to player3 class run say my name
        }
    }
}


interface Draggable3{                                    // interface created
    fun drag()                                      //method of interface (must define whichever class implements)
}

abstract class Shape3: Draggable3 {                      //  abstract class implementing draggable interface
    abstract fun area(): Double
}

class Circle3(val radius: Double) : Shape3() {                          //  class extends shape2
    override fun area(): Double = Math.PI * radius * radius     //  inline method defined using "="
    override fun drag() = println("circle is dragging")         //  inline method defined using "="
}

class Player3(val name:String): Draggable3{                               //  class implementing interface
    override fun drag() = println("$name is dragging")          //  inline method defined using "="
    fun saymyname() = println("hey my name is $name")           //  inline method defined using "="
}