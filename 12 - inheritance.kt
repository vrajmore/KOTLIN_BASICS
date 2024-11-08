fun main() {
    val objchild = Child()          //created object of child class
//    as object initialized first of all constructor of parent class will be called and the child class constructor will be called
    objchild.mymethod()             //called method of parent class through child class
    objchild.mymethod2()            //called method of child class itself
}

open class Parent {                 //parent class (open keyword is used to make it able to extend by others)
    init {      //constructor of parent class using init block
        println("constructor of parent class")
    }
    val name: String = ""
    fun mymethod() {
        println("i am in parent")
    }
}

class Child : Parent() {            //child class extending parent class (able to use all variables and method of parent class)
    init {      //constructor of child class using init block
        println("constructor of child class")
    }
    val name2: String = ""
    fun mymethod2(){
        println("i am in child")
    }
}