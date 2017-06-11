package lambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LanceurComparateurPersonneMain {

	public static void main(String[] args) throws IOException {

		Personne p1 = new Personne("mehdi", 26);
		Personne p2 = new Personne("david", 22);
		Personne p3 = new Personne("laurent", 35);

		Personne[] personnes = {p1, p2, p3};	
		Personne p = Personne.recherche(personnes, new ComparateurPersonne() {

			@Override
			public boolean isIdentique(Personne p) {				
				if(p.getNom().equals("david")) {
					return true;
				}
				return false;
			}
		});

		System.out.println(p.getNom() + " , " + p.getAge());

		Personne pss = Personne.recherche(personnes, (Personne ps) -> 
		{
			for(Personne w : personnes) {
				if(ps.getAge() == 26) {
					return true;
				}
			}
			return false;	
		});
		System.out.println(pss.getNom() + " , " + pss.getAge());

		/*
		 * ecriture 1 possible : 
		 * quan on utilise les expressions lambda, on peut facilement faciliter l'ecriture,
		 * d'abord, on a pas besoin de specifier le types des parametres, et si on a un seul parametre,
		 * les parenthres ne devient pas obligatoire
		 */
		Personne ppers = Personne.recherche(personnes, pme -> {
			for(Personne m : personnes) {
				if(pme.getNom().equals("mehdi")) {
					return true;
				}
			}
			return false;
		});
		System.out.println("********* " + ppers.getNom() + " , " + ppers.getAge());

		/*
		 * ecriture 2 possible
		 * une autre façon pour ecrire les lambdas porte sur le corps du lambda
		 * si le corps ne contient qu'une seule expression, les accolades devient facultative ainsi que l'utilisation du mot "return"
		 * dans ce cas, l'expression est evalué lors de l'exécution et la valeur générée est retournée au code appelant
		 * 
		 */
		Personne p10 = Personne.recherche(personnes, p010 -> p010.getNom().equals("david"));
		System.out.println("======= " + p10.getNom() + " , " + p10.getAge());

		/*
		 * l'expression lambda peut utiliser les variables dans le contexte dans laquelle elle est définie
		 * remarque très importante : l'expression lambda ne peut pas modifier les variables mais juste les utiliser
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Entrer le nom que vous cherchez : ");
		String chaine = br.readLine();
		Personne pCh = Personne.recherche(personnes, pc -> pc.getNom().equals(chaine));
		System.out.println(pCh.getNom() + " , " + pCh.getAge());
	}
}