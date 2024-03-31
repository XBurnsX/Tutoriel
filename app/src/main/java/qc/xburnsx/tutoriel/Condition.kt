package qc.xburnsx.tutoriel

// https://kotlinlang.org/docs/control-flow.html#when-expression
fun main(){
    val accountType = "free"
    //                                       <!> If Statement <!>
    if (accountType == "free"){
        print("Show ads")
    }
    // Create variable with if statement
    val text3 = if (accountType == "free") "Free Account" else "Paid account"

    val finishedHomework = true
    if (finishedHomework) {
        println("Can go to the cinema")
    } else {
        println("Cannot go to the cinema")
    }

    val haveSomeExtraMoney = true
    val tip: Double = 3.64
        if (haveSomeExtraMoney) {
            10.0
        } else {
            0.0
        }
    println(tip)

    println("Is it going to rain?")
    val probabilite = 70
    if (probabilite <= 40) {
        println("Unlikely")
    } else if (probabilite <= 80) {
        println("Likely")
    } else if (probabilite < 100) {
        println("Yes")
    } else {
        println("What?")
    }

    //                                       <!> When Statement <!>
    // When statement
    val probability = 40
    when {
        probability <= 40 -> println("Unlikely")
        probability <= 80 -> println("Likely")
        probability < 100 -> println("Yes")
        else -> println("What?")
    }

    // Using when as an expression
    println("Is it going to rain?")
    val probability2 = 70
    val text4 = when {
        probability2 < 40 -> "Unlikely"
        probability2 <= 80 -> "Likely"
        probability2 < 100 -> "Yes"
        else -> "What?"
    }
    println(text4)

    // When with a value
    val number = 1 // or 2, 3, 4, 5, 6
    val text = when (number) {
        1 -> "Missed hit"
        2, 3, 4, 5 -> "Hit with value $number"
        6 -> "Critical hit"
        else -> "Unsupported value"
    }
    println(text)

    //Using ranges in when statements
    val number2 = 0 // or 2, 3, 4, 5, 6
    val text2 = when (number2) {
        in 0..1 -> "Missed hit"
        in 2..5 -> "Hit with value $number2"
        6 -> "Critical hit"
        else -> "Unsupported value"
    }

    // Type check
     var value = "ABC"

//    println(value is String) // true
//    println(value is Int) // false
//    println(value is Boolean) // false
//    println(value is Any) // true
//
//    value = 123
//
//    println(value is String) // false
//    println(value is Int) // true
//    println(value is Boolean) // false
//    println(value is Any) // true

    val something: Any = "ABC" // or 123, 0.1, true
    when (something) {
        is String -> println("This is String")
        is Int -> println("This is Int")
        is Double -> println("This is Double")
        is Boolean -> println("This is Boolean")
        }
    println(something)











}