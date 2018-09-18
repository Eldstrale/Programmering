import java.util.Scanner;

public class s {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		
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
		
		System.out.println("Minsta: " + min);
		System.out.println("Största: " + max);
		System.out.println("Medel: " + medel);
		
	}

}

// if(d>tal1)else if(d>tal2)if tal 1>
// int summa = tal1+tal2+tal3+tal4+tal5+tal6+tal7+tal8+tal9+tal10
// double medel1 = summa / 5; // 5
// double medel2 = summa / 5.0; // 5,6