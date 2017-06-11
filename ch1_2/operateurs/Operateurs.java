package operateurs;

public class Operateurs {

	/**
	 * 
	 * les op�rateurs bit � bit, sont des op�rateurs qui �ff�ctuent des op�rations
	 * que sur des entiers (&, |, ^, >>, <<)
	 * 
	 * les op�rateurs de comparaison (==, !=, >, <, >=, <=)
	 */
	/*
	 * on a 2 types d'op�rateurs : 
	 * 	Op�rateurs unaires : -, ++, --, !(n�gation) 
	 * 	Op�rateurs binaire
	 */
	public static void main(String[] args) {
		// op�rateur arithm�tique : +, -, /, *, %
		/*
		 * si la variable n'est pas utilis�e dans une expression, i++ et ++i conduisent au m�me resultat
		 */
		int i = 3, j = 3;
		System.out.println(i++);
		System.out.println(++j);
		int k = 3;
		k = k + 1; // op�rateur d'affectation
		k += 1;

		// instanceof
		String tst = "mehdi";
		if(tst instanceof String) {
			System.out.println("good !!");
		}
	}
}