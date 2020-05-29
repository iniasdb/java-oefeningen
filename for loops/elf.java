import java.util.Scanner;

public class elf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hoe lang moeten de benen van de driehoek zijn?");
		int lengte = scanner.nextInt();
		
		if (lengte > 0) {

			for (int i = 1; i <= lengte;) {
				for (int b = 0; b < i;) {
					System.out.print("*");
					b++;
				}
				System.out.println();
				i++;
			}
			
		} else {
			System.out.println("error");
			main(null);
		}
		scanner.close();
	}
	
}
