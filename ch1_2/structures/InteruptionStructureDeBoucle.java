package structures;

public class InteruptionStructureDeBoucle {

	public static void main(String[] args) {

		/*
		 * return : est utilis�e pour sortir im�diatement de la m�thode en cours d'�x�cution,
		 * si return est d�plac� dans une structure de boucle(for, ect), provoque la sortie
		 * im�diate de la boucle et de la fonction en cours d'�xc�cution
		 */

		/*
		 * ici, return se trouve dans la m�thode tester(),
		 * donc elle provoque la sortie de la m�thode tester mais pas main
		 * elle provoque la sortie de la m�thode sur laquelle elle se trouve
		 */
		tester();
		/*
		 * Exemple de break
		 */
		int[][] notes = {{15, 25}, {0, 17}, {99, 33}};
		boolean trouve = false;
		recherche:
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 2; j++) {
					System.out.print(notes[i][j] + "\t");
					if(notes[i][j] == 0) {
						trouve = true;
						break recherche;
					}
				}
				System.out.println();
			}
		if(trouve) {
			System.out.println("\nrecherche infructueuse");
		}

		/*
		 * Exemple de continue		 
		 */
		int[][] numbers = {{1,2}, {3,4}, {5,6}, {7,8}};
		continuer:
			for(int k = 0; k < 4; k++) {
				for(int l = 0; l < 2; l++) {				
					if(numbers[k][l] == 5) {
						continue continuer;
					}
					System.out.print(numbers[k][l] + "\t");
				}
				System.out.println();
			}

		/*
		 * exemple de return		 
		 */
	}

	public static void tester() {
		return;
	}
}