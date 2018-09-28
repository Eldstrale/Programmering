import java.util.Scanner;

public class yuh {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int ett = input.nextInt();
		int tva = input.nextInt();
		if (ett>tva)System.out.println(tva);
		else System.out.println(ett);
		
	}
	
}