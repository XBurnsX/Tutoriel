package qc.xburnsx.tutoriel

/* fun main(){  */               //! Exercise 1
//
//    val level1 = 79
//    val level2 = 92
//    val level3 = 86
//
//    val totalScore = level1 + level2 + level3
//    val average = totalScore / 3
//
//    val boostMultiplier = 4
//    val scoreBoost = totalScore * boostMultiplier
//    val totalBoostScore = scoreBoost + totalScore
//
//    println(level1 + level2 * level3)
//
//    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
//
//    println((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
//
//    println(13530.0 / 1.23)
//
//    println("You have a total of : $totalScore and an average of : $average points")
//
//    println("Wow you find the bonus! your gain $scoreBoost point! Your total is $totalBoostScore points")
//
//    println(150+2+100*2)
//}

/* fun main(){  */               //! Exercise 2

//    var weekDay = "monday"
//
//    if (weekDay == "monday") {
//        println("8AM to 12PM")
//    } else if (weekDay == "Tuesday"){
//        println("8AM to 6PM")
//    } else if (weekDay == "Wednesday"){
//        println("8AM to 6PM")
//    } else if (weekDay == "Thursday"){
//        println("8AM to 6PM")
//    } else if (weekDay == "Friday"){
//        println("8AM to 9PM")
//    } else if (weekDay == "Saturday"){
//        println("8AM to 4PM")
//    } else {
//        println("8AM to 4PM")
//    }
//
//    var weekDay = "Sunday"
//    var horaire = when (weekDay) {
//        "Monday" -> "8AM to 12PM"
//        "Tuesday" -> "8AM to 6PM"
//        "Wednesday" -> "8AM to 6PM"
//        "Thursday" -> "8AM to 6PM"
//        "Friday" -> "8AM to 9PM"
//        "Saturday" -> "9AM to 4PM"
//        else -> "8AM to 4PM"
//    }
//    println("On $weekDay, the opening hours are: " + horaire)
//
//    var weekDay2 = "Sunday"
//    var hour = 19
//
//    val isOpening = when (weekDay2){
//        "Monday" -> hour >= 8 && hour <= 24
//        "Tuesday" -> hour >= 8 && hour <= 18
//        "Wednesday" -> hour >= 8 && hour <= 18
//        "Thursday" -> hour >= 8 && hour <= 18
//        "Friday" -> hour >= 8 && hour <= 21
//        "Saturday" -> hour >= 9 && hour <= 16
//        else -> hour >= 8 && hour <= 16
//    }
//    val isOpen = if (isOpening) "Open" else "Close"
//    println("Welcome to Little Lemon we are now $isOpen ")
//}

/* fun main(){  */               //! Exercise 3



//for (i in 1 .. 5) {
//    val numberOfSpace = i - 1
//
//    for (j in 1 .. numberOfSpace) {
//        print(" ")
//    }
//    val numberOfStar = 6 - i
//    for (j in 1..numberOfStar) {
//        print("*")
//    }
//    println()
//}
////------------------------------------------------
//    for (i in 1..5) {
//        val numberOfSpaces = i - 1
//        for (j in 1..numberOfSpaces) {
//            print(" ")
//        }
//        val numberOfStars = 11 - i * 2
//        for (j in 1..numberOfStars) {
//            print("*")
//        }
//        println()
//    }
////------------------------------------------------
//    for (i in 1 until 5) {
//        val numberOfSpaces = 5 - i
//        for (j in 1..numberOfSpaces) {
//            print(" ")
//        }
//        val numberOfStars = i
//        for (j in 1..numberOfStars) {
//            print("*")
//        }
//        println()
//    }
//    for (i in 1..5) {
//        val numberOfSpaces = i - 1
//        for (j in 1..numberOfSpaces) {
//            print(" ")
//        }
//        val numberOfStars = 6 - i
//        for (j in 1..numberOfStars) {
//            print("*")
//        }
//        println()
//    }

//!                              Exercise 4

//fun getPoints(score: Int = 0, boost: Int = 0) :Int {
//    return score * boost
//}
//fun main() {
//    var score = 0;
//    println(score)
//    score += getPoints(10, 1)
//    println(score)
//    score += getPoints(20, 2)
//    println(score)
//    score += getPoints(-10, 1)
//    println(score)
//    score += getPoints(5, 3)
//    println(score)
//    score += getPoints(-15, 2)
//}

//!                              Exercise 5