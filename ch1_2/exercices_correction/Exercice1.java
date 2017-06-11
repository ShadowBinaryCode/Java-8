package exercices_correction;

public class Exercice1 {

	public static void main(String[] args) {
		String[] fournisseurs = {
				"david.ghueta@gmail.com", 
				"bill.gates@hotmail.com", 
		"steve.jobs@gmail.com"};		
		for(String fournisseur : fournisseurs) {
			String first = getFournisseur(fournisseur);
			int cpt = 0;
			for(String fr : fournisseurs) {
				String second = getFournisseur(fr);
				if(first.equals(second)) {
					cpt++;
				}				
			}
			System.out.println("La part du " + first + " est " + cpt);
		}
	}

	public static String getFournisseur(String fournisseur) {
		int positionArobaske = fournisseur.indexOf("@") + 1;
		int tailleMailFournisseur = fournisseur.length();		
		return fournisseur.substring(positionArobaske, tailleMailFournisseur);
	}
}