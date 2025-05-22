package qc.xburnsx.tutoriel

/*
Ce fichier explique comment utiliser les structures conditionnelles en Kotlin
pour permettre à votre programme de prendre des décisions.
Les conditions sont basées sur des expressions qui évaluent à 'true' (vrai) ou 'false' (faux).
*/

fun main() {

    // --- L'instruction 'if' ---
    // L'instruction 'if' exécute un bloc de code si une condition est vraie.
    println("--- Section 'if' simple ---")
    val ageUtilisateur = 20
    if (ageUtilisateur >= 18) { // La condition est (ageUtilisateur >= 18)
        println("L'utilisateur est majeur.") // Ce code s'exécute car 20 >= 18 est vrai.
    }

    val temperatureExterieure = 25
    if (temperatureExterieure > 30) {
        println("Il fait très chaud !") // Ce code ne s'exécute pas car 25 > 30 est faux.
    }
    println("Vérification de la température terminée.")


    println("\n--- Section 'if-else' ---")
    // --- L'instruction 'if-else' ---
    // 'if-else' permet d'exécuter un bloc de code si la condition est vraie,
    // et un autre bloc de code si la condition est fausse.

    val aDesSuperPouvoirs = false
    if (aDesSuperPouvoirs == true) { // ou plus simplement : if (aDesSuperPouvoirs)
        println("C'est un super-héros !")
    } else {
        println("C'est une personne ordinaire (mais peut-être extraordinaire quand même !).") // Ce bloc s'exécute.
    }

    val nombre = 7
    if (nombre % 2 == 0) { // L'opérateur % (modulo) donne le reste d'une division.
        println("$nombre est un nombre pair.")
    } else {
        println("$nombre est un nombre impair.") // Ce bloc s'exécute car 7 % 2 n'est pas 0.
    }


    println("\n--- Section 'if-else if-else' ---")
    // --- L'instruction 'if-else if-else' ---
    // Permet de tester plusieurs conditions à la suite.
    // Dès qu'une condition est vraie, son bloc de code est exécuté, et le reste est ignoré.
    // Le 'else' final est optionnel et s'exécute si aucune des conditions précédentes n'est vraie.

    val noteExamen = 75 // Note sur 100

    if (noteExamen >= 90) {
        println("Mention : Excellent (A)")
    } else if (noteExamen >= 80) {
        println("Mention : Très Bien (B)")
    } else if (noteExamen >= 70) {
        println("Mention : Bien (C)") // Ce bloc s'exécute car 75 >= 70 est vrai.
    } else if (noteExamen >= 60) {
        println("Mention : Passable (D)")
    } else {
        println("Mention : Insuffisant (F)")
    }


    println("\n--- Opérateurs de Comparaison et Logiques ---")
    // Opérateurs de comparaison :
    // ==  (égal à)
    // !=  (différent de)
    // >   (plus grand que)
    // <   (plus petit que)
    // >=  (plus grand ou égal à)
    // <=  (plus petit ou égal à)

    // Opérateurs logiques :
    // &&  (ET logique : les deux conditions doivent être vraies)
    // ||  (OU logique : au moins une des deux conditions doit être vraie)
    // !   (NON logique : inverse la valeur d'un booléen)

    val ageChauffeur = 25
    val possedePermis = true
    val aAssurance = true

    if (ageChauffeur >= 18 && possedePermis && aAssurance) {
        println("Le chauffeur est autorisé à conduire ce véhicule.")
    } else {
        println("Le chauffeur n'est pas autorisé.")
    }

    val estWeekend = true
    val faitBeau = false
    if (estWeekend || faitBeau) {
        println("Bonne journée pour une sortie !") // S'exécute car estWeekend est vrai.
    }

    if (!faitBeau) { // Si NON faitBeau (donc si faitBeau est false)
        println("Dommage pour la météo, mais on peut quand même s'amuser.")
    }


    println("\n--- L'instruction 'when' (alternative à if-else if) ---")
    // 'when' est souvent plus lisible quand on a plusieurs branches basées sur la valeur d'une variable.

    val codeCouleur = 2 // 1: Rouge, 2: Vert, 3: Bleu

    println("Signification du code couleur $codeCouleur :")
    when (codeCouleur) {
        1 -> {
            println("Couleur : Rouge")
            println("Action : Arrêter")
        }
        2 -> {
            println("Couleur : Vert") // Ce bloc s'exécute.
            println("Action : Avancer")
        }
        3 -> {
            println("Couleur : Bleu")
            println("Action : Attendre")
        }
        else -> { // Le 'else' est comme le 'else' final d'un if-else if.
            println("Code couleur inconnu.")
        }
    }

    // 'when' peut aussi être utilisé sans argument, comme une chaîne if/else if plus flexible :
    val valeurTest = 15
    println("\nAnalyse de la valeurTest ($valeurTest) avec 'when' sans argument:")
    when {
        valeurTest < 0 -> println("La valeur est négative.")
        valeurTest == 0 -> println("La valeur est zéro.")
        valeurTest in 1..10 -> println("La valeur est entre 1 et 10 (inclus).") // 'in' pour les intervalles
        valeurTest > 10 && valeurTest <= 20 -> println("La valeur est entre 11 et 20 (inclus).") // Ce bloc s'exécute.
        else -> println("La valeur est supérieure à 20.")
    }

    // 'when' peut aussi retourner une valeur (utilisé comme une expression)
    val typeDeJour = when (codeCouleur) {
        1, 2, 3, 4, 5 -> "Jour de semaine" // Plusieurs valeurs pour une même branche
        6, 7 -> "Weekend"
        else -> "Jour non valide"
    }
    println("Basé sur un autre code (ex: $codeCouleur), c'est un : $typeDeJour")


    println("\n--- Conditions imbriquées ---")
    // On peut mettre des 'if' à l'intérieur d'autres 'if'
    val estConnecte = true
    val estAdmin = false

    if (estConnecte) {
        println("Utilisateur connecté.")
        if (estAdmin) {
            println("Accès administrateur accordé.")
        } else {
            println("Accès utilisateur standard.") // Ce bloc s'exécute.
        }
    } else {
        println("Veuillez vous connecter.")
    }
}

/*
Résumé des points clés sur les conditions :
1.  'if (condition) { ... }' : Exécute le bloc si la condition est vraie.
2.  'else { ... }' : Exécute le bloc si la condition du 'if' précédent est fausse.
3.  'else if (condition) { ... }' : Permet de chaîner plusieurs conditions.
4.  Opérateurs de comparaison (==, !=, <, >, <=, >=) pour créer des conditions.
5.  Opérateurs logiques (&& ET, || OU, ! NON) pour combiner des conditions.
6.  'when (variable) { valeur -> ..., else -> ... }' : Alternative élégante pour des choix multiples basés sur une variable.
7.  'when { condition -> ..., else -> ... }' : Alternative à if/else if pour des conditions plus complexes.
8.  Les conditions sont la base pour rendre vos programmes intelligents et réactifs.
*/
