package classes_imbriques;

public class Lanceur {

	public static void main(String[] args) {
		/*
		 * classe imbriquée
		 */
		Externe.interne cl = new Externe.interne();
		System.out.println(cl.calculTTC(100));

		/*
		 * Classe interne
		 */
		Externe2 e = new Externe2();
		Externe2.Interne in = e.new Interne();
		System.out.println(in.calculerTTC(100));
	}
}