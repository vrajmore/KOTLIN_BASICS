fun main() {
    val p1 = Person3(1, "jhon")
    val p2 = Person3(1, "jhon")

    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)
    println(p1.component1())        // component1() is id (components are properties of it)
    println(p1.component2())        // component2() is name (components are properties of it)

    val p3 = p1.copy(3)         // creates copy of p1 and stores in p3 with change in id as 3(as the id is manually passed)
    println(p3)

    val(id, name) = p1              //this is also known as destructuring (both values of p1 is stored in id and name variable(as per sequence))
    println(name)
    println(id)
}

data class Person3(val id: Int, val name:String){       // dataclass is used to store data(it has some in build functions)

}