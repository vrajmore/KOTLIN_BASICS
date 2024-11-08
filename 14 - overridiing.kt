fun main() {
    val generalmobile = Mobile()
    generalmobile.display()

    println()   //just for space

    val oneplus = Oneplus()
    oneplus.display()
}

open class Mobile() {        // parent class
    open val name: String = ""
    open val size: Int = 5

    fun makecall() {
        println("calling from mobile")
    }

    fun poweroff() {
        println("shutting down")
    }

    open fun display() {
        println("simple mobile display")
    }
}

class Oneplus : Mobile() {        // child class
    //    OverRiding (write over existing method or variable for specific class or object)
    override val name: String = "Oneplus"                       // overriding name of mobile by oneplus
    override val size: Int = 6                                  // overriding size of mobile by 5 to 6
    override fun display() {                                    // overriding display method for oneplus specific
        super.display()             //super keyword is used to call method from parent class {it will call display() method of Mobile first}
        println("oneplus display")
    }
}