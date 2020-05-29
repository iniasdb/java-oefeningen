import java.util.Scanner;

public class acht {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("");
		String woord = scanner.next();
		
		int x = woord.length();
		int d = 0;
		
		for (int i = 0; i < x;) {
			char a = woord.charAt(i);
			if (a == 's' || a == 'z') {
				d++;
			}
			i++;
		}
		System.out.println(d);
		
		scanner.close();
	}

}
