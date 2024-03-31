package qc.xburnsx.tutoriel

fun main(){


    /*                                       <!> Variable type <!>
    * Int -> Integer Number
    * Long -> Long Number : Add L suffixe after number
    * Double -> Decimal Number
    * Float -> Decimal Number but less preciion : Add F suffixe after number
    * String -> Text
    * Bool -> True or False
    * Any -> can be any type

    //!                                  <!> Declaration de variable <!>

    val -> Value , Cannot be changed
    var -> Variable , Can be changed
    */
    val a = 10
    val smallDept = -0.72
    var b = "Hello World!"
    val million = 1_000_000       // We can use _ for thousand separator

    val name: String = "Toutie" // -> can assign a type specific with :
    val d1: Double = a.toDouble() // -> Add .toDouble for convert int to double

    // + : add, - : sub, * : mul, / : div and %: modulo
    // Instead of a = a + b you can use a += b
    // We can increment of 1 with ++
    var e = 5
    val eq = 6 + e++ // the result will be 11 and then a will be = 6
    val newEq = 6+e // the result will be = 12/ the result will be = 12










}