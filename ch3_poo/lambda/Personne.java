package lambda;

import java.util.function.Predicate;

public class Personne {

	private String nom;
	private int age;

	public static Personne recherche(Object[] o, ComparateurPersonne comparateur) {
		if(o != null && o instanceof Personne[]) {
			Personne[] personnes = (Personne[]) o;
			for(Personne p : personnes) {
				if(comparateur.isIdentique(p)) {
					return p;
				}
			}
		}
		return null;
	}

	/*
	 * la recherche avec l'interface Predicate du package Java.util.function
	 */
	public static Personne recherchePersonnePr(Personne[] tablo, Predicate<Personne> pr) {
		for(Personne p : tablo) {
			if(pr.test(p)) {
				return p;
			}			
		}
		return null;
	}

	public Personne() {
		super();
	}

	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	public Personne(int age) {
		this.age = age;
	}

	public Personne(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}