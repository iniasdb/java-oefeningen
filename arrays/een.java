import java.util.Scanner;

public class een {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double gemiddelde=0;
		int som=0;
		int lln = 18;
		int[] punten = new int[lln];
		int[] laagste = new int[lln];
		int[] hoogste = new int[lln];
		
		for (int i = 0; i < punten.length;) {
			System.out.println("geef punten lln " + (i+1));
			punten[i] = scanner.nextInt();
			i++;
		}
		
		laagste = punten.clone();
		hoogste = punten.clone();
		
		for (int a = 0; a<punten.length;) {
			som += punten[a];
			gemiddelde = (double)som/punten.length;
			a++;
		}
		
		
		for (int b = 0; b < punten.length;) {
			if (laagste[b] < laagste[0]) {
				laagste[0] = laagste[b];
			}
			b++;
		}
		
		for (int c = 0; c < punten.length;) {
			if (hoogste[c] > hoogste[0]) {
				hoogste[0] = hoogste[c];
			}
			c++;
		}
		
		
		System.out.println();
		System.out.println("gemiddelde: " + gemiddelde);
		System.out.println("laagste: " + laagste[0]);
		System.out.println("hoogste: " + hoogste[0]);

		
		scanner.close();

	}

}
