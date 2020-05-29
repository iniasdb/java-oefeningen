import java.util.Scanner;

public class TWEE {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double gemiddelde=0;
		int som=0;
		int lln = 18;
		String[] namen = new String[lln];
		String[] namenH = new String[lln];
		int[] punten = new int[lln];
		int[] laagste = new int[lln];
		int[] hoogste = new int[lln];
		
		for (int i = 0; i < punten.length;) {
			System.out.println("naam lln " + (i+1));
			namen[i] = scanner.next();
			System.out.println("geef punten lln " + (i+1));
			punten[i] = scanner.nextInt();
			i++;
		}
		
		laagste = punten.clone();
		hoogste = punten.clone();
		namenH = namen.clone();
		
		for (int a = 0; a<punten.length;) {
			som += punten[a];
			gemiddelde = (double)som/punten.length;
			a++;
		}
		
		
		for (int b = 0; b < punten.length;) {
			if (laagste[b] < laagste[0]) {
				laagste[0] = laagste[b];
				namen[0] = namen[b];
			}
			b++;
		}
		
		for (int c = 0; c < punten.length;) {
			if (hoogste[c] > hoogste[0]) {
				hoogste[0] = hoogste[c];
				namenH[0] = namenH[c];
			}
			c++;
		}
		
		
		
		/*
		 
		 for(){
		 gemiddelde+= punten[i]
		 if putnen[i]<laagste {
		 laagste=punten[i]
		 naamLaagste = namen[i]
		 }if putner[i]>hoogste {
		 hoogste=punten[i]
		 naamHoogtste=namen[i]
		 }
		 }
		 
		 
		 */
		
		
		System.out.println();
		System.out.println("gemiddelde: " + gemiddelde);
		System.out.println("slechtst scorende lln: " + namen[0]);
		System.out.println("laagste: " + laagste[0]);
		System.out.println("hoogst scorende lln: " + namenH[0]);
		System.out.println("hoogste: " + hoogste[0]);

		
		scanner.close();

	}
}