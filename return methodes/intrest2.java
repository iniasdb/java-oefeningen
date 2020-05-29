import java.util.Scanner;

public class intrest2 {

	private static int intrest = 6;
	private static Scanner scanner;
	private static double storting;
	private static double saldoOud;
	private static double saldoNieuw;
	
	public static void maakScanner() {
		scanner = new Scanner(System.in);
	}
	
	public static double leesGegevens(Scanner scanner) {
		System.out.println("hoeveel wilt u maandelijks storten");
		storting = scanner.nextDouble();
		return storting;
	}
	
	public static double addToSaldo(double storting, double saldoOud) {
		saldoOud += storting;
		return saldoOud;
	}
	
	private static double bereken(double storting, double saldoOud) {
		saldoNieuw = (1.005 * saldoOud) + storting;
		saldoOud = saldoNieuw;
		return saldoNieuw;
	}
	
	public static void main(String[] args) {
		maakScanner();
		leesGegevens(scanner);
		addToSaldo(storting, saldoOud);
		System.out.println(saldoOud);
		bereken(storting, saldoOud);
		
		scanner.close();
	}

}
