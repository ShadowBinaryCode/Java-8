package classes_anonymes;

public class Personne {

	private String nom;
	private int age;

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