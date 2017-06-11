package variables;

public class TypeConversion {

	public static void main(String[] args) {
		/* le but c'est de transformer le type d'une variable à un autre type
		 * 
		 * on peut faire la conversion dans les deux sens :
		 * 		- type supérieur vers type inférieur
		 * 		- type inférieur vers type supérieur
		 * 
		 * pour faire la conversion d'un type supérieur à un type inférieur, il ya un risque
		 * de perte de données, c'est pour ça le compilateur nous forcer à faire la conversion explicitement
		 * 
		 */
		float surface = 2356.8f;
		System.out.println("float : " + surface);
		int approximation = (int) surface;
		System.out.println("int : " + approximation);
	}
}