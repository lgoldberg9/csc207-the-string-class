import java.util.Scanner;

public class StringExercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(forgivingPrompt("Respond: Y/N? "));

	}
	
	public static boolean forgivingPrompt(String question) {
		
		System.out.println(question);
		
		String[] positive = {"yes", "y", "yep", "yeah", "indeed", "sure", "yea", "ya"};
		String[] negative = {"no", "na", "nope", "nah", "n"};
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			String response = in.nextLine().toLowerCase().trim();
			
			for (int positiveIterate = 0; positiveIterate < positive.length; positiveIterate++) {
				if (response.equals(positive[positiveIterate])) {
					in.close();
					return true;
				} 
			}
			for (int negativeIterate = 0; negativeIterate < negative.length; negativeIterate++) {
				if (response.equals(negative[negativeIterate])) {
					in.close();
					return false;
				} 
			}
		}
		
	}

	public static void parseName(String s) {
		
	}
	
	public static void add(String line) {
		
	}
}
