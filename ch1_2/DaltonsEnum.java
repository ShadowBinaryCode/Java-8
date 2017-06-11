/**
 * 
 * L'�num�ration va nous permettre de d�finir un ensemble de constantes qui sont li�es entre elles
 *
 * en r�alit�, une enumeration est une classe qui peut contenir aussi des attibuts et des m�thodes
 * 
 * le constructeur d'une �num�ration doit �tre obligatoirement "private"
 * on utilise �galement le constreucteur pour initialiser les constantes de l'�num�ration
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