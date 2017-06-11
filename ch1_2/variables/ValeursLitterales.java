package variables;

public class ValeursLitterales {

	public static void main(String[] args) {

		/* les valeurs numériques entier peuvent être se présenter sous la forme décimal,
		 * octale, héxadecimale ou binaire
		 */
		int i;
		i = 243; // décimale
		System.out.println(i);
		i = 0363; // octale
		System.out.println(i);
		i= 0xF3; // héxadécimale
		System.out.println(i);
		i = 0b11110011; // binaire
		System.out.println(i);

		/* les valeurs numériques réelles peuvent se présenter soit sous notation décimale
		 * ou la natotation scientifique
		 */
		float surface = 2356.8f; // notation décimale
		System.out.println(surface);
		surface = 2.3568e3f; // notation scientifique
		System.out.println(surface);

		/* on peut insérere des _ dans les valeurs litérales pour faciliter la lecture */
		int abs = 123456789;
		System.out.println(abs);
		abs = 123_456_789;
		System.out.println(abs);

		/* les valeurs numériques entiers sont conciéderes par défaut des int
		 * les valeurs numériques réélles sont conciéderes par défaut des double
		 * */
		/* on rajoute le f à la fin de la valeur 25.65 pour dire qu'il s'agit bien d'un float,
		 * car, sans f, le compilateur pense qu'on essaye de stocker une valeur double dans
		 * une variable float 
		 */				
		float fls = 25.65f; 
	}
}