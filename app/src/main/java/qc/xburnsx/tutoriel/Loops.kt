package qc.xburnsx.tutoriel

// https://kotlinlang.org/docs/control-flow.html#while-loops

fun main() {

//                                       <!> While loops <!>
var number = 1
//------------------------------
while (number < 5) {
    //println(number)
    number++
}
//------------------------------
while (number <= 100){
    //println(number)
    number *= 2
}
//------------------------------
var i = 1
while (i * i <= 100) {
        //println(i * i)
        i++
        }

//                                       <!> For loops <!>
for (i in 1..5) { // 5 is count
    //print(i)
}
//------------------------------
for (i in 1 until 5) {// 5 is not count
    //print(i)
}
//------------------------------
for (i in 5 downTo 1) { // A declining number
    //print(i)
}
//------------------------------
for (i in 1..5 step 2) {
    //print(i)
}
val a = 1                   // Numbers can be used in variables.
val b = 10
val c = 2

for(i in a..b) {
    //print(i)
}
//------------------------------
for (i in a..b step c) {
    //print(i)
}
for (num in 5 downTo 1) {
    //println("$num lemonades are left")
    //println("Glupglupglup")
}
    //println("That is it")
    //println("Now I have to go")

//                                       <!> Nested loops <!>
// For loops inside a for loops = Nested loops
for (i in 5 downTo 1) {
    for (j in 1..i) {
        //print("*")
    }
    //println()
}
//------------------------------
val width = 5
for (i in 1 until width step 2) {
    for (j in 1..i) {
        //print("*")
    }
        //println()
}
for (i in width downTo 1 step 2) {
    for (j in 1..i) {
        print("*")
    }
        println()
}
//------------------------------
for (i in 1..5) {
    val numberOfSpaces = 5 - i
    for (j in 1..numberOfSpaces) {
        //print(" ")
    }
    val numberOfStars = i
    for (j in 1..numberOfStars) {
        //print("*")
    }
    //println()
}








}