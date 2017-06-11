package variables;

public class ConvertionVersChaineCaractere {

	public static void main(String[] args) {
		/*
		 * pour faire la convertion vers une chaine de caractere, on a 2 possibilités : 
		 * 		- soit implicitement
		 * 		- soit explicitement à travers la mathode valueOf de la classe String
		 */
		double prix;
		prix = 2.5;
		String resultat = "le prix final est " + prix * 2; // implicitement
		String resultatImplicit = "le prix final est " + String.valueOf(prix * 2); // explicitement
		System.out.println("implicitement " + resultat + ", explicitement : " + resultatImplicit);
	}
}