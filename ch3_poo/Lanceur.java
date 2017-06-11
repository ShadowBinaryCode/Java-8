public class Lanceur {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Personne mehdi = new Personne();
		System.out.println("L'instance numero " + mehdi.getNumero());
		mehdi.affichage();
		mehdi.affichage(false);
		mehdi.affichage(null);
		mehdi.affichage("rouge");
		mehdi.affichage("Bleu", "Vert");

		mehdi.setNom("fahim");
		mehdi.setPrenom("meHdI");
		mehdi.setRetraite(false);		
		mehdi.affichage();

		Personne p1 = new Personne();
		System.out.println("L'instance numero " + p1.getNumero());
		Personne p2 = new Personne();
		System.out.println("L'instance numero " + p2.getNumero());

		System.out.println("Le nombre totals des instances est " + Personne.getNombreDesInstances());

		/* ************************ */
		Client cl = new Client();
		cl.setNom("Ghetta");
		cl.setPrenom("David");
		cl.setRetraite(true);
		cl.setType('P');
		cl.affichage();

		/*
		 * 
		 */
		Personne pers = new Personne("Gates", "Bill", true);
		Client cls = new Client(pers.getNom(), pers.getPrenom(), pers.isRetraite(), 'E');
		cls.affichage();
	}
}