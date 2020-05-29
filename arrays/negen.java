import java.util.Scanner;

public class negen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] getallen = new int[10];
		
		for (int i = 0; i<getallen.length;) {
			System.out.println("geef getal nummer " + (i+1) + " in");
			getallen[i]=scanner.nextInt();
			i++;
		}
		
		boolean oplopend = true;
		boolean aflopend = true;
		
		for (int i=0; i<getallen.length-1;) {
			if (getallen[i]>getallen[i+1]) {
				oplopend = false;
				//break;
			} else if (getallen[i] < getallen[i+1]) {
				aflopend = false;
				//break;
			}
			i++;
		}
		
		if (oplopend) {
			System.out.println("oplopend");
		} else if (aflopend) {
			System.out.println("aflopend");
		} else {
			System.out.println("geen van beide");
		}
		scanner.close();
	}

}
