package examen;

import java.util.Scanner;

public class priemgetallen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("geef een getal in");
		int getal = scanner.nextInt();
		int i = 2;
		boolean priemgetal = true;
		
		while ((getal%i) == 0 && !(i > 100)) {
			priemgetal = false;
			i++;
		}
		
		if (priemgetal) {
			System.out.println("dit getal is een priemgetal");
			main(null);
		} else {
			System.out.println("dit getal is geen priemgetal");
			main(null);
		}
		
		scanner.close();
	}

}
