fun main() {

    val result = add(4, 5)   // called the add function with values passed init and stored in result
    println(result)

    oddoreven(12)

    println()
    printmessage(4)
    printmessage()      // it has a default argument passed inside the function (it will print 2 times)
}

fun add(num1: Int, num2: Int): Int {     // function named as add with two parameters num1 and num2
    val sum = num1 + num2
    return sum
}

fun oddoreven(num1: Int) {               // this function has no declared data type so no return is required(by default data type is UNIT)
    val result = if (num1 % 2 == 0) {
        "even"
    } else {
        "odd"
    }
    println(result)
}

fun printmessage(count: Int = 2) {       // if the arguments are passed in this function parameters then it will be initiated else default value of 2 will be considered
    for (i in 1..count) {
        println("hello $i")
    }
}