import java.util.Scanner;

public class beker {

	private static Scanner scanner;
	private static double hoogte;
	private static double straal;
	private static double x;
	
	public static void maakScanner() {
		scanner = new Scanner(System.in);
	}
	
	public static double vraagHoogte(Scanner scanner) {
		System.out.println("hoogte: ");
		hoogte = (double) scanner.nextInt();
		return hoogte;
	}
	
	public static double vraagStraal(Scanner scanner) {
		System.out.println("straal: ");
		straal = (double) scanner.nextInt();
		return straal;
	}
	
	public static double bereken(double hoogte, double straal) {
		double massadichtheid = 6.283;
		x = (Math.pow(straal, 2) + (straal * hoogte)) * massadichtheid;
		return x;
	}
	
	public static void main(String[] args) {
		maakScanner();
		vraagHoogte(scanner);
		vraagStraal(scanner);
		bereken(hoogte, straal);
		System.out.println((double)Math.round(x));
	}

}
