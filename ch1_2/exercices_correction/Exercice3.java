package exercices_correction;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {		

		int compteur = 0;
		int nbrAleatoire, nbrUser;
		nbrAleatoire = (int) (Math.random() * 1000);
		System.out.println("nombre aléatoire : " + nbrAleatoire);
		Scanner sc = new Scanner(System.in);
		do {			
			System.out.print("Entrer un nombre : ");
			nbrUser = sc.nextInt();
			compteur++;
			if(nbrUser > nbrAleatoire) {
				System.out.println("C'est plus !!");
			} else if (nbrUser < nbrAleatoire) {
				System.out.println("C'est moins");
			}
		} while(nbrAleatoire != nbrUser);
		System.out.println("Le nombre d'essai est " + compteur);
	}
}