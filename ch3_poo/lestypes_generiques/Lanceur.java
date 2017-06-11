package lestypes_generiques;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lanceur {

	static ListeGenerique<String> listeString = new ListeGenerique<>(5);
	public static void main(String[] args) throws Exception {
		listeString.ajout("premier");
		listeString.ajout("deuxième");
		listeString.ajout("troisième");
		listeString.ajout("quatrième");
		listeString.ajout("cinquième");
		menu();

		/*
		 * test du type générique listeGenerique avec l'objet personne comme type d'argument
		 */
	}

	public static void menu() {
		char choix = '\0';		
		while(choix != 'f') {
			try {
				System.out.println("p (premier) < (précédent) > (suivant) d (dernier) f (fin)");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Entrer un choix : ");
				choix = br.readLine().charAt(0);
				switch(choix) {
				case 'p': System.out.println("Le premier : " + listeString.premier());
				break;
				case '<': System.out.println("Précédent : " + listeString.precedent());
				break;
				case '>': System.out.println("Suivant : " + listeString.suivant());
				break;
				case 'd': System.out.println("Dernier : " + listeString.dernier());
				break;					
				} 
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}			
		}
		System.out.println("Sortie de programme");
	}
}