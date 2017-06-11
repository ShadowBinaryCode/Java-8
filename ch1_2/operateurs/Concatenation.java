package operateurs;

public class Concatenation {

	public static void main(String[] args) {
		/*
		 * Si on a plusieurs concatenation à faire sur une chaine, c'est mieux d'utiliser 
		 * l'object StringBuffer
		 */
		String nom = "Ghetta", welcome = "Hello", mister="mister";
		StringBuffer bf = new StringBuffer();
		bf.append(welcome);
		bf.append(" ");
		bf.append(mister);
		bf.append(" ");
		bf.append(nom);		
		System.out.println(bf.toString());
	}
}