import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class twee {
	
	static Scanner scanner;
	static String beroep;
	static int groei = 0;
	static int een = 0;
	static int twee = 0;
	
	public static void main(String[] args) throws FileNotFoundException {
		maakScanner();
		for (int i = 0; i < 4; i++) {
			lees();
			bereken();
			print();
		}

		scanner.close();
	}
	
	public static void maakScanner() throws FileNotFoundException {
		scanner = new Scanner(new File("tabel.txt"));
	}
	
	public static void lees() throws FileNotFoundException {
		scanner.nextLine();
		beroep = scanner.next();
		een = scanner.nextInt();
		twee = scanner.nextInt();
	}
	
	public static void bereken() {
		groei = (int)Math.floor((((double)twee - (double)een)/een)*100);
	}
	
	public static void print() {
		System.out.println(beroep + "     " + een + "     " + twee + "     " + groei + "%");
	}

}
