import kotlin.math.pow

fun main() {

    println(addition(5, 7))
    println(addition(5.3, 2.4))

    println()

    println(sub(4.00,2.00))

    var fn1 = ::sub     //function sub is stored in fn1 variable
    println(fn1(10.00,7.00))      //fn1 is used as function as it stores function sub


    println()
    fn1 = ::power       //function(power()) is overloaded on fn1
    println(fn1(5.0,2.0))

}

fun addition(a: Int, b: Int): Int {
    return a + b
}
fun addition(a: Double, b: Double): Double {
    return a + b
}
fun sub(a: Double, b: Double): Double {
    return a - b
}
fun power(a: Double,b: Double): Double{
    return a.pow(b)
}