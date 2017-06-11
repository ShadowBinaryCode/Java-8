package converstionType;

public class Lanceur {

	public static void main(String[] args) {
		Object o = new Object();
		Personne p = new Personne();
		Client c = new Client();
		Fournisseur f = new Fournisseur();

		essai(o);
		essai(p);

		/* marche */
		o = o;
		o = p;
		o = c;
		p = f;
	}

	public static void essai(Object obj) {
		Object o;
		Personne p;
		Client c;
		Fournisseur f;

		o = obj;
		if( obj instanceof Personne) 
		{
			p = (Personne) obj;	
		}
		if(obj instanceof Client) {
			c = (Client) obj;
		}
		if(obj instanceof Fournisseur) {
			f = (Fournisseur) obj;
		}
	}
}