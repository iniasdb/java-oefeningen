import java.util.Scanner;

public class commissieParameters {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		maakScanner();
		leesIn();
	}
	
	public static void maakScanner() {
		scanner = new Scanner(System.in);
	}
	
	public static void leesIn() {
		System.out.println("prijs product");
		double prijs = scanner.nextInt();
		System.out.println("percentage commissie");
		double comLoon = scanner.nextInt();
		bereken(prijs, comLoon);
	}
	
	public static void bereken(double prijs, double comLoon) {
		double com = (prijs/100)*comLoon;
		print(com);
	}
	
	public static void print(double com) {
		System.out.println("de commissie bedraagt " + com + " euro.");
	}

}
