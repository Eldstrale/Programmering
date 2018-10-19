import java.util.Scanner;

public class laxa4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String str = input.nextLine();

		System.out.println(sjorovare(str));

	}

	public static String sjorovare(String str) {
		String mon = "";
		for (int i = 0; i < str.length(); i++) {
			switch (str.toLowerCase().charAt(i)) {

			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'z':

				mon += str.charAt(i) + "o" + str.charAt(i);

			}

			switch (str.toLowerCase().charAt(i)) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':
			case 'å':
			case 'ä':
			case 'ö':
			case ' ':
			case '!':
			case '.':
			case '-':
			case ',':
			case '?':
			case '_':
			case ';':
			case ':':
			case '=':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case '0':
			case '"':
			case '+':
			case '*':
			case '<':
			case '>':
			case '&':
			case '#':
			case '$':
			case '%':
			case '£':
			case '@':
			case '(':
			case ')':
			case '[':
			case ']':
			case '{':
			case '}':
			case '§':
			case '½':
			case '/':
			case '´':
			case '`':
			case '¤':
			case '|':
			case '¨':
			case '~':
			case '^':

				mon += str.charAt(i);

			}
		}

		return mon;
	}

}