import java.util.Scanner;

public class StringExercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(forgivingPrompt("Respond: Y/N? "));
		
		System.out.println(parseName("Turing,Alan,Mathison"));
		
		System.out.println(add("0+31+4+81+9+10"));

	}
	
	// Takes a string question that is used to respond to for the function prompt.
	public static boolean forgivingPrompt(String question) {
		
		System.out.println(question);
		
		String[] positive = {"yes", "y", "yep", "yeah", "indeed", "sure", 
							"yea", "ya"}; // Positive expected comments.
		String[] negative = {"no", "na", "nope", "nah", "n"};
		// Negative expected comments.
		Scanner in = new Scanner(System.in);
		
		while(true) {// We use a while loop to reset the user input so we guarantee
					// true or false.
			
			String response = in.nextLine().toLowerCase().trim();
			
			for (int positiveIterate = 0; positiveIterate < positive.length; 
					positiveIterate++) {
				if (response.equals(positive[positiveIterate])) {
					in.close(); // Closing scanner.
					return true;
				} 
			}
			for (int negativeIterate = 0; negativeIterate < negative.length; 
					negativeIterate++) {
				if (response.equals(negative[negativeIterate])) {
					in.close(); // Closing scanner.
					return false;
				} 
			}
		}
		
	}

	// Takes a string s which is formatted using <last name>,<first name>,<middle name>.
	public static String parseName(String s) {
		
		String[] names = s.split(","); // Getting rid of the delimiters.
		
		return names[1] + " " + names[2] + " " + names[0]; // Returning actual name.
		
	}
	
	// Takes a line of string of plus signs and numbers and literally sums them.
	public static int add(String line) {
		
		String[] numbers = line.trim().split("\\+");
		
		int sumNumbers = 0;
		
		for (int parseNumbers = 0; parseNumbers < numbers.length; 
				parseNumbers++) {
			sumNumbers += Integer.parseInt(numbers[parseNumbers]);
		}	
		return sumNumbers;
	}
}
