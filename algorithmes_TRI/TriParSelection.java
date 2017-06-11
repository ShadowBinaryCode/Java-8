
public class TriParSelection {

	/*
	 * Tri par Selection : ordre croissant
	 */
	public static int[] TriParSelectionCroissant(int[] tab) {
		for(int i = 0; i < tab.length; i++) {
			for(int j = i + 1; j < tab.length; j++) {
				if(tab[i] > tab[j]) {
					int cache = tab[j];
					tab[j] = tab[i];
					tab[i] = cache;
				}
			}
		}
		return tab;
	}

	/*
	 * Tri par Selection : ordre decroissant
	 */
	public static int[] TriParSelectionDecroissant(int[] tab) {
		for(int i = 0; i < tab.length; i++) {
			for(int j = i + 1; j < tab.length; j++) {
				if(tab[i] < tab[j]) {
					int cache = tab[j];
					tab[j] = tab[i];
					tab[i] = cache;
				}
			}
		}	
		return tab;
	}		
}