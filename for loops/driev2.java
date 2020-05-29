import java.util.Scanner;

public class driev2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lengte: ");
		int l = scanner.nextInt();
		System.out.println("breedte: ");
		int b = scanner.nextInt();
		int white = b - 2;
		int whiteL = l - 2;
		
		if (b < 0 || b > 10 || l < 0 || l > 10) {
			System.out.println("error, getal moet tussen 0 en 10 liggen.");
			main(null);
		} else {	

				for (int a = 0; a < b;) {
					System.out.print("* ");	
					a++;
				}
				
				System.out.println();
				
				for (int i = 0; i < white;) {
					
					System.out.print("* ");
					for (int c = 0; c < whiteL;) {
						
						System.out.print("  ");
						c++;
					}
					
					System.out.print("* ");
					System.out.println();
					i++;
				}
				
				for (int a = 0; a < b;) {
					System.out.print("* ");	
					a++;
				}

		}
		
		scanner.close();
	}

}