package variables;

public class ConvertionDepuisUneChaineDeCaractere {

	public static void main(String[] args) {
		/**
		 * Une classe "wrapper" est une classe qui est utilis� pour emballer dans un objet un type de base (int, long, ect)
		 * 
		 * autoboxing : c un m�canisme qui permet l'affectation d'un type de base � une variable
		 * de type wrapper
		 * 
		 * unboxing : la convertion automatique d'un type wrapper vers un type de base
		 */

		/* autoboxing */
		Integer integ  = new Integer(10);
		Integer in = 10;

		/* unboxing */
		int x = integ;

		/* exemple : pour passer du Sting vers int */
		String tel = "0596587411";
		int telephoneInt = Integer.parseInt(tel);
		long telephoneLong = Long.parseLong(tel);
		System.out.println("Le num�ro de t�l�phone convertit en int " + telephoneInt);
		System.out.println("Le num�ro de t�l�phone convertit en long " + telephoneLong);
		
		/* chaine vers boolean */
		String valueS = "true";
		boolean test = Boolean.parseBoolean(valueS);
	}
}