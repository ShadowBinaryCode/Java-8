package structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StructureDeDecision {

	public static void main(String[] args) {
		/*
		 * l'instuction if else
		 */
		int a = 2, b = 3;
		if(a == 2 && b == 4) {
			System.out.println("not good 1");
		} else if(a == 2 && b == 3) {
			System.out.println("good");
		} else {
			System.out.println("not good at all");
		}

		/* une seule ligne */
		String res = (5 > 2) ? "yes" : "no";
		System.out.println(res);

		/*
		 * switch of
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String reponse = "";
		try {
			System.out.println("Entrer une r�ponse : ");
			reponse = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		switch (reponse) {
		case "oui":
		case "OUI":
			System.out.println("La r�ponse est positive");
			break;
		case "non":
		case "NON":
			System.out.println("La r�ponse est n�gative");
			break;			
		default:
			System.out.println("mauvaise r�ponse");
			break;
		}		
	}
}