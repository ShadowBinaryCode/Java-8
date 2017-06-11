package tableaux;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tableaux {

	public static void main(String[] args) {
		// tableau à une seule dimension
		int[] notes = new int[5];
		notes[0] = 10;
		notes[1] = 12;
		notes[2] = 14;
		notes[3] = 16;
		notes[4] = 18;

		char[] caracteres = {'a', 'b', 'c', 'd'};
		System.out.println("Monsieur " + caracteres[2] + " a eu la note " + notes[4]);

		// tableau avec plusieurs dimension
		int[][] multiples = new int[2][2];
		multiples[1][0] = 20;

		int tst[][] = {{12,15,14}, {85,99,88}, {57,89,63}};
		System.out.println(tst[2][1]);
		System.out.println("Le tableau comporte " + tst.length + " et chaque ligne contient " + tst[0].length + " cases.");

		/* binarySearch	est une fonction qui permet de faire une recherche dans un tableau
		 * mais avant d'utiliser cette fonction, il faut d'abord trier le tableau
		 * elle retourne le numéro de la case dans lequel se trouve la valeur recherché
		 *  */
		int[] ages = {58, 87, 55, 120, 12, 18, 26};
		Arrays.sort(ages);
		String triChaine = "";
		for(int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}		
		System.out.println("\n");

		System.out.println(Arrays.toString(ages));

		int indice = Arrays.binarySearch(ages, 87); // si la valeur est negatif, donc, le nombre n'existe pas dans le tableau
		System.out.println("La valeur " + 87 + " se trouve dans l'indice " + indice);

		/* ********************************* */
		int[][] doubleDimension = {{54, 48, 12}, {120, 42, 350}, {16, 17, 1}};
		System.out.println(Arrays.deepToString(doubleDimension));
	}
}