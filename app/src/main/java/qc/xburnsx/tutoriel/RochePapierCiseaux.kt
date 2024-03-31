package qc.xburnsx.tutoriel

fun main() {

    playGame()
}
fun playGame() {

    println("Veuillez choisir entre Roche, Papier, Ciseaux")
    var playerChoice = readln()

    while (playerChoice != "Roche" && playerChoice != "Papier" && playerChoice != "Ciseaux") {
        println("Choix invalide, Veuillez choisir entre Roche, Papier, Ciseaux")
        playerChoice = readln()
    }

    var computerChoice = (1..3).random()
    var computerDecision = when (computerChoice) {
        1 -> "Roche"
        2 -> "Papier"
        3 -> "Ciseaux"
        else -> "Invalid"
    }

    println("L'ordinateur a choisi $computerDecision")
    println("Joueur a choisi $playerChoice")

    var result = when (playerChoice) {
        computerDecision -> "Égalité"
        "Roche" -> if (computerDecision == "Ciseaux") "Joueur gagne" else "Ordinateur gagne"
        "Papier" -> if (computerDecision == "Roche") "Joueur gagne" else "Ordinateur gagne"
        "Ciseaux" -> if (computerDecision == "Papier") "Joueur gagne" else "Ordinateur gagne"
        else -> "Erreur"  // On peut ajouter une option "Erreur" pour gérer les entrées imprévues
    }

    println("Le $result")

    println("\nVoulez-vous rejouer? (Oui/Non)")
    var playAgain = readln()
    while (playAgain != "Oui" && playAgain != "Non") {
        println("Saisie invalide. Veuillez entrer Oui ou Non.")
        playAgain = readln()
    }

    if (playAgain == "Oui") {
        playGame()
    } else {
        println("Merci d'avoir joué !")
    }
}