package qc.xburnsx.tutoriel

// https://kotlinlang.org/docs/functions.html
// https://www.geeksforgeeks.org/kotlin-functions/?ref=lbp

//    //!                               Variable scope
//    // Inside of functions, it is possible for variables to be defined.
//    // These variables are called local variables, and they are visible only in their
//    // definition scope: the braces inside which they are defined
//
//fun f1() {
//    val a = "Text 1"
//    println(a) // can use a here
//    // here, I cannot use b
//}
//fun f2() {
//    val b = "Text 2"
//    f2()
//    println(b) // can use b here
//    // here, I cannot use a
//}
//fun main() {
//    f2()
//    // here, I cannot neither use a or b
//}
//
//!                                     Wider Scope
//    // To make a variable that can be used by multiple functions,
//    // define it at the same level as those functions.
//var name = ""
//fun setName() {
//    name = "Mike"
//}
//fun printName() {
//    println(name)
//}
//fun main() {
//    setName()
//    printName()
//}
//
//!                                     Local functions
//    // Just as local variables can be defined, so too can local functions.
//    // This is what functions defined inside other functions are called.
//    // Just like local variables, they can only be used in the scope of their definition.
//fun b() {
//    // here I cannot use function a
//}
//fun main() {
//    // here I cannot use function a
//    fun a() {
//        println("A")
//        }
//    a() // Here I can use function a
//    b()
//    c()
//    a() // Here I can use function a
//}
//fun c() {
//    // here I cannot use function a
//}

//!                                 functions with parameter

// Parameter -> Variable defined as part function definition
// Value passed when function is called
//fun double(value: Int) :Int { // <- :Int , Return the value
//    return value * 2
//}
//val result: Int = double(23)
//fun main() {
//    print(result)
//}
//
//!                                   Functions with return
//// Functions can also return a value. For that, a function should declare the return type,
//// using a colon and type after the parameters parenthesis.
//// Inside a body, such a function should also use return to return the value.
//
//fun triangleArea(width: Double, height: Double): Double {
//    return width * height / 2
//}
//fun main() {
//    val area: Double = triangleArea(1.0, 2.0)
//    println(area) // 1.0
//    println(triangleArea(2.0, 2.0)) // 2.0
//    println(triangleArea(5.0, 5.0)) // 12.5
//    println(triangleArea(10.0, 20.0)) // 100.0
//}
////--------------------------------------------------
//fun biggerOf(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    }
//        return b
//}
//fun main() {
//    println(biggerOf(3, 1)) // 3
//    println(biggerOf(10, 20)) // 20
//}
//
//!                                 Unreachable code after return
//// Using the return keyword immediately ends a function call, so whatever is placed after it won't be called.
//
//!                                 Single-expression functions
//// Instead of braces with the body, you use the equality sign, which specifies what should be returned.
//fun triangleArea(width: Double, height: Double): Double = width * height / 2
//fun biggerOf(a: Int, b: Int): Int = if (a > b) a else b

//!                                         Recursion ( ? )
// With If Statement
//fun factorial(number: Int): Int {
//    if (number <= 1) {
//        return 1
//    }
//    return factorial(number - 1) * number
//}
//fun main() {
//    println(factorial(1)) // 1
//    println(factorial(2)) // 2
//    println(factorial(3)) // 6
//    println(factorial(4)) // 24
//    println(factorial(5)) // 120
//    println(factorial(6)) // 720
//}
//// With For loop
//fun factorial(number: Int): Int {
//    var accumulator = 1
//    for (i in 1..number) {
//        accumulator = accumulator * i
//    }
//    return accumulator
//}
//fun main() {
//    println(factorial(1)) // 1
//    println(factorial(2)) // 2
//    println(factorial(3)) // 6
//    println(factorial(4)) // 24
//    println(factorial(5)) // 120
//    println(factorial(6)) // 720
//}

//!                                         Named arguments ( ? )
// The use of the equals sign can be used to indicate the desired argument.
fun cheer(how: String = "Hello", who: String = "World") {
    println("$how $who")
}
fun main() {
    cheer()
    cheer(how = "Hi")
    cheer(who = "Toutie")

}




































