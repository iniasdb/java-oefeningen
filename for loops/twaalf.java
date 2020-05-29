import java.util.Scanner;

public class twaalf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wat is uw naam? ");
		String naam = scanner.next();
		System.out.println("Wat is uw leeftijd? ");
		int age = scanner.nextInt();
		System.out.println("Wat is uw jaarlijks salaris? ");
		double salaris = scanner.nextInt();
		int opslag = 3;
		int yLeft = 65 - age;
		double x = 0;
		
		for (int i = 0; i < yLeft;) {
			salaris +=  salaris / 100 * opslag;
			x += salaris;			
			i++;
		}
		System.out.println(naam + " u zal " + Math.round(x) + " verdiend hebben tegen uw pensioen.");
		
		scanner.close();
	}

}
