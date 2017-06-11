package variables;

public class ValeursLitterales {

	public static void main(String[] args) {

		/* les valeurs num�riques entier peuvent �tre se pr�senter sous la forme d�cimal,
		 * octale, h�xadecimale ou binaire
		 */
		int i;
		i = 243; // d�cimale
		System.out.println(i);
		i = 0363; // octale
		System.out.println(i);
		i= 0xF3; // h�xad�cimale
		System.out.println(i);
		i = 0b11110011; // binaire
		System.out.println(i);

		/* les valeurs num�riques r�elles peuvent se pr�senter soit sous notation d�cimale
		 * ou la natotation scientifique
		 */
		float surface = 2356.8f; // notation d�cimale
		System.out.println(surface);
		surface = 2.3568e3f; // notation scientifique
		System.out.println(surface);

		/* on peut ins�rere des _ dans les valeurs lit�rales pour faciliter la lecture */
		int abs = 123456789;
		System.out.println(abs);
		abs = 123_456_789;
		System.out.println(abs);

		/* les valeurs num�riques entiers sont conci�deres par d�faut des int
		 * les valeurs num�riques r��lles sont conci�deres par d�faut des double
		 * */
		/* on rajoute le f � la fin de la valeur 25.65 pour dire qu'il s'agit bien d'un float,
		 * car, sans f, le compilateur pense qu'on essaye de stocker une valeur double dans
		 * une variable float 
		 */				
		float fls = 25.65f; 
	}
}