package qc.xburnsx.tutoriel

/*
Ce fichier a pour but d'expliquer et d'illustrer le concept des variables en Kotlin.
Une variable est comme une "boîte" nommée dans laquelle on peut stocker une information (une valeur).
Cette information peut être un nombre, du texte, un état vrai/faux, etc.
*/

fun main() {
    // --- Déclaration de Variables ---
    // En Kotlin, il y a deux mots-clés principaux pour déclarer des variables : 'val' et 'var'.

    // ---- 'val' : Pour les valeurs (immutables / constantes) ----
    // Une variable déclarée avec 'val' ne peut recevoir une valeur qu'UNE SEULE FOIS.
    // Une fois qu'une valeur lui est assignée, elle ne peut plus être changée.
    // Pense à 'val' comme à quelque chose qui est final, constant.
    // C'est une bonne pratique d'utiliser 'val' par défaut, à moins que tu aies VRAIMENT besoin de changer la valeur plus tard.

    val nomDuJeu: String = "Aventure Kotlin" // Ici, on déclare 'nomDuJeu' et on lui assigne la valeur "Aventure Kotlin".
    // Le type 'String' (chaîne de caractères) est spécifié explicitement.
    val scoreMaximumPossible = 1000       // Ici, Kotlin utilise l'inférence de type. Comme 1000 est un nombre entier,
    // Kotlin devine que 'scoreMaximumPossible' est de type 'Int'.
    val versionJeu = 1.0                  // Kotlin infère que 'versionJeu' est de type 'Double' (nombre à virgule).

    println("Nom du jeu : $nomDuJeu")
    println("Score maximum : $scoreMaximumPossible")
    println("Version : $versionJeu")

    // Si on essaie de changer la valeur d'une 'val', on aura une erreur de compilation :
    // nomDuJeu = "Nouveau Nom" // Cette ligne causerait une ERREUR : Val cannot be reassigned.
    // println(nomDuJeu)


    println("---") // Séparateur pour la clarté


    // ---- 'var' : Pour les variables (mutables) ----
    // Une variable déclarée avec 'var' peut voir sa valeur modifiée après son initialisation.
    // Utilise 'var' quand tu sais que la valeur de ta "boîte" va devoir changer au cours du programme.

    var scoreActuelDuJoueur: Int = 0 // On initialise le score à 0. Le type 'Int' est spécifié.
    println("Score actuel au début : $scoreActuelDuJoueur")

    scoreActuelDuJoueur = 50          // On change la valeur de 'scoreActuelDuJoueur'. C'est permis car c'est une 'var'.
    println("Score après avoir trouvé un trésor : $scoreActuelDuJoueur")

    scoreActuelDuJoueur = scoreActuelDuJoueur + 75 // On ajoute 75 au score actuel.
    println("Score après avoir complété une quête : $scoreActuelDuJoueur")

    var nomPersonnage = "Explorateur" // Kotlin infère que 'nomPersonnage' est une 'String'.
    println("Nom du personnage : $nomPersonnage")

    nomPersonnage = "Explorateur chevronné" // On change le nom.
    println("Nom du personnage mis à jour : $nomPersonnage")


    println("---")


    // ---- Inférence de Type ----
    // Kotlin est souvent assez intelligent pour deviner le type d'une variable
    // à partir de la valeur que tu lui donnes à sa création. C'est l'inférence de type.
    // Cela rend le code plus concis.

    val pi = 3.14159 // Kotlin infère 'Double'
    val estActif = true // Kotlin infère 'Boolean'
    val messageInitial = "Chargement..." // Kotlin infère 'String'

    println("Valeur de pi (inféré Double) : $pi")
    println("Statut actif (inféré Boolean) : $estActif")
    println("Message (inféré String) : $messageInitial")

    // Même si Kotlin infère le type, tu peux toujours le spécifier explicitement si tu le souhaites
    // pour plus de clarté ou dans des cas plus complexes.
    val nombreDeVies: Int = 3 // Explicite, même si Kotlin aurait pu l'inférer.


    // ---- Convention de Nommage ----
    // En Kotlin, on utilise généralement le "camelCase" pour nommer les variables.
    // Cela signifie que le premier mot est en minuscules, et chaque mot suivant
    // commence par une majuscule, sans espaces ni tirets.
    // Exemples : maSuperVariable, nombreDEntrees, nomCompletUtilisateur.


    // ---- Immutabilité et 'val' ----
    // Préférer 'val' autant que possible est une bonne pratique en Kotlin.
    // Cela rend ton code plus sûr et plus facile à comprendre, car tu sais que
    // la valeur d'une 'val' ne changera pas de manière inattendue ailleurs dans ton programme.
    // N'utilise 'var' que lorsque la valeur doit réellement changer.

    val dateDeCreation = "21/05/2025" // Une date de création ne change pas, donc 'val' est parfait.
    println("Ce fichier a été conceptuellement créé le : $dateDeCreation")
}

/*
Résumé des points clés sur les variables :
1.  'val' : Pour les valeurs qui ne changent pas (immutables, constantes). À privilégier.
2.  'var' : Pour les valeurs qui peuvent changer (mutables). À utiliser avec parcimonie.
3.  Inférence de type : Kotlin devine souvent le type, ce qui allège le code.
4.  Spécification explicite du type : `nomVariable: Type = valeur` (utile pour la clarté ou si l'inférence n'est pas possible).
5.  Nommage : Utiliser le camelCase (ex: `maVariable`).
*/
