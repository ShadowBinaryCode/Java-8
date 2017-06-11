package interfaces;

public class Voiture implements Classable {

	private String immatriculation;
	private String modele;
	private String marque;
	private int puissance;

	public Voiture() {
		super();
	}

	public Voiture(String immatriculation, String modele, String marque,
			int puissance) {
		this.immatriculation = immatriculation;
		this.modele = modele;
		this.marque = marque;
		this.puissance = puissance;
	}

	public Voiture(Voiture v) {
		this.immatriculation = v.immatriculation;
		this.modele = v.modele;
		this.marque = v.marque;
		this.puissance = v.puissance;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public int compare(Object o) {
		if(o != null && o instanceof Voiture) {
			Voiture v = (Voiture) o;
			if(this.puissance > v.getPuissance()) {
				return Classable.SUPERIEUR;
			} else if (this.puissance == v.getPuissance()) {
				return Classable.EGAL;
			} else {
				return Classable.INFERIEUR;
			}
		}
		return Classable.ERREUR;
	}

	@Override
	public boolean isInferieur(Object o) {
		if(o != null && o instanceof Voiture) {
			Voiture v = (Voiture)o;
			if(this.puissance < v.getPuissance()) {
				return true;
			} 
		}
		return false;
	}

	@Override
	public boolean isSuperieur(Object o) {
		if(o != null && o instanceof Voiture) {
			Voiture v = (Voiture)o;
			if(this.puissance > v.getPuissance()) {
				return true;
			} 
		}
		return false;
	}
}