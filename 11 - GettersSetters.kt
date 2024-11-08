fun main() {
    val ob = Calculator()
    println(ob.add(2, 3))

    val p1 = Person2("hello world", 23)
    println("name ${p1.name} - age ${p1.age}")

    p1.age = -12        // it will show - (age can not be negative) because of validation applied
    println(p1.name)    // it will show name in upper case as it is returned by getter
}

class Calculator {
    lateinit var messsage: String           //lateinit is used to declare value later

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}

class Person2(nameParam: String, ageParam: Int) {
    var name: String = nameParam
        get() {                             // getter used to get value of variable
            return field.uppercase()        // returned value in uppercase {field is pointer to variable} (in this case "name")
        }
    var age: Int = ageParam
        set(value) {                        // setters used to set value of variable
            if (value > 0) {                // if condition to validate the value
                field =
                    value               // in this "field is used to denote variable {field is pointer to variable} (in this case "age")
            } else {
                println("age can not be negative")
            }
        }
}