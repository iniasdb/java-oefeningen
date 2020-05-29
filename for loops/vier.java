import java.util.Scanner;

public class vier {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("geef een getal. ");
		int x = scanner.nextInt();
		int b = x;
		
		/*for (int i = 0; i < (x-1);) {
			b *= (x-(i+1));
			i++;
		}*/
		
		//dit is korter a sahbe
		
		for (int i = 1; i <= (x-1);) {
			b *= (x-(i));
			i++;
		}
		
		System.out.println("de faculteit van " + x + " is " + b);
		
		scanner.close();
	}

}
