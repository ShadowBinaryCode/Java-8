
public class Personne {

	/*
	 * pour initialiser les champs de classe, on utilise le bloc static
	 * pour initialiser les champs d'instance, on utilise le constructeur par défaut
	 */
	static {
		nombreDesInstances = 0;
	}

	/*
	 * champ statique 
	 */
	private static int nombreDesInstances;

	/*
	 * Attributs
	 */
	private String nom;
	private String prenom;
	private boolean retraite;
	private int numeroInstance;

	/*
	 * Constructeur par défaut
	 */
	public Personne() {
		nom = "";
		prenom = "";
		retraite = false;
		nombreDesInstances++;
		numeroInstance = nombreDesInstances;
	}

	/*
	 * constructeur par affectation
	 */
	public Personne(String nom, String prenom, boolean retraite) {
		this.nom = nom;
		this.prenom = prenom;
		this.retraite = retraite;
	}

	/*
	 * Constructeur par copie
	 */
	public Personne(Personne personne) {
		this.nom = personne.nom;
		this.prenom = personne.prenom;
		this.retraite = personne.retraite;
	}

	/*
	 * Destructeur 
	 */
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		// on peut fermer par exemple un fichier ouvert
		// on peut fermer la connexion vers une base de données
	}

	/*
	 * Getters et Setters
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom.toUpperCase(); 
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom.toLowerCase(); 
	}

	public boolean isRetraite() {
		return retraite;
	}

	public void setRetraite(boolean retraite) {
		this.retraite = retraite;
	}

	public int getNumero() {
		return numeroInstance;
	}

	public static int getNombreDesInstances() {
		return nombreDesInstances;
	}

	/*
	 * Méthodes
	 */
	@Deprecated
	public void affichage() {
		System.out.println("Nom : " + nom);
		System.out.println("Prénom " + prenom);
		System.out.println("retraité(e) : " + retraite);
	}

	// surcharge de méthode	
	public void affichage(boolean francais) {
		if(francais) {
			affichage();
		} else {
			System.out.println("Last Name : " + nom);
			System.out.println("First Name : " + prenom);
			System.out.println("retired : " + retraite);
		}
	}

	// méthode attend un nombre quelquonque de paramètre
	public void affichage(String...couleurs) {
		if(couleurs == null) {
			System.out.println("Ya pas de couleurs");
			return;
		}
		switch(couleurs.length) {
		case 1:
			System.out.println("Un couleur");
			break;
		case 2: 
			System.out.println("deux couleurs");
			break;
		default:
			System.out.println("trois couleurs ou plus");
			break;
		}
	}
}