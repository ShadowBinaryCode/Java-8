package structures;

import java.util.ArrayList;

public class ForBoucleSpeciale {

	public static void main(String[] args) {
		/*
		 * for(type variable : tableau) permet de faire executer un bloc de code pour chaque
		 * élément contenu dans un tableau ou ----> dans une instance d'une classe qui
		 * implémente l'interface Iterable 
		 */
		String[] couleurs = {"Rouge", "Bleu", "Vert", "Jaune"};
		for(String couleur : couleurs) {
			System.out.println(couleur);
		}

		/* 
		 * exemple 2 : le code placé à l'intérieur de for ne doit pas modifier ou supprimer
		 * le contenu de la collection
		 * cet exemple lance une exception car on essaye de modifier la collection lors de 
		 * l'itération de la boucle
		 * donc l'exception <ConcurrentModificationException> se lance
		 */			
		ArrayList<String> clients = new ArrayList<String>();
		clients.add("Client 1");
		clients.add("Client 2");
		clients.add("Client 4");

		for(String client : clients) {
			System.out.println(client);
			if(client.endsWith("2")) {
				clients.add("Client 3");
			}
		}
	}
}