import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class straftaakmaker1000 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("geef bestandnaam (zonder .txt)");
		String bestand = scanner.next();
		FileWriter fw = new FileWriter(new File(bestand + ".txt"));
		PrintWriter pw = new PrintWriter(fw);
		
		System.out.println("welke zin/woord moet u schrijven");
		scanner.nextLine();
		String zin = scanner.nextLine();
		
		System.out.println("hoeveel keer moet u dit schrijven");
		int x = scanner.nextInt();
		
		for (int i = 0; i < x;) {
			pw.print(zin + ". ");
			i++;
		}
			
		fw.close();
		pw.close();
		scanner.close();
	}

}
