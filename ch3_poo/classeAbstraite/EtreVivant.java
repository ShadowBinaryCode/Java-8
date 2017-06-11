package classeAbstraite;

public abstract class EtreVivant {

	private double taille;
	private double poids;

	/*
	 * méthode abstraite
	 */
	protected abstract void seDeplacer();

	/* ***************** */
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}


}