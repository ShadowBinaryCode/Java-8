package operateurs;

public class Operateurs {

	/**
	 * 
	 * les opérateurs bit à bit, sont des opérateurs qui éfféctuent des opérations
	 * que sur des entiers (&, |, ^, >>, <<)
	 * 
	 * les opérateurs de comparaison (==, !=, >, <, >=, <=)
	 */
	/*
	 * on a 2 types d'opérateurs : 
	 * 	Opérateurs unaires : -, ++, --, !(négation) 
	 * 	Opérateurs binaire
	 */
	public static void main(String[] args) {
		// opérateur arithmétique : +, -, /, *, %
		/*
		 * si la variable n'est pas utilisée dans une expression, i++ et ++i conduisent au même resultat
		 */
		int i = 3, j = 3;
		System.out.println(i++);
		System.out.println(++j);
		int k = 3;
		k = k + 1; // opérateur d'affectation
		k += 1;

		// instanceof
		String tst = "mehdi";
		if(tst instanceof String) {
			System.out.println("good !!");
		}
	}
}