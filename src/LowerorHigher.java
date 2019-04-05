import java.util.Arrays;
import java.util.Collections;

public class LowerorHigher {
	
	public void 
public static void main(String[] args) {
	
	String[] kortlek = new String[52];
	
	for (int i = 0; i < 4; i++) {
		String color = "";
		if (i == 0) {
			color = "Hjärter";
		}
		if (i == 1) {
			color = "Spader";
		}
		if (i == 2) {
			color = "Ruter";
		}
		if (i == 3) {
			color = "Klöver";
		}
		
		for (int j = 1; j <= 13; j++) {
			
			if(j == 1) {
				kortlek[i * 13 + (j - 1)] = color + " A";
			}
			
			else if(j == 11) {
				kortlek[i * 13 + (j - 1)] = color + " J";
			}
			else if(j == 12) {
				kortlek[i * 13 + (j - 1)] = color + " Q";
			}
				else if(j == 13) {
					kortlek[i * 13 + (j - 1)] = color + " K";
				}
			
				else if(j == 13) {
					kortlek[i * 13 + (j - 1)] = color + " " + j;
				}
				
	}
	}
	
	String[] deck = createDeck();
	shuffleDeck(deck);
	
	String card = drawCard(deck);
	
	System.out.println(Arrays.toString(deck));
	
	public static String drawcard(String[] Deck) {
	
	List<String> list = Arrays.asList(kortlek);
	Collections.shuffle(list);
	String[] arr = }
	
	
			
	}
	
	public static String drawCard(String[] deck) {
		for (int i = 0; i < deck.length; i++) {
			if(deck[i] !=null) { 
				String card = deck[i]
			}
		}
}
}
