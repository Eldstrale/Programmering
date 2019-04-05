package Hangman;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		SecretWord secretWord = new SecretWord("Cykel");
		SecretWord secretWord2 = new SecretWord("Tja");
		SecretWord secretWord3 = new SecretWord("Ålande");
		SecretWord secretWord4 = new SecretWord("Cykel");
		SecretWord secretWord5 = new SecretWord("Cykel");
		SecretWord secretWord6 = new SecretWord("Cykel");
		SecretWord secretWord7 = new SecretWord("Cykel");
		SecretWord secretWord8 = new SecretWord("Cykel");
		SecretWord secretWord9 = new SecretWord("Cykel");
		SecretWord secretWord10 = new SecretWord("Cykel");
		
		int points = 10;
		;
		Scanner sc = new Scanner(System.in);
		
		while(!secretWord.isComplete() && points > 0) {
			System.out.println(secretWord.show());
			System.out.println("Gissa på en bokstav: ");
			char guess = sc.next().charAt(0);
			secretWord.guess(guess);
			points--;
		}
		
		System.out.println("Grattis du vann!");
		System.out.println("Du fick " + points + " poäng!");
	}
}