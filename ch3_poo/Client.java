
public class Client extends Personne {

	/*
	 * pour le type 
	 * P : Particulier
	 * E : Entreprise
	 * A : Administration
	 */
	private char type;

	public Client() {
		super();
		type = ' ';
	}

	public Client(String nom, String prenom, boolean retraite, char type) {
		super(nom, prenom, retraite);
		this.type = type;
	}

	public Client(Personne p, Client cl) {
		super(p);
		this.type = cl.type;
	}

	public char getType() {
		return this.type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public void affichage() {
		super.affichage();
		switch(this.type) {
		case 'P':
			System.out.println("il s'agit d'un client : Particulier");
			break;
		case 'E':
			System.out.println("il s'agit d'un client : Entreprise");
			break;
		case 'A':
			System.out.println("il s'agit d'un client : Administration");
			break;
		default:
			System.out.println("ya pas de type");
			break;
		}
	}
}