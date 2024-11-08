fun main() {

//    range
    val number = 10
    val result = number in 1..10    // it will range from 1 to 10
    val result1 = number in 1 until 5   // it will range from 1 to 4 (5 will not be included)
    println(result)
    println(result1)

//    when
    val animal = "dog"
    when(animal){   // similar to switch case of java
        "horse" -> println("this is a horse")
        "cat" -> println("this is a cat")
        "dog" -> println("this is a dog")
        "lion" -> println("this is a lion")
        else -> println("animal not found")
    }


    val age = 15
    when(age){   // similar to switch case of java
        11 -> println("Eleven")
        12 -> println("Twelve")
        in 13..19 -> println("Teen")
        else -> println("not in range")
    }
}