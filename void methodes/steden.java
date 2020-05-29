import java.util.Scanner;

public class steden {

	private static Scanner scanner;
	private static boolean full;
	
	public static void maakScanner() {
		scanner = new Scanner(System.in);
	}
	
	public static void maakArray() {
		String[] steden = new String[10];
		int x = 0; //zorgt dat array niet out of bounds gaat
		vraagStad(steden, x);
	}
	
	public static void vraagStad(String[] steden, int x) {
		
		/*if (x == 10) {
			ordenArray(steden); //wanneer volledige array gecheckt is doorgestuurt naar ordenen
			full = true;
		} else {*/
			System.out.println("geef de naam van een stad");
			String stad = scanner.nextLine();
			
			if (stad.equals("")) {
				vraagStad(steden, x); //checkt of input niet leeg is
			} else {
				checkArray(steden, x, stad);
			}
		//}
	}
	
	public static void checkArray(String[] steden, int x, String stad) {		
		if (x == 10) {
			ordenArray(steden); //wanneer volledige array gecheckt is doorgestuurt naar ordenen
			full = true;
		} else {
			for (int i = 0; i < steden.length; i++) {
				
				/*try {
					if (steden[i].equalsIgnoreCase("")) {
						steden[x] = stad;
						x++;
						vraagStad(steden, x);
					} else if (steden[i].equalsIgnoreCase(stad)) {
						System.out.println("stond al in array");
						vraagStad(steden, x);
					}
				} catch (NullPointerException e) {
					steden[x] = stad;
					x++;
					vraagStad(steden, x);
				}*/
				
				try {
					if (steden[i].equalsIgnoreCase(stad)) {
						System.out.println("stond al in array");
						vraagStad(steden, x);
					}
				} catch (NullPointerException e) {
					steden[x] = stad;
					x++;
					vraagStad(steden, x);
				}
			}
			
			if (!full) { //zolang array niet vol is terug naar vraag methode gestuurd
				steden[x] = stad;
				x++;
				vraagStad(steden, x);
			}	

		}

	}
	
	public static void ordenArray(String[] steden) {
		
		for (int i = 0; i < steden.length; i++) {
            for (int j = i + 1; j < steden.length; j++) { 
                if (steden[i].compareTo(steden[j]) > 0) {
                    String temp = steden[i];
                    steden[i] = steden[j];
                    steden[j] = temp;
                }
            }
		}
		printArray(steden);
	}
		
	
	public static void printArray(String[] steden) {
		for (int y = 0; y < steden.length; y++) {
			System.out.println(steden[y]);
		}
		
	}
	
	public static void main(String[] args) {
		maakScanner();
		maakArray();
		scanner.close();
	}

}
