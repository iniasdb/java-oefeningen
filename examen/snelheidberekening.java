package examen;

import java.util.Scanner;

public class snelheidberekening {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("hoeveel km rijd u?");
		double km = scanner.nextDouble();
		System.out.println("hoeveel tijd doet u over die afstand?");
		double tijd = scanner.nextDouble();
		
		int snelheid = (int) Math.round(km/tijd);

		System.out.println("u rijd " + snelheid + " km/uur");
		scanner.close();*/
		
		
		for (int i = 0; i < 50; i++) {
			int random = (int) Math.floor((Math.random()*9)+1);
			System.out.println(random);
		}
	}
}
