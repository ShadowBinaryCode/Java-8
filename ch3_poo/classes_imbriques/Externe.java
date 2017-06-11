package classes_imbriques;

public class Externe {

	static double taux = 1.92;
	static class interne {
		public double calculTTC(double prix) {
			return prix * taux;
		}
	}
}