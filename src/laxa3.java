import java.util.Scanner;

public class laxa3 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);	
		
		System.out.println(count(input.nextLine(), input.next().charAt(0)));
	}

	public static int count(String str, char c) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	

}
