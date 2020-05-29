import java.util.Scanner;

public class vier {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String woord = scanner.next();
		int x = 0;
		
		while (x < 1 && woord.indexOf("e") != -1 || woord.indexOf("t") != -1) {
			if (woord.indexOf("t") != -1 && woord.indexOf("e") < woord.indexOf("t")) {
				System.out.println("e komt voor t");
			} else if (woord.indexOf("e") != -1 && woord.indexOf("e") > woord.indexOf("t")) {
				System.out.println("t komt voor e");
			}
		}
		System.out.println("neenee");
		System.out.println(woord.indexOf("e"));
		scanner.close();
	}

}
