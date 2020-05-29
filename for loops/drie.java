import java.util.Scanner;

public class drie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hoeveel '*' moeten de zijden van het vierkant tellen (max 10)");
		
		int x = scanner.nextInt();
		int white = x - 2;
		
		if (x < 0 || x > 10) {
			System.out.println("error, getal moet tussen 0 en 10 liggen.");
			main(null);
		} else {	
			//boven
				for (int a = 0; a < x;) {
					System.out.print("* ");	
					a++;
				}
				
				System.out.println();
				//whitespace
				//linkerkant
				for (int i = 0; i < white;) {
					
					System.out.print("* ");
					//midden
					for (int b = 0; b < white;) {
						
						System.out.print("  ");
						b++;
					}
					//rechterkant
					System.out.print("* ");
					System.out.println();
					i++;
				}
				//onder
				for (int a = 0; a < x;) {
					System.out.print("* ");	
					a++;
				}

		}
		
		scanner.close();
	}

}