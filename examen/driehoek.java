package examen;

import java.util.Scanner;

public class driehoek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hoe lang moeten de benen van de driehoek zijn?");
		int lengte = scanner.nextInt();
		int white = lengte - 1;
		int x = 1;
		
		for (int i = 0; i < lengte; i++) {
			System.out.println();
			for (int j = 0; j < white; j++) {
				System.out.print(" ");
			}
			
			for (int b = 0; b < x; b++) {
				System.out.print("*");
			}
			
			white --;
			x++;
		}
		
				
		scanner.close();
	}

}
