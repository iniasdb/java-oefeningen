package examen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class array {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("getallen.txt"));
		FileWriter fw = new FileWriter(new File("array.txt"));
		PrintWriter pw = new PrintWriter(fw);
		
		int[] a1 = new int[10];
		int[] a2 = new int[10];
		int[] gem = new int[10];
		int som = 0;
		
		//array 1 inlezen
		for (int i = 0; i < a1.length; i++) {
			a1[i] = scanner.nextInt();
		}
		
		for (int a = 0; a < a1.length; a++) {
			a2[a] = a1[9-a];
		}
		
		for (int b = 0; b < a1.length; b++) {
			som = a1[b] + a2[b];
			gem[b] = som/2;
		}
		
		// printen naar array.txt
		pw.println("oorspronkelijke volgorde          omgekeerde volgorde          gemiddelde");
		
		for (int j = 0; j < a1.length; j++) {
			pw.println(a1[j] + "									" + a2[j] + "							" + gem[j]);
		}
		
		
		scanner.close();
		fw.close();
		pw.close();
	}

}
