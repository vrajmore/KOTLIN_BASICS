fun main() {
    val samsung = SmartPhone()          //object of smartphone class
    samsung.makecall()                  //object of smartphone class calling phone class(parent class) method
}
open class Phone {                      //one phone class(parent class)(open keyword is used to make it able to extend by others)
    val name: String = ""
    val type: String = ""
    val volume: Int = 10

    fun makecall() {
        println("ring ring ring")
    }
    fun display() {}
    fun poweroff() {}
    fun getdeviceinfo() {}
}

class BasicPhone : Phone() {            //basicphone class(child class) extends phone class(parent class)
    fun getscreeninfo() {}
}

class SmartPhone : Phone() {            //smartphone class(child class) extends phone class(parent class)
    fun playmovie() {}
    fun takepicture() {}
    fun getlocation() {}
}