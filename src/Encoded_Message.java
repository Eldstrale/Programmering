import java.util.Scanner;

public class Encoded_Message {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String coded = input.nextLine();
		int square = (int) Math.sqrt(coded.length());

		char[][] matris = new char[square][square];

		for (int i = 0; i < square; i++) {
			for (int j = 0; j < square; j++) {
				matris[i][j] = coded.charAt(square * i + j);

			}

		}
		char[][] decoded = new char[square][square];
		for (int x = 0; x < square; x++) {
			for (int y = 0; y < square; y++) {
				decoded[x][y] = matris[y][square - 1 - x];
				System.out.print(decoded[x][y]);
			}
		}

	}

}