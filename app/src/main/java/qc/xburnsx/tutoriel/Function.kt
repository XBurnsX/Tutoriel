package qc.xburnsx.tutoriel

/*
Ce fichier explore en détail le concept des fonctions en Kotlin.
Les fonctions sont des blocs de code nommés et réutilisables qui effectuent
une tâche spécifique. Elles sont essentielles pour organiser le code, éviter la
répétition et rendre les programmes plus lisibles et maintenables.
*/

// --- 1. Déclaration et Appel d'une Fonction Simple (sans paramètres, sans retour) ---

// DÉCLARATION de la fonction :
// 'fun' est le mot-clé pour déclarer une fonction.
// 'afficherSeparateur' est le nom que nous donnons à cette fonction.
// '()' indique qu'elle ne prend aucun paramètre (aucun "ingrédient").
// Elle ne retourne rien explicitement, donc son type de retour est 'Unit' (implicite).
fun afficherSeparateur() {
    // Ceci est le CORPS de la fonction : les instructions qu'elle exécute.
    println("--------------------")
    println("****** Section ******")
    println("--------------------")
}

// --- 2. Fonction avec des Paramètres ---
// Les paramètres sont les "informations" ou "ingrédients" que la fonction reçoit pour travailler.

// DÉCLARATION :
// 'nom: String' et 'age: Int' sont les paramètres.
// 'nom' est un paramètre de type String.
// 'age' est un paramètre de type Int.
fun presenterPersonne(nom: String, age: Int) {
    println("Bonjour, je m'appelle $nom et j'ai $age ans.")
}

// --- 3. Fonction avec un Type de Retour ---
// Une fonction peut "produire" un résultat et le retourner à l'endroit où elle a été appelée.
// On spécifie le type de la valeur retournée après les parenthèses des paramètres, avec ': Type'.

// DÉCLARATION :
// Cette fonction prend deux Int en paramètres et PROMET de retourner un Int (leur somme).
fun additionner(nombre1: Int, nombre2: Int): Int {
    val somme = nombre1 + nombre2
    return somme // L'instruction 'return' renvoie la valeur 'somme'.
    // L'exécution de la fonction s'arrête ici.
}

// --- 4. Fonction avec Paramètres et Type de Retour (plus complexe) ---

// DÉCLARATION :
// Cette fonction détermine si un nombre est pair.
// Elle prend un 'Int' et retourne un 'Boolean' (true si pair, false si impair).
fun estPair(nombre: Int): Boolean {
    val resultatVerification = (nombre % 2 == 0) // L'expression (nombre % 2 == 0) est déjà un Boolean
    return resultatVerification
    // On pourrait aussi écrire directement : return nombre % 2 == 0
}

// --- 5. Fonction avec Valeurs par Défaut pour les Paramètres ---
// On peut donner des valeurs par défaut aux paramètres. Si l'appelant ne fournit pas
// de valeur pour ce paramètre, la valeur par défaut sera utilisée.

// DÉCLARATION :
// 'message' est obligatoire.
// 'prefixe' a une valeur par défaut "INFO".
fun loggerMessage(message: String, prefixe: String = "INFO") {
    println("[$prefixe] $message")
}

// --- Utilisation des fonctions dans 'main' ---
fun main() {
    println("Début du programme principal.")

    // APPEL de la fonction 'afficherSeparateur'
    afficherSeparateur() // Exécute le code défini dans afficherSeparateur.

    // APPEL de la fonction 'presenterPersonne' avec des arguments
    val nomAmi = "Julien"
    val ageAmi = 28
    presenterPersonne(nomAmi, ageAmi) // 'nomAmi' est passé à 'nom', 'ageAmi' à 'age'.
    presenterPersonne("Sophie", 32)   // On peut aussi passer des valeurs directes.

    afficherSeparateur()

    // APPEL de la fonction 'additionner' et utilisation de sa valeur de retour
    val resultatCalcul = additionner(15, 7) // 'additionner' retourne 22.
    // La valeur 22 est stockée dans 'resultatCalcul'.
    println("Le résultat de 15 + 7 est : $resultatCalcul")
    println("Un autre calcul : 100 + 50 = ${additionner(100, 50)}") // Appel direct dans un template

    afficherSeparateur()

    // APPEL de la fonction 'estPair'
    val nombreATester1 = 10
    val nombreATester2 = 7
    val test1EstPair = estPair(nombreATester1) // test1EstPair vaudra 'true'
    val test2EstPair = estPair(nombreATester2) // test2EstPair vaudra 'false'

    println("Le nombre $nombreATester1 est pair ? $test1EstPair")
    println("Le nombre $nombreATester2 est pair ? $test2EstPair")

    if (estPair(99)) { // On peut utiliser l'appel de fonction directement dans une condition
        println("99 est pair.")
    } else {
        println("99 est impair.")
    }

    afficherSeparateur()

    // APPEL de la fonction 'loggerMessage' avec et sans le paramètre optionnel
    loggerMessage("Le système a démarré correctement.") // 'prefixe' utilisera "INFO"
    loggerMessage("Erreur critique détectée !", "URGENT") // 'prefixe' sera "URGENT"
    loggerMessage(prefixe = "AVERTISSEMENT", message = "Niveau de batterie faible.") // Arguments nommés

    println("\nFin du programme principal.")
}

/*
Résumé des points clés sur les fonctions :
1.  MOT-CLÉ 'fun' : Indique le début de la déclaration d'une fonction.
2.  NOM DE LA FONCTION : Doit être descriptif (ex: 'calculerMoyenne', 'afficherUtilisateur'). Convention camelCase.
3.  PARAMÈTRES (entre parenthèses '()') :
    - Les "entrées" ou "ingrédients" de la fonction.
    - Chaque paramètre a un nom et un type (ex: 'nom: String', 'quantite: Int').
    - Séparés par des virgules s'il y en a plusieurs.
    - Peuvent avoir des valeurs par défaut (ex: 'niveau: Int = 1').
4.  TYPE DE RETOUR (après les paramètres, avec ': Type') :
    - Spécifie le type de la valeur que la fonction va "produire" et renvoyer.
    - Exemples : ': Int', ': String', ': Boolean'.
    - Si la fonction ne retourne rien d'utile (elle fait juste une action), le type est ': Unit'.
      On peut omettre ': Unit', Kotlin le comprend par défaut.
5.  CORPS DE LA FONCTION (entre accolades '{}') :
    - Contient les instructions (le code) que la fonction exécute.
6.  INSTRUCTION 'return' :
    - Utilisée dans les fonctions qui ont un type de retour (autre que Unit).
    - Spécifie la valeur à renvoyer.
    - Arrête immédiatement l'exécution de la fonction.
7.  APPEL DE FONCTION :
    - Pour exécuter une fonction, on utilise son nom suivi de parenthèses.
    - S'il y a des paramètres, on fournit les valeurs (arguments) correspondantes.
    - Ex: 'maFonction()', 'calculer(10, 20)'.
8.  AVANTAGES :
    - RÉUTILISABILITÉ : Écrire le code une fois, l'utiliser plusieurs fois.
    - ORGANISATION : Découper un gros problème en plus petites tâches gérables.
    - LISIBILITÉ : Un code bien organisé en fonctions est plus facile à comprendre.
    - MAINTENANCE : Plus facile de corriger ou de modifier une petite fonction spécifique.
*/

































