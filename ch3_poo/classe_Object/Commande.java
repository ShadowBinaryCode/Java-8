package classe_Object;

public class Commande implements Cloneable {

	Client client;
	LigneDeCommande lignesCommande;

	public Commande() {
		lignesCommande = new LigneDeCommande();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Commande commande;
		commande = (Commande) super.clone();
		commande.lignesCommande = (LigneDeCommande) lignesCommande.clone();
		return commande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public LigneDeCommande getLignesCommande() {
		return lignesCommande;
	}
	public void setLignesCommande(LigneDeCommande lignesCommande) {
		this.lignesCommande = lignesCommande;
	}
}