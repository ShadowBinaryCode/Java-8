package interfaces;

public class Lanceur {

	public static void main(String[] args) {
		Personne p1 = new Personne("David");
		Personne p2 = new Personne("Mehdi");
		Personne p3 = new Personne("Brian");
		int resultCompare = p1.compare(p2);
		System.out.println("le resultat de comparaison : " + resultCompare);

		Personne[] personnes = {p1, p2, p3};
		Personne[] tabTri = (Personne[])Personne.tri(personnes);
		for(Personne p : tabTri) {
			System.out.println(p.getNom());
		}
	}	
}