import java.util.Scanner;

public class commisie {

	private static Scanner scanner;
	private static double prijs;
	private static double comLoon;
	private static double com;
	
	public static void main(String[] args) {
		maakScanner();
		bereken();
		print();
	}
	
	public static void maakScanner() {
		scanner = new Scanner(System.in);
	}
	
	public static void bereken() {
		System.out.println("prijs product");
		prijs = scanner.nextInt();
		System.out.println("percentage commissie");
		comLoon = scanner.nextInt();
		
		com = (prijs/100)*comLoon;
	}
	
	public static void print() {
		System.out.println("de commissie bedraagt " + com + " euro.");
	}

}
