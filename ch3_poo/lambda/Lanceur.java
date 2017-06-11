package lambda;

import java.util.Arrays;

public class Lanceur {

	public static void main(String[] args) {
		Personne[] personnes = {new Personne(21), new Personne(12), new Personne(44), new Personne(16)};;
		Personne[] persTri = (Personne[]) tri(personnes, (Object o1, Object o2)->
		{
			if(o1 != null && o2 != null && o1 instanceof Personne && o2 instanceof Personne) {
				Personne p1 = (Personne)o1;
				Personne p2 = (Personne)o2;
				if(p1.getAge() > p2.getAge()) {
					return Comparateur.SUPERIEUR;
				} else if(p1.getAge() == p2.getAge()) {
					return Comparateur.EGAL;
				} else {
					return Comparateur.INFERIEUR;
				}
			}
			return Comparateur.ERREUR;
		});
		for(Personne p : persTri) {
			System.out.println(p.getAge() + "\t");
		}
	}	

	public static Object[] tri(Object[] tablo, Comparateur trieur) {
		Object[] tabloTri;
		tabloTri = Arrays.copyOf(tablo, tablo.length);

		if(tabloTri instanceof Personne[]) {
			for(int i = 0; i < tabloTri.length; i++) {
				for(int j = i + 1; j < tabloTri.length; j++) {
					if(trieur.compare(tabloTri[i], tabloTri[j]) == Comparateur.SUPERIEUR) {
						Object c = tabloTri[j];
						tabloTri[j] = tabloTri[i];
						tabloTri[i] = c;
					} else if(trieur.compare(tabloTri[i], tabloTri[j]) == Comparateur.ERREUR) {
						return null;
					}
				}
			}
		}
		return tabloTri;
	}
}