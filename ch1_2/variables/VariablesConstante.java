package variables;

public class VariablesConstante {

	/**
	 * final : la variable est constante et ne change pas de valeur
	 */
	public static final double TVA = 2.15;
	final double TAUX_ACQUISITION  = TVA * 2;

	public static void main(String[] args) {
		double vr = new VariablesConstante().TAUX_ACQUISITION;
	}
}