package interfaces;

/*
 * cette interface devra �tre impl�ment�e pour les classes pour lesquelles un classement
 * des instances est envisag�
 */
public interface Classable {

	public static final int INFERIEUR = -1;
	public static final int EGAL = 0;
	public static final int SUPERIEUR = 1;
	public static final int ERREUR = -99;

	/*
	 * cette m�thode pourra �tre appel�e pour comparer l'instance courante avec celle re�ue en parametre
	 * la m�thode retourne un entier dont la valeur d�pend des r�gles suivantes : 
	 * 
	 * 1 si l'instance courante est sup�rieur � celle re�ue en param�tre
	 * 0 si les 2 instances sont �gales
	 * -1 si l'instance courante est inf�rieur � celle re�ue en param�tre
	 * -99 si la comparaison est impossible
	 */
	int compare(Object o);
	
	default boolean isInferieur(Object o) {
		return false;
	}
	
	default boolean isSuperieur(Object o) {
		return false;
	}
}