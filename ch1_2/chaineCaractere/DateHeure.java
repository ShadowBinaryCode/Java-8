package chaineCaractere;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;

public class DateHeure {

	public static void main(String[] args) {

		// LocalDate représente une date (jour mois année) sans heure
		LocalDate noel;
		noel = LocalDate.of(2014, 12, 25);
		System.out.println(noel.toString());

		// LocalDateTime représente une date et une heure sans prise en compte du fuseau horaire
		LocalDateTime maintenant = LocalDateTime.now();
		System.out.println(maintenant.toString());
		LocalDate aujourdhui = LocalDate.from(maintenant);
		System.out.println(aujourdhui);

		// LocalTime
		LocalTime horloge = LocalTime.parse("20:15:12");
		System.out.println(horloge.toString());
		LocalTime nouvelleHeure = horloge.withHour(9);
		System.out.println(nouvelleHeure);

		LocalDate packes = LocalDate.of(2014, 4, 20);
		LocalDate assension = packes.plusDays(39);
		System.out.println(assension.toString());

		/* ****************************** */
		// combiner une date et une heure bien spécifique
		LocalDate jourMatch = LocalDate.of(2017, 05, 12);
		LocalTime heureMatch = LocalTime.of(21, 0);
		LocalDateTime fin = jourMatch.atTime(heureMatch);
		System.out.println(fin);

		// un petit programme
		System.out.println("****************");
		MonthDay[] fetes = null;
		fetes = new MonthDay[8];
		fetes[0] = MonthDay.of(1, 1);
		fetes[1] = MonthDay.of(5, 1);
		fetes[2] = MonthDay.of(5, 8);
		fetes[3] = MonthDay.of(7, 14);
		fetes[4] = MonthDay.of(8, 15);
		fetes[5] = MonthDay.of(11, 1);
		fetes[6] = MonthDay.of(11, 11);
		fetes[7] = MonthDay.of(12, 25);
		int nbJours;
		int annee;
		LocalDate jourTest;
		for(annee = 2014; annee < 2030; annee++) {
			nbJours = 0;
			for(MonthDay test : fetes) {
				jourTest = test.atYear(annee);
				if(jourTest.getDayOfWeek() == DayOfWeek.SATURDAY || jourTest.getDayOfWeek() == DayOfWeek.SUNDAY) {
					nbJours++;
				}
			}
			System.out.println("en " + annee + " il ya " + nbJours + " jour(s) ferie(s) un samedi ou un dimanche");
		}
	}
}