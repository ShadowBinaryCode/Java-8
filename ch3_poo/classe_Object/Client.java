package classe_Object;

public class Client extends EtreHumain {

	/*
	 * pour le type 
	 * P : Particulier
	 * E : Entreprise
	 * A : Administration
	 */
	private char type;
	private String situation;

	public Client() {
		type = ' ';
		situation = "";
	}

	/*
	@Override
	public int hashCode() {
		return (int)this.type + this.situation.hashCode();
	}
	 */

	@Override
	public boolean equals(Object obj) {
		if(obj != null && this.getClass().equals(obj.getClass())) {
			Client cl = (Client) obj;
			if(this.type == cl.type && this.situation.equals(cl.situation)) {
				return true;	
			}
		}
		return false;
	}

	public Client(char type) {
		this.type = type;
	}

	public Client(char type, String situation) {
		this.type = type;
		this.situation = situation;
	}

	public char getType() {
		return this.type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}		

	@Override
	public String toString() {
		return "\n" + this.type + " , " + this.situation;
	}
}