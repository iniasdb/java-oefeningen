import java.util.Scanner;

public class intrest {

	private static Scanner scanner;
	private static int maand;
	private static double saldo;
	private static double storting;
	private static boolean check = false;
	private static int intrest = 6;
	
	public static Scanner maakScanner() {
		scanner = new Scanner(System.in);
		return scanner;
	}
	
	public static double vraagStorting(Scanner scanner) {
		System.out.println("hoeveel wilt u maandelijks storten?");
		storting = scanner.nextDouble();
		return storting;
	}
	
	public static double nieuwSaldo(double storting) {
		saldo = saldo + storting;
		return saldo;
	}
	
	public static void print(double saldo) {
		maand ++;
		System.out.print("maand " + maand);
		System.out.println("          " + saldo);
	}
	
	public static boolean checkIntrest(int maand) {
		//for (int x = 1; x < 100; x++) {
//			if (maand == 12 || maand == 24 || maand == 36 || maand == 48 || maand == 60 || maand == 72 || maand == 84 || maand == 96) {
//				check = true;
//			} else {
//				check = false;
//			}
		//}
		
	
		for (int i = 1; i < 100; i++) {
			if (maand == 12 * i) {
				check = true;
				break;
			} else {
				check = false;
			}
		}
			
		return check;
	}
	
	public static void main(String[] args) {
		maakScanner();
		vraagStorting(scanner);
		for (int i = 0; i < 16; i++) {
			checkIntrest(maand);
			System.out.println(check);
			if (check) {
				saldo += saldo/100*intrest;
				nieuwSaldo(storting);
				print(saldo);
			} else {
				nieuwSaldo(storting);
				print(saldo);
			}
		}
	}
	
}
