fun main() {
//    while loop (condition is checked first)

    var count = 5
    while (count >= 1) {
        println("printing loop")
        count--
    }

//    another example for while loop
    var number = 2
    var index = 1
    while (index <= 10) {
        print("$number X $index = ")    // $ is used to bring value of variable in the string
        println(number * index)
        index++
    }


//    do-while loop(condition will be checked after execution of code atleast once)
    var index1 = 5
    do {
        println("hello")
    } while (index1 > 5)     // condition is already false


    println()
//    for loop
    for (i in 1..10 step 2) {     // simple for loop with i  from 1 to 10 with increment of 2 every time
        println(i)
    }


    println()
    for (i in 1 until 5) {       // for loop with i from 1 until 5 (5 not included)
        println(i)
    }


    println()
    for (i in 10 downTo 1 step 2) {     // (reverse)for loop with i from 10 to 1 reverse with decrement of 2 (step 2)
        println(i)
    }


    println()
    val table = 2
    for (i in 1..10) {
        println(table.toString() + " X " + i + " = " + (table * i))
        println("$table X $i = ${table * i}")// String templating (same as above but in different format)($ is used to add variable in string)
    }

}