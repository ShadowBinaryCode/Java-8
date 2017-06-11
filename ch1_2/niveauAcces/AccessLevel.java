package niveauAcces;

public class AccessLevel {

	/**
	 * private : la variable est utilisable uniquement dans la classe dans lequel elle est declaré
	 * 
	 *protected : la variable est utilisable dans la classe dans lequel elle est declaré, dans les 
	 * sous classes, et dans les classes qui font partie de même package
	 * 
	 * public : la variable est accessible partout indépendament du package
	 * 
	 * sans modificateur : la variable est accessible partout dans les classes du même package
	 */
	private int nbr;
	protected int pr;
	public int vr;
	int aucun;	

	public AccessLevel() {
		nbr = 10;
		pr = 100;
		aucun = 850;
	}
}