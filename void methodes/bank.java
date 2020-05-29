import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class bank {
	
	private static Scanner scanner;
	private static FileWriter fw;
	private static PrintWriter pw;

	public static void maakScanner() throws FileNotFoundException {
		scanner = new Scanner(new File("bank.txt"));
	}
	
	public static void maakWriter() throws IOException {
		fw = new FileWriter(new File("output.txt"));
		pw = new PrintWriter(fw);
	}
	
	public static void printTitel() {
		pw.println("Naam          Beginsaldo          Intrest          Stortingen          Betalingen          Nieuw saldo");
	}
	
	public static void lees() {
		String naam = scanner.nextLine();
		double beginSaldo = scanner.nextInt();
		double stortingen = scanner.nextInt();
		double betalingen = scanner.nextInt();
		scanner.nextLine();
		bereken(beginSaldo, stortingen, betalingen, naam);
	}
	
	public static void bereken(double beginSaldo, double stortingen, double betalingen, String naam) {
		double intrest = beginSaldo / 100 * 1.5;
		double nieuwSaldo = beginSaldo + intrest + stortingen - betalingen;
		print(naam, beginSaldo, stortingen, betalingen, intrest, nieuwSaldo);
	}
	
	public static void print(String naam, double beginSaldo, double stortingen, double betalingen, double intrest, double nieuwSaldo) {
		pw.println(naam + "          " + beginSaldo + "          " + intrest + "          " + stortingen + "          " + betalingen + "          " + nieuwSaldo);
	}
	
	public static void main(String[] args) throws IOException {
		maakScanner();
		maakWriter();
		printTitel();
		
		while (scanner.hasNext()) {
			lees();
		}

		fw.close();
		pw.close();
	}

}
