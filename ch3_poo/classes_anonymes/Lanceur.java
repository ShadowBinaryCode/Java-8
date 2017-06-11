package classes_anonymes;

import java.util.Arrays;

public class Lanceur {

	public static void main(String[] args) {
		Personne[] personnes = {new Personne("mehdi", 21), new Personne("zaki", 12), new Personne("anas", 33)};
		/*
		 * Trier les personnes selon leurs age
		 */
		Personne[] persTriAge = (Personne[])tri(personnes, new Comparateur() {

			@Override
			public int compare(Object o1, Object o2) {
				if(o1 != null && o2 != null && o1 instanceof Personne && o2 instanceof Personne) {
					Personne p1 = (Personne) o1;
					Personne p2 = (Personne) o2;
					if(p1.getAge() > p2.getAge()) {
						return Comparateur.SUPERIEUR;
					} else if (p1.getAge() < p2.getAge()) {
						return Comparateur.INFERIEUR;
					} else {
						return Comparateur.EGAL;
					}
				}
				return Comparateur.ERREUR;
			}
		});

		for(Personne p : persTriAge) {
			System.out.println(p.getAge() + "\t");
		}
		System.out.println();

		/*
		 * Trier les personnes selon leurs noms
		 */
		Personne[] persTri = (Personne[]) tri(personnes, new Comparateur() {

			@Override
			public int compare(Object o1, Object o2) {

				if(o1 != null && o2 != null && o1 instanceof Personne && o2 instanceof Personne) {
					Personne pa = (Personne) o1;
					Personne pb = (Personne) o2;
					if(pa.getNom().compareTo(pb.getNom()) > 0) {
						return Comparateur.SUPERIEUR;
					} else if(pa.getNom().compareTo(pb.getNom()) < 0) {
						return Comparateur.INFERIEUR;
					} else {
						return Comparateur.EGAL;
					}
				}
				return Comparateur.ERREUR;
			}
		});

		for(Personne p : persTri) {
			System.out.println(p.getNom());
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