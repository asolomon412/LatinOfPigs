import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String choice = "yes";

		System.out.println("Welcome to the pig latin translator!");

		while (choice.equalsIgnoreCase("yes") || choice.equals("y")) {

			String input;
			String translated;
			char firstLetter;
			char secondLetter;
			char thirdLetter;

			System.out.println("\nPlease enter a word: ");
			input = scan.nextLine().toLowerCase();

			firstLetter = input.charAt(0);
			secondLetter = input.charAt(1);
			thirdLetter = input.charAt(2);

			if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
					|| firstLetter == 'u') {

				System.out.println(input + "way");
			} else if ((secondLetter == 'a' || secondLetter == 'e' || secondLetter == 'i' || secondLetter == 'o'
					|| secondLetter == 'u')) {

				translated = input.substring(1) + firstLetter + "ay";
				System.out.println("In pig latin, it's: " + translated);

			} else if ((thirdLetter == 'a' || thirdLetter == 'e' || thirdLetter == 'i' || thirdLetter == 'o'
					|| thirdLetter == 'u')) {

				translated = input.substring(2) + firstLetter + secondLetter + "ay";
				System.out.println("In pig latin, it's: " + translated);
			} else {
				
				translated = input.substring(3) + firstLetter + secondLetter + thirdLetter + "ay";
				System.out.println("In pig latin, it's: " + translated);
			}

			System.out.println("\nWould you like to continue? y/n");
			choice = scan.nextLine();
		}
		System.out.println("Goodbye!");
		scan.close();

	}
}
