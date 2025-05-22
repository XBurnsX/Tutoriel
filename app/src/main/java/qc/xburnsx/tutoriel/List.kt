package qc.xburnsx.tutoriel

// 1. DÉCLARATION D'UNE DATA CLASS
// On utilise le mot-clé 'data' avant 'class'.
// Les propriétés (les "champs" de données) sont déclarées dans le constructeur principal (entre parenthèses).
// Il est fortement recommandé d'utiliser 'val' pour les propriétés d'une data class,
// pour favoriser l'immutabilité, mais 'var' est possible si nécessaire.

data class EntreeJournal(
    val date: String,
    val texte: String,
    val humeur: String,
    val nomPhoto: String? // Le '?' signifie que nomPhoto peut être null (pas de photo)
)

fun main() {
    println("--- Utilisation des Data Classes ---")

    // 2. CRÉATION D'INSTANCES (OBJETS) DE NOTRE DATA CLASS
    // On crée des objets 'EntreeJournal' comme on appellerait une fonction,
    // en fournissant les valeurs pour chaque propriété définie dans le constructeur.

    val entree1 = EntreeJournal(
        date = "2025-05-21",
        texte = "Aujourd'hui, j'ai appris les data classes en Kotlin. C'est super intéressant !",
        humeur = "Enthousiaste",
        nomPhoto = "selfie_kotlin.jpg"
    )

    val entree2 = EntreeJournal(
        date = "2025-05-22",
        texte = "J'ai fait une longue promenade et j'ai vu un écureuil.",
        humeur = "Paisible",
        nomPhoto = null // Pas de photo pour cette entrée
    )

    // 3. ACCÈS AUX PROPRIÉTÉS DES OBJETS
    // On utilise la notation pointée (objet.propriete) pour lire les valeurs.
    println("\nDétails de l'entrée 1 :")
    println("Date : ${entree1.date}")
    println("Texte : ${entree1.texte}")
    println("Humeur : ${entree1.humeur}")
    println("Photo : ${entree1.nomPhoto ?: "Aucune photo"}") // L'opérateur Elvis ?: fournit une valeur par défaut si nomPhoto est null

    println("\nDétails de l'entrée 2 :")
    println("Date : ${entree2.date}")
    println("Humeur : ${entree2.humeur}")
    if (entree2.nomPhoto != null) {
        println("Photo : ${entree2.nomPhoto}")
    } else {
        println("Photo : Aucune photo pour cette entrée.")
    }

    // 4. LES AVANTAGES FOURNIS PAR 'data class' (toString, equals, copy)

    // .toString() est généré automatiquement et donne une belle représentation textuelle
    println("\nAffichage direct de l'objet (grâce à toString() généré) :")
    println(entree1)
    // Résultat attendu : EntreeJournal(date=2025-05-21, texte=Aujourd'hui, j'ai appris..., humeur=Enthousiaste, nomPhoto=selfie_kotlin.jpg)

    // .equals() compare le contenu des objets, pas juste leurs références en mémoire
    val entree1CopieIdentique = EntreeJournal(
        date = "2025-05-21",
        texte = "Aujourd'hui, j'ai appris les data classes en Kotlin. C'est super intéressant !",
        humeur = "Enthousiaste",
        nomPhoto = "selfie_kotlin.jpg"
    )
    println("\nL'entrée 1 est-elle égale à sa copie identique ? ${entree1 == entree1CopieIdentique}") // Affiche true

    val entree3Differente = EntreeJournal("2025-05-21", "Texte différent", "Triste", null)
    println("L'entrée 1 est-elle égale à l'entrée 3 ? ${entree1 == entree3Differente}") // Affiche false

    // .copy() pour créer une nouvelle instance en modifiant certaines propriétés
    val entree1Modifiee = entree1.copy(humeur = "Très Heureux", texte = "J'ai vraiment tout compris !")
    println("\nEntrée 1 modifiée (nouvelle instance créée avec copy()) :")
    println(entree1Modifiee)
    println("L'entrée originale (entree1) n'a pas changé :")
    println(entree1)


    // 5. UTILISATION AVEC DES LISTES (ce qu'on a vu précédemment)
    // Maintenant, on peut créer une liste d'objets EntreeJournal !
    val monJournal: MutableList<EntreeJournal> = mutableListOf()

    monJournal.add(entree1)
    monJournal.add(entree2)
    monJournal.add(entree1Modifiee) // Ajoutons notre copie modifiée

    // On peut ajouter une nouvelle entrée directement
    monJournal.add(
        EntreeJournal(
            date = "2025-05-23",
            texte = "Préparation pour le weekend.",
            humeur = "Impatient",
            nomPhoto = "vue_fenetre.jpg"
        )
    )

    println("\n--- Mon Journal Complet ---")
    for (entree in monJournal) {
        println("Date: ${entree.date}, Humeur: ${entree.humeur}, Texte: ${entree.texte.take(30)}...") // .take(30) pour un aperçu du texte
    }
}

/*
Résumé des points clés sur les 'data class' :
1.  MOT-CLÉ 'data class NomDeLaClasse(propriété1: Type, ...)' :
    - Déclare une classe dont le but principal est de contenir des données.
    - Les propriétés sont définies dans le constructeur principal (entre parenthèses).
    - Il est recommandé d'utiliser 'val' pour les propriétés pour l'immutabilité.

2.  AVANTAGES AUTOMATIQUES : Kotlin génère pour vous :
    - `equals()` : Pour comparer le contenu de deux instances.
    - `hashCode()` : Important pour les collections comme les `HashMap` ou `HashSet`.
    - `toString()` : Pour une représentation textuelle lisible de l'objet.
    - `copy()` : Pour créer une copie d'un objet, en changeant éventuellement certaines propriétés.
    - `componentN()` : Fonctions pour la déstructuration (plus avancé).

3.  CRÉATION D'INSTANCES : `val monObjet = NomDeLaClasse(valeurProp1, valeurProp2, ...)`

4.  ACCÈS AUX PROPRIÉTÉS : `monObjet.nomDeLaPropriete`

5.  UTILISATION : Parfait pour modéliser des entités de données, comme des entrées de journal, des utilisateurs, des produits, etc.
    Très utile en combinaison avec les listes pour stocker plusieurs de ces objets structurés.
*/
