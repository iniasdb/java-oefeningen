package mexicooooo;

import java.util.Scanner;

public class mexico {
	
	private static Scanner scanner;
	private static String[] player;
	private static Speler[] spelers;
	private static Dobbelstenen dob1;
	private static boolean spelen = true;
	
	public static Scanner maakScanner() {
		scanner = new Scanner(System.in);
		return scanner;
	}
	
	public static void xPlayers(Scanner scanners) {
		System.out.println("hoeveel mensen doen mee?");
		int aantal = scanner.nextInt();
		
		spelers = new Speler[aantal];
		for (int i = 0; i < spelers.length; i++) {
			System.out.println("naam speler");
			spelers[i] = new Speler(scanner.next());
		}
	}
	
	public static void getPlayers() {
		for (int i = 0; i<spelers.length; i++) {
			System.out.println(spelers[i].getNaam());
		}
	}
	
	public static void maakKeuze() {
		System.out.println("rol (1)");
		System.out.println("spelers 2");
		System.out.println("eindig spel (3)");
		int x = scanner.nextInt();
		
		if (x == 1) {
			System.out.println();
			dob1.rol();
			System.out.println();
		} else if (x == 2) {
			System.out.println();
			getPlayers();
			System.out.println();
		} else if (x == 3) {
			System.out.println("exit");
			spelen = false;
		} else {
			System.out.println("error");
		}
	}

	public static void main(String[] args) {
		dob1 = new Dobbelstenen();
		
		maakScanner();
		xPlayers(scanner);
		getPlayers();
		while (spelen) {
			maakKeuze();
		}
	}

}
