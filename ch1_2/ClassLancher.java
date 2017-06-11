
public class ClassLancher {

	public static void main(String[] args) {
		DaltonsEnum d;
		d = DaltonsEnum.JACK;
		// toString c pour afficher le nom de la constante de l'�nu�ration
		System.out.println(d.toString());

		d = DaltonsEnum.valueOf("JOE");
		System.out.println("Taille --> " + d.taille() + ", Poids --> " + d.poids());

		/* on peut afficher toutes les constantes de l'�num�ration */
		System.out.println("*********** Les fr�res Daltons ***********");
		for(DaltonsEnum de : DaltonsEnum.values()) {
			System.out.println(de.toString());
		}

		/* *************************************** */
		JoursEnum repere;
		repere = JoursEnum.SAMEDI;

		JoursEnum.testJours(repere);
	}
}