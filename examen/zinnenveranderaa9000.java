package examen;

import java.util.Scanner;

public class zinnenveranderaa9000 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("typ een zin");
		String zin = scanner.nextLine();
		System.out.println("typ het woord dat u wilt vervangen");
		String woord = scanner.next();
		System.out.println("typ het woord dat in de plaats moet komen");
		String vervanger = scanner.next();
		
		String nieuw = zin.replaceFirst(woord, vervanger);
		
		System.out.println(nieuw);
		
		scanner.close();
	}

}
