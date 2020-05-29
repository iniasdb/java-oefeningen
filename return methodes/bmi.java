import java.util.Scanner;

public class bmi {

	private static Scanner scanner;
	private static double gewicht;
	private static double lengte;
	private static double bmi;
	private static String check;
	
	public static Scanner maakScanner() {
		scanner = new Scanner(System.in);
		return scanner;
	}
	
	public static double vraagGew(Scanner scanner) {
		System.out.println("wat is uw gewicht? ");
		gewicht = scanner.nextDouble();
		return gewicht;
	}
	
	public static double vraagLen(Scanner scanner) {
		System.out.println("wat is uw lengte? (in meters)");
		lengte = scanner.nextDouble();
		return lengte;
	}
	
	public static double berekenBMI(double gewicht, double lengte) {
		bmi = gewicht/(Math.pow(lengte, 2));
		return bmi;
	}
	
	public static String checkBMI(double bmi) {
		if (bmi < 19) {
			check = "ondergewicht";
			return check;
		} else if (bmi > 25) {
			check = "overgewicht";
			return check;
		} else {
			check = "een normaal gewicht";
			return check;
		}
	}
	
	public static void print(double bmi, String check) {
		System.out.println("uw bmi is " + bmi);
		System.out.println("dit wil zeggen dat u " + check + " heeft.");
	}
	
	public static void main(String[] args) {
		maakScanner();
		vraagGew(scanner);
		vraagLen(scanner);
		berekenBMI(gewicht, lengte);
		checkBMI(bmi);
		print(bmi, check);
	}

}
