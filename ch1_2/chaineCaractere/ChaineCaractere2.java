package chaineCaractere;

public class ChaineCaractere2 {

	public static void main(String[] args) {
		/* formatage d'une chaine
		 * %n %d ect sont des motifs
		 */
		boolean b = true;
		int i = 56;
		double d = 19.6;
		String s = "chaine";
		System.out.println(String.format("boolean : %b %n" 
				+ "chaine de caractere : %s %n" 
				+ "entier : %d %n"
				+ "entier en hexadecimal : %x %n"
				+ "entier en octal : %o %n"
				+ "decimal : %f %n"
				+"decimal au format scientifique : %e %n", b,s,i,i,i,d,d));
	}
}