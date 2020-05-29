package school;

import java.util.Scanner;

public class main_lln {

	private static Scanner scanner;
	private static String fname;
	private static String lname;
	private static String className;
	
	public static void maakScanner() {
		scanner = new Scanner(System.in);
	}
	
	public static void leesGegevens(Scanner scanner) {
		System.out.println("voornaam:");
		fname = scanner.nextLine();
		System.out.println("achternaam:");
		lname = scanner.nextLine();
		System.out.println("klas:");
		className = scanner.nextLine();
	}
	
	public static void main(String[] args) {
		
		maakScanner();
		leesGegevens(scanner);
		
		lln lln1 = new lln(fname, lname, className);
		
		System.out.println(lln1.getFname() + " " + lln1.getLname() + " van klas " + lln1.getClassName());
		
	}

}
