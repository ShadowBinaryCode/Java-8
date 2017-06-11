package operateurs;

public class OpérateurLogique {

	public static void main(String[] args) {
		/**
		 * & (et logique) -> if(test1 & test2)
		 * | (ou logique) -> if(test1 | test2)
		 * 		exemple : if(test1 | test2) -> vrai si test1 ou test2 est vrai
		 * ^ (ou exclusif)
		 * 		exemple : if(test1 ^ test2) -> vrai si test1 ou test2 est vrai mais pas si les deux sont vrai simultanemment
		 * ! (négation)
		 * && (et logique) -> idem que & mais test2 ne sera évalué que si test1 est vrai
		 * || (ou logique) -> ide que | mais test2 ne sera évalué que si test1 est faux
		 */
		System.out.println(true & false);
		System.out.println(true | false);
		System.out.println(true ^ true);
		System.out.println(!true);
		System.out.println(true && false);
		System.out.println(false || true);
		
	}
}