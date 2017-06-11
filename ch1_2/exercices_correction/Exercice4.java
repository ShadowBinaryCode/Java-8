package exercices_correction;

import java.time.Duration;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.util.Scanner;

public class Exercice4 {
	public static void main(String[] args) {		

		OffsetTime debut, fin;
		Duration temps;
		int compteur = 0;
		int nbrAleatoire, nbrUser;
		nbrAleatoire = (int) (Math.random() * 1000);
		System.out.println("nombre aléatoire : " + nbrAleatoire);
		Scanner sc = new Scanner(System.in);
		debut = OffsetTime.now();
		System.out.println("debut ==> " + debut);
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
		sc.close();
		fin = OffsetTime.now();
		System.out.println("fin ==> " + fin);
		temps = Duration.between(debut, fin);
		LocalTime duree;
		duree = LocalTime.ofSecondOfDay(temps.getSeconds());
		System.out.println("Le nombre d'essai est " + compteur + " dans " + duree.getHour() +" heure(s)"
				+ duree.getMinute() + " minutes et " + duree.getSecond() + " second(s)");
	}
}