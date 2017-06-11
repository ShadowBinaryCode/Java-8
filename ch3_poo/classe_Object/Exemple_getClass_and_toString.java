package classe_Object;

public class Exemple_getClass_and_toString {

	public static void main(String[] args) {
		Client cl = new Client('A', "Salarié");
		infoClass(cl);					
		System.out.println(cl);
		// ou
		System.out.println(cl.toString());
	}

	public static void infoClass(Object o) {
		if(o != null && (o instanceof Client)) {			
			Client cl = (Client) o;
			Class c = cl.getClass();
			System.out.println("le nom de la classe : " + c.getName());
			System.out.println("le nom du package : " + c.getPackage());
			System.out.println("le nom de la classe de base " + c.getSuperclass().getName());
			/*
			 * remarque : getFields recupere que les attributs public
			 */
			System.out.println(c.getFields().length);
			System.out.println("*********** Les méthode de la classe ***********");
			for(int i = 0; i < c.getMethods().length; i++) {
				System.out.print("méthode : " + c.getMethods()[i].getName());
				System.out.print(" qui attend comme parametres : ");
				for(int j = 0; j < c.getMethods()[i].getParameterTypes().length; j++) {
					System.out.println("parametre : " + c.getMethods()[i].getParameters()[j].getName() + " de type " + c.getMethods()[i].getParameters()[j].getType());
				}
			}
		}
	}
}
