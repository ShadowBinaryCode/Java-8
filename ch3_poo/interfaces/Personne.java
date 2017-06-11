package interfaces;

public class Personne implements Classable {

	private String nom;

	public Personne() {
		super();
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

	/*
	 * on compare les personnes selon leurs noms 
	 */
	@Override
	public int compare(Object o) {
		if(o != null && o instanceof Personne) {
			Personne pers = (Personne) o;
			if(this.getNom().compareTo(pers.getNom()) < 0) {
				return Classable.INFERIEUR;
			} else if (this.getNom().compareTo(pers.getNom()) == 0) {
				return Classable.EGAL;
			} else {
				return Classable.SUPERIEUR;
			}
		}
		return Classable.ERREUR;
	}

	/*
	 * on tri tout les objets qui implemente l'interface Classable, en occurence la classe personne
	 * tri par ordre croissant
	 */
	public static Classable[] tri(Classable[] tableau) {
		for(int i = 0; i < tableau.length; i++) {
			for(int j = i + 1; j < tableau.length; j++) {
				if(tableau[i].compare(tableau[j]) == Classable.SUPERIEUR) {
					Classable cache = tableau[j];
					tableau[j] = tableau[i];
					tableau[i] = cache;
				} else if (tableau[j].compare(tableau[i]) == Classable.ERREUR) {
					return null;
				}
			}
		}
		return tableau;
	}
}