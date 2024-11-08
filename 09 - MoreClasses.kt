fun main() {

//    object created for class person
    val p1 = Person("A", 21)
    val p2 = Person("B", 17)

//    method canvote() called
    println(p1.canvote())
    println(p2.canvote())

//    value of age of object p2 is changed
    p2.age = 23
    println(p2.canvote())
}

class Person(var name:String, var age:Int){
    fun canvote(): Boolean {
        return age>18
    }
}