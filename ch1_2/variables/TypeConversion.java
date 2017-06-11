package variables;

public class TypeConversion {

	public static void main(String[] args) {
		/* le but c'est de transformer le type d'une variable � un autre type
		 * 
		 * on peut faire la conversion dans les deux sens :
		 * 		- type sup�rieur vers type inf�rieur
		 * 		- type inf�rieur vers type sup�rieur
		 * 
		 * pour faire la conversion d'un type sup�rieur � un type inf�rieur, il ya un risque
		 * de perte de donn�es, c'est pour �a le compilateur nous forcer � faire la conversion explicitement
		 * 
		 */
		float surface = 2356.8f;
		System.out.println("float : " + surface);
		int approximation = (int) surface;
		System.out.println("int : " + approximation);
	}
}