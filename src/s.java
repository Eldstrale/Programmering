import java.util.Scanner;

public class s {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("SKRIV 10 TAL");

		int max = 99999999;
		int min = -99999999;

		// Läs in tal 1
		int tal1 = input.nextInt();

		// Läs in tal 2
		int tal2 = input.nextInt();

		// Läs in tal 3
		int tal3 = input.nextInt();

		// Läs in tal 4
		int tal4 = input.nextInt();

		// Läs in tal 5
		int tal5 = input.nextInt();

		// Läs in tal 6
		int tal6 = input.nextInt();

		// Läs in tal 7
		int tal7 = input.nextInt();

		// Läs in tal 8
		int tal8 = input.nextInt();

		// Läs in tal 9
		int tal9 = input.nextInt();

		// Läs in tal 10
		int tal10 = input.nextInt();

		int summa = tal1 + tal2 + tal3 + tal4 + tal5 + tal6 + tal7 + tal8 + tal9 + tal10;

		double medel = summa / 10; // 5

		int stor = tal1;

		if (stor <= tal2) {
			stor = tal2;
		}
		if (stor <= tal3) {
			stor = tal3;
		}
		if (stor <= tal4) {
			stor = tal4;
		}
		if (stor <= tal5) {
			stor = tal5;
		}
		if (stor <= tal6) {
			stor = tal6;
		}
		if (stor <= tal7) {
			stor = tal7;
		}
		if (stor <= tal8) {
			stor = tal8;
		}
		if (stor <= tal9) {
			stor = tal9;
		}
		if (stor <= tal10) {
			stor = tal10;
		}

		int minst = tal1;

		if (minst >= tal2) {
			minst = tal2;
		}
		if (minst >= tal3) {
			minst = tal3;
		}
		if (minst >= tal4) {
			minst = tal4;
		}
		if (minst >= tal5) {
			minst = tal5;
		}
		if (minst >= tal6) {
			minst = tal6;
		}
		if (minst >= tal7) {
			minst = tal7;
		}
		if (minst >= tal8) {
			minst = tal8;
		}
		if (minst >= tal9) {
			minst = tal9;
		}
		if (minst >= tal10) {
			minst = tal10;
		}

		System.out.println("Minsta: " + minst);
		System.out.println("Största: " + stor);
		System.out.println("Medel: " + medel);

	}

}