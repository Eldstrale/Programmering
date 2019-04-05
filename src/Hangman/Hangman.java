package Hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	private static String Ordet;

	public static String Hidden = "";

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Int-variabel för liv.
		int liv = 10;

		// Skriver ut "Hänga gubben, skriv in ett ord." i konsolen.
		System.out.println("Hänga gubben, skriv in ett ord.");
		System.out.println();

		// Tar in ordet som ska gissas på och loopar igenom det för
		// att göra om bokstäverna till streck.
		Ordet = input.next();
		for (int i = 0; i < Ordet.length(); i++) {
			Hidden += '-';
		}

		// Skriver ut "Låt en kompis gissa på ordet." i konsolen.
		System.out.println();
		System.out.println("Låt en kompis gissa på ordet.");
		System.out.println();

		while (liv > 0 && !klar()) {
			// Skriver ut den gömda versionen ordet, alltså ett streck för varje bokstav i
			// ordet.
			System.out.println(Hidden);
			// Skriver ut antal liv du har kvar.
			System.out.println("Liv: " + liv);
			System.out.println();
			// Variabel för bokstaven som skrivs in som gissning och den läses även
			// automatiskt in som en liten bokstav och ifall man skulle
			// skriva in flera bokstäver räknas bara den första.
			char gissning = input.next().toLowerCase().charAt(0);
			// String-variabel för det nya ordet med den gissade bokstaven + streck.
			String ny = "";
			// Boolean för att se om det är möjligt att sätta in bokstaven som gissades på i
			// ordet.
			boolean möjlig = false;
			// For-loop som loopar igenom ordet och sätter in bokstaven där den ska vara, om
			// det finns med i ordet.
			for (int i = 0; i < Ordet.length(); i++) {
				if (Ordet.toLowerCase().charAt(i) == gissning) {
					ny += Ordet.charAt(i);
					möjlig = true;
				} else {
					ny += Hidden.charAt(i);
				}
			}
			// Uppdaterar det gömda ordet med den gissade bokstaven.
			Hidden = ny;
			// Om bokstaven som gissades på inte finns i ordet förlorar man ett liv.
			if (!möjlig) {
				liv--;
			}

		}
		// Om du får slut på liv visas detta.
		if (liv == 0) {
			System.out.println();
			System.out.println();
			System.out.println("Ordet var: " + Ordet);
			System.out.println();
			System.out.println("Du förlorade!");
		}
		// Annars (alltså om du vinner) visas detta.
		else {
			System.out.println();
			System.out.println();
			System.out.println(Ordet);
			System.out.println();
			System.out.println("Du vann med " + liv + " liv kvar!");
		}

	}

	// Kontrollerar om spelet är klart, alltså om
	// det gömda ordet nu är samma som det ursprungliga ordet som skrevs in.
	public static boolean klar() {

		if (Hidden.equals(Ordet)) {
			return true;
		} else {
			return false;
		}

	}

}