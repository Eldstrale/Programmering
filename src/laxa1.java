import java.util.Scanner;

public class laxa1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tal = input.nextInt();
		
		System.out.println(volume(tal));
	}

	public static double volume(double radius) {

		return 3.1416 * radius * radius * radius * 4 / 3;
	}

}