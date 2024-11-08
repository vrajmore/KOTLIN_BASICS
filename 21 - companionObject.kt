fun main() {
    Myclass.myobj.f()       //this will be shown as redundant(as it is declared as companion)
    Myclass.f()             //f can be directly used without object as it is declared as companion
    Myclass.myobj2.g()      //normally called with object
}

//  one class can have only one companion

class Myclass{
    companion object myobj{         // companion can be used to access method of object directly with class(without object name)(companion = associating with class)
        @JvmStatic      // jvmstatic is used to show this as static component of javafile
        fun f(){
            println("i am f from object")
        }
    }
    object myobj2{
        fun g(){
            println("i am g from object")
        }
    }
}