package chaineCaractere;

public class ChaineCaractere {

	public static void main(String[] args) {

		String chaine1 = "Ac milan !!";
		String chaine2= "Inter milan !!";

		// afficher le quatrième caractère de chaine1
		System.out.println(chaine1.charAt(3));
		System.out.println("Longueur de la chaine1 est " + chaine1.length());

		// découpage d'une chaine
		System.out.println("Un morceau de la chaine1 : " + chaine1.substring(3,8));

		// Comparaison entre 2 chaines
		String ch1 = "hello";
		String ch2 = "hello";
		compareTwoChaine(ch1, ch2);

		// pour faire un classement
		String a = "Test.java";
		String b = "Personne.java";
		int classement = a.compareTo(b);
		if(classement < 0) {
			System.out.println("a < b");
		} else if(classement == 0) {
			System.out.println("a = b");
		} else {
			System.out.println("a > b");
		}

		// startsWith et endsWith
		System.out.println(a.startsWith("Tes"));
		System.out.println(b.endsWith(".java"));

		// supprimer les espaces
		String esp = "    ENI    ";
		System.out.println("La taille de " + esp + " avant la suppression des espace est " + esp.length());
		System.out.println("La taille de " + esp + " après la suppression des espace est " + esp.trim().length());

		// Changer la case
		System.out.println(esp.toLowerCase());		

		// Recherche dans une chaine
		String chai = "salut tout le monde !!";
		System.out.println(chai.indexOf("le monde"));
		System.out.println(chai.indexOf("carmen")); // carmen n'existe pas dans la chaine de la variable chai

		String chaine20= "adios e amigos e tout !!";
		String recherche;
		int position;
		recherche = "e";
		position = chaine20.indexOf(recherche);
		while (position > 0) {
			System.out.println("la chaine e est trouvée à la position " + position);
			position = chaine20.indexOf(recherche, position + 1);
		}
		System.out.println("Fin de la recherche !!");

		// remplacer une chaine
		String chaineR = "hiver est pluvieux !!";
		String resuR = chaineR.replace("hiver", "été");
		System.out.println(resuR);
	}

	public static void compareTwoChaine(String ch1, String ch2) {
		if(ch1.equals(ch2)) {
			System.out.println("good !!");
		} else {
			System.out.println("not good !!");
		}
	}
}