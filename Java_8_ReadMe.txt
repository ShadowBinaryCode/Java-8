JAVA 8 : Les fondamentaux du langage JAVA avec exercices pratiques et corrigés

ENI Editions

/* ****************************************************** */
chapitre 1 : Présentation

chapitre 2 : Bases du langage

chapitre 3 : Programmation Objet
	classe : définit la structure générale
	objet : est une instance réel d'une classe
	une classe contient des attributs (caractéristiques) et des méthodes(actions)
	
- encapsulation : c'est le faite de cacher les elements qui ne sont pas nécessaire pour l'utilisation
d'un objets

- héritage : classes dérivées heritent les caractéristiques des classes de bases, et on peut 
bien ajouter d'autres caractéristiques et fontionnalités

- polymorphisme : grace à ce principe, on peut utiliser plusieurs classes de manière
interchangeable même si le fonctionnement interne de ses classes est différents.
si vous savez changer la vitesse dans une voiture peugeot, vous savez aussi comment l'utiliser 
dans une voiture renault, malgré que la boite à vitesse dans renault et peugeot sont différents.

2 autres concepts sont liées au polymorphisme : 
		- surcharge
		- masquage des méthodes (redéfinition)

toutes les classes de java héritent de la classe <Object>

--> la visibilté des classes : 
- public : la classe est utilisé par les autres classes dans toutes l'aplication
- aucun modificateur : la classe est utilisé juste par les classes qui font partie du même package
- abstract : la classe ne peut pas être instancié, et elle est utilisé juste que comme classe
de base pour une relation d'héritage
- final : la classe peut être uniquement instancié, et on peut pas l'utilisé comme classe
de base dans une relation d'héritage

--> la visibilté des attributs : 
- public : la variable est accessible depuis n'importe ou
- private : la variable est accessible juste dans la classe dans laquelle elle est declarée
- protected : la variable est assesible dans la classe dans laquelle elle est declarée, dans
les classes derrivées et dans les classes faisant partie du même package
- aucun modificateur : la variable est accessible depuis les classes faisant partie du même package
et dans la classe elle même

--> la visibilté des méthodes : 
- public, private protected (comme les attributs)
- static : il s'agit d'une méthode de classe
- abstract : la méthode est abstaite, elle contient pas de code, juste la signature, cette méthode
doit se trouver dans une classe abstraite.
- final : indique que la méthode ne peut pas être substitué dans une classe dérivée
- native : indique que le code de la méthode existe dans un fichier externe avec une autre langage
- syncronized : indique que la méthode ne peut pas être exécutée que par un seul thread à la fois
										
---> Passage des paramètres dans une méthode : par valeur ou par référence
- par valeur (par copie) : si le paramètre est un type primitif (short, int, long ...)
- par référence : si le paramètre est un type objet

- pour respecter le principe de l'encapsulation, on rend les attributs de la classe private 								

- le role d'un constructeur est principalement l'initialisation des champs d'une instance de la classe, il
appelle le constructeur de la classe mere implicitement (la classe objet)

- On peut avoir un seul destructeur par classe, il n'est pas surchargeable, il s'execute
implicitement lors de la destruction d'une instance d'une classe

- les membres statiques (champs ou méthodes) sont des membres de classe, on les utilises
quond on a des informations qui ne sont pas spécifique à une seule instance, mais à toute
les instances de la classe.
dans certaines langages, on les appellent "des membres partagés".
ces membres sont des variables globales dans une application

- les méthodes statiques servent à créer des bibliothéques de fonctions. comme par exemple
la classe Math qui contient plusieurs méthodes statiques.

la limitation de ces méthodes statiques c'est qu'elles ne peuvent utilisé que des variables
locals ou d'autres membres statiques.
je peux utiliser une variable non static dans une méthode static

-  les annotations sont utilisés pour ajouter des informations supplémentaires soit à la classe,
à un attribut ou à une méthode
les annotations n'ont aucun effet sur le fonctionnement du code, mais il permettent de modifier
le compotement du compilateur au moment de la compilation
les annotations ne changent pas le resutat de la compilation, mais elles ajoutent des
informations supplémentaires au code compilé

exemple : @Deprecated, @Override 
@suppressWarnings : indique au compilateur de ne pas générer un certains types d'avertissements

- le bloc static { } dans une classe permet d'initialiser les variables statiques, le bloc peut apparaitre 
n'importe ou dans la classe, ce bloc va etre executée au chargement de la classe par la JVM.

- Destruction d'une instance
heureusement que java gére ça automatiquement par le bias de la "ramasse miette (garbage collector)"

si un objet est stocké dans un tableau ou dans une collection, le tableau ou la collection
garde toujours une référence vers l'objet



