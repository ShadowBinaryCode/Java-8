package exercices_correction;

import java.util.Random;

public class Exercice2 {

	public static void main(String[] args) {
		/*
		 * Solution 1 : par mehdi
		 */
		System.out.println("********************** Solution 1 **********************");
		int nbrEssai = 0;
		Random r = new Random();
		int valeur1 = 0, valeur2 = 0, valeur3 = 0;
		do {			
			valeur1 = 1 + r.nextInt(1000);	
			valeur2 = 1 + r.nextInt(1000);
			valeur3 = 1 + r.nextInt(1000);
			System.out.println(valeur1 + " , " + valeur2 + " , " + valeur3);
			if((valeur1 % 2 == 0) && (valeur2 % 2 == 0) && (valeur3 % 2 != 0)){
				nbrEssai += 1;
				break;
			} else 
			{
				nbrEssai += 1;
			}
		} while((valeur1 % 2 != 0) || (valeur2 % 2 != 0) || (valeur3 % 2 == 0));		
		System.out.println("le nombre d'essai est " + nbrEssai);

		/*
		 * Solution 2 : livre
		 */
		System.out.println("********************** Solution 2 **********************");
		int compteur = 0;
		int nb1, nb2, nb3;
		do {
			nb1 = (int) (Math.random() * 1000);
			nb2 = (int) (Math.random() * 1000);
			nb3 = (int) (Math.random() * 1000);
			compteur++;
			System.out.println(nb1 + " , " + nb2 + " , " + nb3);
		} while(nb1 % 2 ==1 || nb2 % 2 == 1 || nb3 % 2 == 0);
		System.out.println("Le nombtre d'essai est " + compteur);
	}
}