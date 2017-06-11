package lestypes_generiques;

import java.util.ArrayList;

/*
 * ici on a le type génériques "ListeGenerique", un type générique peut être une classe, une interface ou une fonction
 * le type de parametre c'est "T"
 * le type d'argument c'est le type de données qui remplace le type de parametre lors de l'utilisatio du type générique
 * les contraintes ce sont les ti que vous imposez pour limiter le type d'argument à utiliser
 * type construit c'est la classe, l'interface ou la fontion qu'on construit à partir de la spécification d'un argument
 */

/*
 * exemple d'une lasse générique
 */
public class ListeGenerique<T>
{
	// pour stocker les elements de la liste
	private ArrayList<T> liste;
	// pointeur de position dans la liste
	private int position;
	// nombre d'elements de la liste
	private int nbElements;

	// constructeur avec un parametre permettant de dimensionner la liste
	public ListeGenerique(int taille) {
		liste = new ArrayList<T>(taille);
	}

	public void ajout(T element) {
		liste.add(element);
		nbElements++;
	}

	public void insert(T element, int index) {
		// on vérifie si l'index n'est pas supérieur au nombre d'elements de la liste ou s'il est inférieur à 0
		if(index >= nbElements || index < 0) {
			return;
		}
		liste.add(index, element);
		// on met à jour le nombre d'élement
		nbElements++;
	}

	public void remplace(T element, int index) {
		// on vérifie si l'index n'est pas supérieur au nombre d'elements de la liste ou s'il est inférieur à 0
		if(index >= nbElements || index < 0) {
			return;
		}
		liste.set(index, element);
	}

	public void supprime(int index) {
		// on vérifie si l'index n'est pas supérieur au nombre d'elements de la liste ou s'il est inférieur à 0
		if(index >= nbElements || index < 0) {
			return;
		}
		liste.remove(index);
		nbElements--;
	}

	public T getElement(int i) {
		return liste.get(i);
	}

	public int getNbElements() {
		return nbElements;
	}

	public T premier() throws Exception {
		if(nbElements == 0) {
			throw new Exception("liste vide");
		}
		// on déplace le pointeur sur le premier element
		position = 0;
		return liste.get(0);
	}

	public T dernier() throws Exception {
		if(nbElements == 0) {
			throw new Exception("liste vide");
		}
		// on déplace le pointeur sur le dernier element
		position = nbElements - 1;
		return liste.get(position);
	}

	public T suivant() throws Exception {
		if(nbElements == 0) {
			throw new Exception("liste vide");
		}
		// on vérifie si on n'est pas à la fin de la liste
		if(position == nbElements -1) {
			throw new Exception("Pas d'element suivant");
		}
		// on déplace le pointeur sur l'element suivant
		position = position + 1;
		return liste.get(position);
	}

	public T precedent() throws Exception {
		if(nbElements == 0) {
			throw new Exception("liste vide");
		}
		// on vérifie si on n'est pas au début de la liste
		if(position == 0) {
			throw new Exception("Pas d'element precedent");
		}
		// on déplace le pointeur sur l'element precedent
		position = position - 1;
		return liste.get(position);
	}
}