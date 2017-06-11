package classe_Object;

public class Lanceur {

	public static void main(String[] args) throws CloneNotSupportedException {
		Client client = new Client('A');
		Commande cmd1, cmd2;

		cmd1 = new Commande();
		cmd1.setClient(client);

		System.out.println("Hashcode des éléments originales **********");
		System.out.println("HashCode de la commande 1 : " + cmd1.hashCode());
		System.out.println("HashCode du client : " + cmd1.getClient().hashCode());
		System.out.println("HashCode des lignes de commande : " + cmd1.getLignesCommande().hashCode());

		System.out.println("Hashcode des éléments de la copie **********");
		cmd2 = (Commande) cmd1.clone();
		System.out.println("HashCode de la commande de la copie (cmd2) : " + cmd2.hashCode());
		System.out.println("HashCode du client de la copie : " + cmd2.getClient().hashCode());
		System.out.println("HashCode des lignes de commande de la copie : " + cmd2.getLignesCommande().hashCode());

		/* méthode equals */
		System.out.println("\n");
		Client cl1 = new Client('A', "Salarié");
		Client cl2 = new Client('A', "Salarié");
		if(cl1.equals(cl2)) {
			System.out.println("Egalité");
		} else {
			System.out.println("Non Egalité");
		}		
	}
}