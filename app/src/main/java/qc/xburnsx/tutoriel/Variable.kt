package qc.xburnsx.tutoriel

// https://www.codecademy.com/learn/learn-kotlin/modules/learn-kotlin-introduction-to-kotlin/cheatsheet
// https://kotlinlang.org/docs/numbers.html

fun main(){


    /*                                       <!> Variable type <!>
    * Int -> Integer Number
    * Long -> Long Number : Add L suffixe after number
    * Double -> Decimal Number
    * Float -> Decimal Number but less preciion : Add F suffixe after number
    * String -> Text*
    * Char -> Seulement 1 character
    * Bool -> True or False
    * Any -> can be any type

    //!                                  <!> Declaration de variable <!>

    val -> Value , Cannot be changed
    var -> Variable , Can be changed
    */
    val a = 10
    val smallDept = -0.72
    var hello = "Hello World!"
    val dollar = '$'
    val million = 1_000_000       // We can use _ for thousand separator

    val name: String = "Toutie" // -> can assign a type specific with :
    val d1: Double = a.toDouble() // -> Add .toDouble for convert int to double

    // + : add, - : sub, * : mul, / : div and %: modulo
    // Instead of a = a + b you can use a += b
    // We can increment of 1 with ++
    // Can use .length for the length of the string
    // print("ABC".length)
    // Can do some operation in String with ${var1 + var2}
    var e = 5
    val eq = 6 + e++ // the result will be 11 and then a will be = 6
    val newEq = 6+e // the result will be = 12/ the result will be = 12

    // The String type has multiple functions for searching its contents
    val myString = "Hello"
    val startsWithHel = myString.startsWith("Hel")

    val myString1 = "Hello"
    val endsWithLo = myString1.endsWith("lo")
    // Get the first character
    val myString2 = "Hello"
    val firstChar = myString2.first()
    //  Get the last character
    val myString3 = "Hello"
    val lastChar = myString3.last()
    // True if the String is equal to Hello, otherwise false
    val myString4 = "Hello"
    val equalsHello = myString4.equals("Hello")

/*
&& -> The AND operator evaluates to true only if both operands are true.
|| -> OR operator evaluates to true if at least one of its operands is true.





 */




}