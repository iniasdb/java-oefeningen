import java.util.Scanner;

public class negen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("geef een getal: ");
		int n = scanner.nextInt();
		int nMinus = n - 1;
		int newN = n - nMinus;
		System.out.println("'s' voor som, p voor product: ");
		char x = scanner.next().toLowerCase().charAt(0);
		
		int som = 0;
		int product = 1;
		
		if (x == 's') {

			for (int i = 0; i < n;) {
				som += newN;
				newN ++;
				i++;
			}
			System.out.println(som);
		} else if (x == 'p') {
			
			for (int i = 0; i < n;) {
				product *= newN;
				newN ++;
				i++;
			}
			System.out.println(product);
		}
		
		scanner.close();
	}

}
