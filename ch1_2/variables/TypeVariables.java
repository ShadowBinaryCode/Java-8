package variables;

public class TypeVariables {

	public static void main(String[] args) {

		/* types numériques entier signés (on peut stocker des valeurs positives et négatives 
		 * byte : 8 bits
		 * short : 16 bits
		 * int : 32 bits
		 * long : 64 bits
		 * */
		byte num;
		short valeur;
		int compteur;
		long cpt;

		/* types numériques entier non signés (elle prend que les valeurs positives)
		 * Integer
		 * Long
		 */
		int distance = Integer.parseUnsignedInt("3000000000");
		System.out.println("Affichage en tant que int signés " + distance);
		System.out.println("Affichage en tant que int non signés " + Integer.toUnsignedString(distance));

		/* *********************************************************** */
		/* types décimaux, tout les décimaux sont signés
		 * float : 4 octecs
		 * double 8 octets
		 */
		float fl;
		double dbl;		

		/* types caractere : char
		 * \t :tabulation
		 * \b : BackSpace
		 * \n : Saut de Ligne
		 * \r : Retour Chariot
		 * \f : Saut de page
		 * \' : affiche '
		 * \" : affihe "
		 * \\ :  affiche \
		 */
		char lettre = 'a';
		System.out.println("Salut, je m\'appelle mehdi. \n \t \\");
		System.out.println("a \b aaa \r");
		System.out.println("exemple caractére unicode non accessible dans le clavier \u20AC");
		System.out.println("wwww");

		char charValParDefaut ='\u0000';
		System.out.println(charValParDefaut);

		/* chaine de caractere */
		String nomCapitaine = "Mehdi";
		System.out.println(nomCapitaine);				
	}
}