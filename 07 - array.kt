fun main() {
//    arrays
    var arr = arrayOf("one", "two","three")
    var arr1 = arrayOf(1,2,3)

    var arr3 = arrayOf<Int>(3,4,5)

//    for loop for traversing array
    for ((i,e) in arr.withIndex()){     //for loop for accessing array along with its index (i for its index, e for its value)
        println("$i - $e")
    }

    println()//just for space

//    to access the array
    println(arr[0])
    println(arr.get(1))

    println()//just for space

//    to change value of array based on index
    arr.set(0, "hello")
    println(arr[0])

    println(arr.size)   // to get size of array
}