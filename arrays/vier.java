import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class vier {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("getal.txt"));
		int[] getal = new int[40];
		int x0 = 0;
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;
		int x5 = 0;
		int x6 = 0;
		int x7 = 0;
		int x8 = 0;
		int x9 = 0;
		
		for (int i = 0; i<40;) {
			getal[i] = scanner.nextInt();
			switch (getal[i]) {
			case 0:
				x0++;
				break;
			case 1:
				x1++;
				break;
			case 2:
				x2++;
				break;
			case 3:
				x3++;
				break;
			case 4:
				x4++;
				break;
			case 5:
				x5++;
				break;
			case 6:
				x6++;
				break;
			case 7:
				x7++;
				break;
			case 8:
				x8++;
				break;
			case 9:
				x9++;
				break;
			}
			
			i++;
		}
		
			System.out.println(x0 + " keer 0");
			System.out.println(x1 + " keer 1");
			System.out.println(x2 + " keer 2");
			System.out.println(x3 + " keer 3");
			System.out.println(x4 + " keer 4");
			System.out.println(x5 + " keer 5");
			System.out.println(x6 + " keer 6");
			System.out.println(x7 + " keer 7");
			System.out.println(x8 + " keer 8");
			System.out.println(x9 + " keer 9");

		
		scanner.close();
	}

}
