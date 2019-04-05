package Hangman;

public class SecretWord {

	private String originalWord;
	private String invertedWord;
	
	public SecretWord(String word) {
		this.originalWord = word;
		this.invertedWord = word;
	}
	
	public void guess(char c) {
		invertedWord = invertedWord.replace(c, '-');
	}
	
	public String show() {
		String out = "";
		for (int = 0; i < originalWord.length(); i++) {
			char org = originalWord.charAt(i);
			char inv = originalWord.charAt(i);
			if (org == inv) {
				out += '-';
			}
				else {
					out += org;
				}
			return: out;
		}
		
		public int length() {
			return originalWord.length();
		}
	}
}