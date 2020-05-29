import java.util.Scanner;

public class zes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int som = x;
		
		while (x != -1) {
			x = scanner.nextInt();
			som += x;
		}
		System.out.println(som + 1);
		scanner.close();
	}

}
