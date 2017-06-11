
public class LanceurTRI {

	public static void main(String[] args) {

		int[] tab = {15, 5 ,19, 2, 33};
		int[] tabResultatCroissant = TriParSelection.TriParSelectionCroissant(tab);
		for(int val : tabResultatCroissant) {
			System.out.print(val + "\t");
		}
		System.out.println();
		int[] tabResultatDecroissant = TriParSelection.TriParSelectionDecroissant(tab);
		for(int val : tabResultatDecroissant) {
			System.out.print(val + "\t");
		}
	}
}