/**
 * 
 * L'énumération va nous permettre de définir un ensemble de constantes qui sont liées entre elles
 *
 * en réalité, une enumeration est une classe qui peut contenir aussi des attibuts et des méthodes
 * 
 * le constructeur d'une énumération doit être obligatoirement "private"
 * on utilise également le constreucteur pour initialiser les constantes de l'énumération
 */

public enum DaltonsEnum {
	JOE (2.42, 52),
	WILLIAM (1.69, 85),
	JACK (3.59, 45);

	private final double taille;
	private final double poids;

	private DaltonsEnum(double taille, int poids) {
		this.taille = taille;
		this.poids = poids;
	}

	public double taille() { return this.taille; }
	public double poids() { return this.poids; }

	double imc() {
		return poids / (taille + taille);
	}
}