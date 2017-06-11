package lambda2;

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