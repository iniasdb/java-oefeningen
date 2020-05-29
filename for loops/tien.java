import java.util.Scanner;

public class tien {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int getal = scanner.nextInt();
		int a = 0;
		int b;
		for (int i = 2; i <= getal;) {
			b = a%i;
			if(b!=0) {
				System.out.println("geen priemgetal");
				System.out.println(b);
			}
			i++;
			a++;
		}

		System.out.println("priemgetal");
		
		scanner.close();
	}

}
