JAVA 8 : Les fondamentaux du langage JAVA avec exercices pratiques et corrig�s

ENI Editions

/* ****************************************************** */
chapitre 1 : Pr�sentation

chapitre 2 : Bases du langage

chapitre 3 : Programmation Objet
	classe : d�finit la structure g�n�rale
	objet : est une instance r�el d'une classe
	une classe contient des attributs (caract�ristiques) et des m�thodes(actions)
	
- encapsulation : c'est le faite de cacher les elements qui ne sont pas n�cessaire pour l'utilisation
d'un objets

- h�ritage : classes d�riv�es heritent les caract�ristiques des classes de bases, et on peut 
bien ajouter d'autres caract�ristiques et fontionnalit�s

- polymorphisme : grace � ce principe, on peut utiliser plusieurs classes de mani�re
interchangeable m�me si le fonctionnement interne de ses classes est diff�rents.
si vous savez changer la vitesse dans une voiture peugeot, vous savez aussi comment l'utiliser 
dans une voiture renault, malgr� que la boite � vitesse dans renault et peugeot sont diff�rents.

2 autres concepts sont li�es au polymorphisme : 
		- surcharge
		- masquage des m�thodes (red�finition)

toutes les classes de java h�ritent de la classe <Object>

--> la visibilt� des classes : 
- public : la classe est utilis� par les autres classes dans toutes l'aplication
- aucun modificateur : la classe est utilis� juste par les classes qui font partie du m�me package
- abstract : la classe ne peut pas �tre instanci�, et elle est utilis� juste que comme classe
de base pour une relation d'h�ritage
- final : la classe peut �tre uniquement instanci�, et on peut pas l'utilis� comme classe
de base dans une relation d'h�ritage

--> la visibilt� des attributs : 
- public : la variable est accessible depuis n'importe ou
- private : la variable est accessible juste dans la classe dans laquelle elle est declar�e
- protected : la variable est assesible dans la classe dans laquelle elle est declar�e, dans
les classes derriv�es et dans les classes faisant partie du m�me package
- aucun modificateur : la variable est accessible depuis les classes faisant partie du m�me package
et dans la classe elle m�me

--> la visibilt� des m�thodes : 
- public, private protected (comme les attributs)
- static : il s'agit d'une m�thode de classe
- abstract : la m�thode est abstaite, elle contient pas de code, juste la signature, cette m�thode
doit se trouver dans une classe abstraite.
- final : indique que la m�thode ne peut pas �tre substitu� dans une classe d�riv�e
- native : indique que le code de la m�thode existe dans un fichier externe avec une autre langage
- syncronized : indique que la m�thode ne peut pas �tre ex�cut�e que par un seul thread � la fois
										
---> Passage des param�tres dans une m�thode : par valeur ou par r�f�rence
- par valeur (par copie) : si le param�tre est un type primitif (short, int, long ...)
- par r�f�rence : si le param�tre est un type objet

- pour respecter le principe de l'encapsulation, on rend les attributs de la classe private 								

- le role d'un constructeur est principalement l'initialisation des champs d'une instance de la classe, il
appelle le constructeur de la classe mere implicitement (la classe objet)

- On peut avoir un seul destructeur par classe, il n'est pas surchargeable, il s'execute
implicitement lors de la destruction d'une instance d'une classe

- les membres statiques (champs ou m�thodes) sont des membres de classe, on les utilises
quond on a des informations qui ne sont pas sp�cifique � une seule instance, mais � toute
les instances de la classe.
dans certaines langages, on les appellent "des membres partag�s".
ces membres sont des variables globales dans une application

- les m�thodes statiques servent � cr�er des biblioth�ques de fonctions. comme par exemple
la classe Math qui contient plusieurs m�thodes statiques.

la limitation de ces m�thodes statiques c'est qu'elles ne peuvent utilis� que des variables
locals ou d'autres membres statiques.
je peux utiliser une variable non static dans une m�thode static

-  les annotations sont utilis�s pour ajouter des informations suppl�mentaires soit � la classe,
� un attribut ou � une m�thode
les annotations n'ont aucun effet sur le fonctionnement du code, mais il permettent de modifier
le compotement du compilateur au moment de la compilation
les annotations ne changent pas le resutat de la compilation, mais elles ajoutent des
informations suppl�mentaires au code compil�

exemple : @Deprecated, @Override 
@suppressWarnings : indique au compilateur de ne pas g�n�rer un certains types d'avertissements

- le bloc static { } dans une classe permet d'initialiser les variables statiques, le bloc peut apparaitre 
n'importe ou dans la classe, ce bloc va etre execut�e au chargement de la classe par la JVM.

- Destruction d'une instance
heureusement que java g�re �a automatiquement par le bias de la "ramasse miette (garbage collector)"

si un objet est stock� dans un tableau ou dans une collection, le tableau ou la collection
garde toujours une r�f�rence vers l'objet



