package examen;

import java.util.Scanner;

public class koeterwaals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("typ het te vertalen woord.");
		String zin = scanner.next();
		String eerste = zin.substring(0, 1);
		
		if (eerste.equalsIgnoreCase("a")||eerste.equalsIgnoreCase("e")||eerste.equalsIgnoreCase("i")||eerste.equalsIgnoreCase("o")||eerste.equalsIgnoreCase("u")) {
			System.out.println(zin + "boe");
		} else {
			System.out.println(zin.substring(1) + eerste);
		}
		
		scanner.close();
	}

}
