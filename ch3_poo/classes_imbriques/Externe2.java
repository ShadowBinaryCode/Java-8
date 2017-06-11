package classes_imbriques;

public class Externe2 {

	double taux = 1.96;
	class Interne {
		public double calculerTTC(double prix) {
			return prix * taux;
		}
	}
}