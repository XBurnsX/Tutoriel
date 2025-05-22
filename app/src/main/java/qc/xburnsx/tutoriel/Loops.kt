package qc.xburnsx.tutoriel

/*
Ce fichier explique comment utiliser les boucles en Kotlin pour répéter
des blocs de code. Les boucles sont essentielles pour automatiser des tâches
répétitives ou pour traiter des collections de données.
*/

fun main() {

    // --- La boucle 'for' ---
    // La boucle 'for' est idéale pour itérer sur une séquence (comme un intervalle de nombres,
    // les caractères d'une chaîne, ou les éléments d'une collection que nous verrons plus tard).
    // La variable d'itération (ex: 'i' ci-dessous) est comme une 'val' à l'intérieur de chaque tour.

    println("--- Boucle 'for' avec un intervalle (range) ---")
    // '1..5' crée un intervalle de nombres de 1 à 5 inclus.
    for (i in 1..5) {
        println("Le nombre est : $i")
    }

    println("\n--- Boucle 'for' avec 'until' (exclut la borne supérieure) ---")
    // '1 until 5' crée un intervalle de 1 à 4 (5 est exclu).
    for (compteur in 1 until 5) {
        println("Compteur 'until' : $compteur")
    }

    println("\n--- Boucle 'for' avec 'downTo' (compte à rebours) ---")
    // '5 downTo 1' compte de 5 jusqu'à 1.
    for (decompte in 5 downTo 1) {
        println("Décompte : $decompte")
    }
    println("Décollage !")

    println("\n--- Boucle 'for' avec 'step' (par pas de X) ---")
    // '0..10 step 2' va de 0 à 10, en avançant de 2 en 2.
    for (nombrePair in 0..10 step 2) {
        println("Nombre pair : $nombrePair")
    }

    println("\n--- Boucle 'for' pour parcourir une chaîne de caractères ---")
    val message = "Salut"
    for (caractere in message) { // 'caractere' prendra la valeur de chaque lettre de "Salut"
        println("Caractère : $caractere")
    }


    println("\n\n--- La boucle 'while' ---")
    // La boucle 'while' répète un bloc de code TANT QU'une condition spécifiée est vraie.
    // La condition est vérifiée AVANT chaque exécution du bloc.
    // Il est crucial de s'assurer que la condition deviendra fausse à un moment donné,
    // sinon vous créez une boucle infinie !

    var nombreDeVies = 3
    println("Début du jeu. Vous avez $nombreDeVies vies.")

    while (nombreDeVies > 0) { // Tant que le nombre de vies est supérieur à 0
        println("Vous jouez... Vous avez encore $nombreDeVies vie(s).")
        // Simuler la perte d'une vie (dans un vrai jeu, cela dépendrait d'une action)
        println("Oups, vous avez perdu une vie !")
        nombreDeVies-- // Décrémente le nombre de vies (équivalent à nombreDeVies = nombreDeVies - 1)
        // C'est essentiel pour que la condition (nombreDeVies > 0) devienne fausse un jour.
    }
    println("Game Over. Vous n'avez plus de vies.")


    println("\n--- Exemple de 'while' pour une validation d'entrée ---")
    var entreeUtilisateur = ""
    val motSecret = "kotlin"
    var tentatives = 0
    val maxTentatives = 3

    // On demande le mot secret tant qu'il n'est pas correct ET qu'il reste des tentatives
    while (entreeUtilisateur != motSecret && tentatives < maxTentatives) {
        tentatives++ // Incrémente le compteur de tentatives
        print("Tentative $tentatives/$maxTentatives - Entrez le mot secret : ")
        entreeUtilisateur = readln()

        if (entreeUtilisateur != motSecret && tentatives < maxTentatives) {
            println("Incorrect. Essayez encore.")
        }
    }

    if (entreeUtilisateur == motSecret) {
        println("Bravo ! Mot secret trouvé : '$motSecret'")
    } else {
        println("Désolé, vous avez épuisé vos tentatives. Le mot était '$motSecret'.")
    }


    println("\n\n--- La boucle 'do-while' ---")
    // La boucle 'do-while' est similaire à 'while', mais la condition est vérifiée APRÈS
    // l'exécution du bloc. Cela garantit que le bloc de code est exécuté AU MOINS UNE FOIS.

    var choixUtilisateur: String
    println("\n--- Exemple de 'do-while' pour un menu ---")
    do {
        println("\nMenu :")
        println("1. Commencer une nouvelle partie")
        println("2. Charger une partie")
        println("3. Options")
        println("4. Quitter")
        print("Votre choix (1-4) : ")
        choixUtilisateur = readln()

        when (choixUtilisateur) {
            "1" -> println("Nouvelle partie lancée...")
            "2" -> println("Chargement de la partie...")
            "3" -> println("Ouverture des options...")
            "4" -> println("Fermeture de l'application...")
            else -> println("Choix invalide. Veuillez réessayer.")
        }
        // La boucle continue tant que l'utilisateur ne choisit pas de quitter ("4")
    } while (choixUtilisateur != "4")

    println("Merci d'avoir joué !")
}

/*
Résumé des points clés sur les boucles :
1.  'for (variable in sequence) { ... }' :
    - Idéal pour itérer sur des éléments connus (intervalles, chaînes, collections).
    - La variable d'itération est une 'val' dans chaque tour.
    - Utilise des 'ranges' comme `1..5`, `1 until 5`, `5 downTo 1`, `0..10 step 2`.

2.  'while (condition) { ... }' :
    - Répète tant que la condition est vraie.
    - La condition est testée AVANT chaque itération.
    - Attention à la boucle infinie : la condition doit pouvoir devenir fausse.

3.  'do { ... } while (condition)' :
    - Le bloc est exécuté AU MOINS UNE FOIS.
    - La condition est testée APRÈS chaque itération.
    - Utile pour les menus ou quand une action doit se produire avant la vérification.
*/
