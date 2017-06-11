/**
 * 
 * L'énumération va nous permettre de définir un ensemble de constantes qui sont liées entre elles
 *
 * en réalité, une enumeration est une classe qui peut contenir aussi des attibuts et des méthodes
 * 
 * cette classe hérite implicitement la classe java.lang.Enum
 */

public enum JoursEnum {
	DIMANCHE,
	LUNDI, 
	MARDI,
	MERCREDI,
	JEUDI,
	VENDREDI,
	SAMEDI;

	public static void testJours(JoursEnum j) {
		switch(j) {
		case LUNDI:
		case MARDI:
		case MERCREDI:
		case JEUDI : 
			System.out.println("C\'est dur de travailler aujourdhui !!");
			break;
		case VENDREDI :
			System.out.println("C\'est bientot le week-end !!");
			break;
		case SAMEDI :
			System.out.println("Et enfin !!");
			break;
		case DIMANCHE :
			System.out.println("ça recommence !!");
			break;
		}
	}
}