package tableaux;

import java.util.Arrays;

public class Tableau2 {

	public static void main(String[] args) {
		int[] notes = {58, 45, 12, 36, 97, 85};

		/* Copie un tableau entier avec la possibilté de modifier la taille du tableau */
		int[] notesCopie = Arrays.copyOf(notes, 10);
		System.out.println(Arrays.toString(notesCopie));

		/* copie une partie d'un tableau */
		int[] notesCopieRange = Arrays.copyOfRange(notes, 0, 2);
		System.out.println(Arrays.toString(notesCopieRange));

		/* pour remplier tout les cases d'un tableau avec la même valeur */
		int[] allFill = new int[10];
		Arrays.fill(allFill, 18);
		System.out.println(Arrays.toString(allFill));
	}
}