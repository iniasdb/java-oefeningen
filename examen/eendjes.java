package examen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class eendjes {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("eendjes.txt"));
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter(new File("uivoer_eendjes.txt"));
		PrintWriter pw = new PrintWriter(fw);
		
		int rep = scanner.nextInt();
		int eendjes = scanner.nextInt();
		int[] waarden = new int[21];
		int[] waardenN = new int [21];
		int c = 0;
		int r = 0;
		int m = 10;
		int x = 0;
		int eend1 = 0;
		int eend2 = 0;
		int eend3 = 0;
		int eend4 = 0;
		int hoogste = 0;
		int hoogste2 = 0;
		int bestStart = 0;
		int bestStart2 = 0;
		int totaal = 0;
		int totaal2 = 0;
		int curRep = 1;
			
		//array inlezen
		for (int i = 0; i < waarden.length; i++) {
			waarden[i] = scanner.nextInt();
		}
		
		// nieuwe array laatste 10 waarden
		for (int y = 0; y < 10; y++) {
			waardenN[y] = waarden[m];
			m++;
		}
		
		for (int a = 0; a < rep; a++) {
			System.out.println("selecteer 4 opeenvolgende eendjes om de hoogst mogelijke score te behalen");
			
			// aantal eendjes printen
			for (int j = 0; j < eendjes && c < 20; j++) {
				System.out.print(waarden[c] + " ");
				c++;
			}
			
			// input vragen
			System.out.println();
			eend1 = input.nextInt();
			eend2 = input.nextInt();
			eend3 = input.nextInt();
			eend4 = input.nextInt();
			
			// beste startpositie en controle
			if (curRep == 1) {
				
				for (int g = 0; g < 10; g++) {
					r = g;
					for (int f = 0; f < 4; f++) {
						totaal += waarden[r];
						r++;
					}
					
					//System.out.println(totaal);
					
					if (totaal > hoogste) {
						hoogste = totaal;
						x++;
					}
					totaal = 0;
				}
				
				int som = eend1 + eend2 + eend3 + eend4;
				
				if (som == hoogste) {
					System.out.println("juist");
				} else {
					System.out.println("fout");
				}
				
				bestStart = 10 - (x+1);
				pw.println(curRep + " " + bestStart);
				//System.out.println("best start is " + bestStart);
				curRep ++;
				
			} else if (curRep == 2) {
				//System.out.println("hallo");
				for (int z = 0; z < 10; z++) {
					m = z;
					for (int q = 0; q < 4; q++) {
						totaal2 += waardenN[m];
						m++;
					}
					
					//System.out.print(totaal2 + " ");
					
					if (totaal2 > hoogste2) {
						hoogste2 = totaal2;
					}
					totaal2 = 0;
				}
				
				int som2 = eend1 + eend2 + eend3 + eend4;
				
				if (som2 == hoogste2) {
					System.out.println("juist");
				} else {
					System.out.println("fout");
				}
				
				bestStart2 = 10 - (x+1);
				pw.println(curRep + " " + bestStart2);
				
			}
			

			
		}
		
		scanner.close();
		input.close();
		fw.close();
		pw.close();
	}

}
