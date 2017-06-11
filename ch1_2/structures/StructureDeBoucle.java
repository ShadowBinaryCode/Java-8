package structures;

public class StructureDeBoucle {

	public static void main(String[] args) {
		/*
		 * while
		 */
		int i = 1;
		while(i <= 10) {
			System.out.println("====> " + i);
			i++;
		}

		/*
		 * do while
		 */
		int j = 1;
		do {
			System.out.println("j == " + j);
			j++;
		} while(j <= 10);

		/*
		 * for
		 */
		for(int k = 1; k < 10; k++) {
			for(int l = 1; l < 10; l++) {
				System.out.print(k * l + "\t");
			}
			System.out.println();
		}

		System.out.println("\n\n");
		// autre exemple
		for(int m = 0; m < 10; m++) {
			for(int n = 0; n <= m; n++) {
				System.out.print("* \t");
			}
			System.out.println();
		}

		System.out.println("\n\n");
		// autre exemple
		/*
		int ligne = 8, colonne = 8;		
		for(int o = 0; o < ligne; o++) {
			for(int p = 0; p < colonne; p++) {
				if(o == 0 || o == ligne - 1) {					
					if(p < colonne - 1) {
						System.out.print("*\t");
					} else {
						System.out.print("*");
					}
				} else {					
					if(p == 0 || p == colonne - 1) {
						String tab = "";
						int cpt = 1;
						while(cpt >=1 && cpt < colonne ) {
							tab += "\t";
							cpt++;
						}
						System.out.print("*" + tab);
					}
				}
			}
			System.out.println();
		} */
		int ligne = 12, colonne = 10;
		/* ****************** */
		/* calculer le nombre de tabulation possible si on est dans la 1ere
		 * et la dernière ligne
		 */
		String tab = "";
		int cpt = 1;
		while(cpt >=1 && cpt < colonne ) {
			tab += "\t";
			cpt++;
		}
		/* ****************** */
		for(int o = 0; o < ligne; o++) {			
			for(int p = 0; p < colonne; p++) {
				if(o == 0 || o == ligne - 1) {					
					if(p < colonne - 1) {
						System.out.print("*\t");
					} else {
						System.out.print("*");
					}
				} else {					
					if(p == 0) {						
						System.out.print("*");
					} else if(p == colonne - 1) {
						System.out.print(tab + "*");
					}
				}
			}
			System.out.println();
		}
	}
}