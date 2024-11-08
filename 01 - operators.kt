fun main() {
    var i = 13
    var j = 2

//    arthmetic operator
    println(i + j)
    println(i - j)
    println(i * j)
    println(i.toFloat() / j)
    println(i % j)

//    comparition operator
    println(i > j)
    println(i < j)
    println(i >= j)
    println(i <= j)
    println(i == j)
    println(i != j)

//    increment and decrement operator
    var a: Int = 5

    println(a)
    a++     //post incremental
    println(a)
    ++a     //pre incremental
    println(a)

    a--     //post decremental
    println(a)
    --a     //pre decremental
    println(a)


//    logical operator
    val above70 = false
    val knowsprogramming = true

//    && AND -- both the values need to be true to get output as true
    println(above70 && knowsprogramming)

//    || OR -- any one of the value is true the output will be true
    println(above70 || knowsprogramming)

//    short circuiting
    var x = 10
    var y = 11

    var result =
        x == 10 || y++ == 11   // in this case if the first condition (x) is satisfied it will not check or execute the second condition(y++)(y++ will only be executed if x condition is false)
    println(x)
    println(y)

//    not operator
    val answer = true
    println(answer)
    println(!answer)
}
