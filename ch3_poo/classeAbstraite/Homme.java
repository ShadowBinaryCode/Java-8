package classeAbstraite;

public class Homme extends EtreVivant {

	@Override
	protected void seDeplacer() {
		System.out.println("je marche sur 4 pattes !!");
	}
}