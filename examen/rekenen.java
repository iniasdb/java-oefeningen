package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class rekenen {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("rekenen.txt"));
		
		for (int i = 0; i<6; i++) {
			int getal1 = scanner.nextInt();
			String operator = scanner.next();
			int getal2 = scanner.nextInt();
			String bewerking = getal1 + " " + operator + " " + getal2;
			
			if (operator.equalsIgnoreCase("x")) {
				System.out.println(bewerking + " = " + getal1 * getal2);
			} else if (operator.equals("-")) {
				System.out.println(bewerking + " = " + (getal1 - getal2));
			} else if (operator.equals("/")) {
				System.out.println(bewerking + " = " + getal1 / getal2);
			} else if (operator.equals("+")) {
				System.out.println(bewerking + " = " + (getal1 + getal2));
			} else {
				System.out.println("er ging iets fout");
			}
		}
		
		scanner.close();
	}

}
