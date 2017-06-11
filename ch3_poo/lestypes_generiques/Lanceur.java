package lestypes_generiques;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lanceur {

	static ListeGenerique<String> listeString = new ListeGenerique<>(5);
	public static void main(String[] args) throws Exception {
		listeString.ajout("premier");
		listeString.ajout("deuxi�me");
		listeString.ajout("troisi�me");
		listeString.ajout("quatri�me");
		listeString.ajout("cinqui�me");
		menu();

		/*
		 * test du type g�n�rique listeGenerique avec l'objet personne comme type d'argument
		 */
	}

	public static void menu() {
		char choix = '\0';		
		while(choix != 'f') {
			try {
				System.out.println("p (premier) < (pr�c�dent) > (suivant) d (dernier) f (fin)");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Entrer un choix : ");
				choix = br.readLine().charAt(0);
				switch(choix) {
				case 'p': System.out.println("Le premier : " + listeString.premier());
				break;
				case '<': System.out.println("Pr�c�dent : " + listeString.precedent());
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