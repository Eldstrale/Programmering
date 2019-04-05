public class JohansPlanering {

	public static void main(String[] args) {
		int random = Math.random();
				
		int score = 0;
		
		System.out.println("Gissa tal mellan 1-10");
		
		int input = input.NextInt();
		
		if (random == input) {
			System.out.println("Du har vunnit");
			score = score + 1;
		}
		
		if (input > random) {
			System.out.println("Högre");
			score = score + 1;
		}
		
		if (input < random) {
			System.out.println("Lägre");
			score = score + 1;
		}
	}
}