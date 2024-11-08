fun main() {
    println(A2.num)
    B2.test()

    var testobj = object {      // object expression (object is used as expression stored in testobj variable)
        val x:Int = 10
        fun method(){
            println("i am object expression")
        }
    }
    testobj.method()

    var obj = object : cloneable {
        override fun clone() {
            println("i am implementing clonnable")
        }
    }
    obj.clone()
}

interface cloneable{        //interface created
    fun clone()
}

//object can be created without creating class
//object is singleton(object can be initialized only once ,no other instance can be created)
object A2{
    val num: Int = 10
}

object B2{
    val p: Int = 20
    fun test(){
        println("i am an object B")
    }
}