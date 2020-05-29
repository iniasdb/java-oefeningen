import java.util.Scanner;

public class plato {

	private static Scanner scanner;
	private static int manAge;
	private static int womAge;
	private static int gender;
	
	public static Scanner maakScanner() {
		scanner = new Scanner(System.in);
		return scanner;
	}
	
	public static int askGender(Scanner scanner) {
		System.out.println("1: man");
		System.out.println("2: vrouw");
		gender = scanner.nextInt();
		return gender;
	}
	
	public static int askManAge(Scanner scanner) {
		System.out.println("Wat is uw leeftijd? ");
		manAge = scanner.nextInt();
		return manAge;
	}
	
	public static int askWomAge(Scanner scanner) {
		System.out.println("Wat is uw leeftijd? ");
		womAge = scanner.nextInt();
		return womAge;
	}
	
	public static void main(String[] args) {
		maakScanner();
		askGender(scanner);
		if (gender == 1) {
			askManAge(scanner);
			womAge = (manAge/2)+7;
			System.out.println("de ideale vrouw is " + womAge + " jaar oud.");
		} else if (gender == 2) {
			askWomAge(scanner);
			manAge = (womAge-7)*2;
			System.out.println("de ideale man is " + manAge + " jaar oud.");
		} else {
			System.out.println("error");
		}
	}

}
