package fruimachine;

import java.util.Scanner;

public class main_fruit {
	
	private static Scanner scanner;
	private static Fruitautomaat fa;

	
	public static Scanner maakScanner() {
		scanner = new Scanner(System.in);
		return scanner;
	}
	
	public static Fruitautomaat maakAutomaat() {
		fa = new Fruitautomaat(10, 10);
		return fa;
	}
	
	public static void menu(Scanner scanner) {
		System.out.println("fruitautomaat den ouwen tomat");
		System.out.println("1) appels kopen");
		System.out.println("2) peren kopen");
		System.out.println("3) appels aanvullen");
		System.out.println("4) peren aanvullen");
		System.out.println("5) stock bekijken");
		System.out.println("6) uitverkocht?");
		
		int x = scanner.nextInt();
		
		switch (x) {
		case 1:
			sellApples(scanner);
			break;
		case 2:
			sellPears(scanner);
			break;
		case 3:
			stockApples(scanner);
			break;
		case 4:
			stockPears(scanner);
			break;
		case 5:
			stock();
			break;
		case 6:
			soldOut();
			break;
		default:
			System.out.println("error");
			menu(scanner);
			break;
		}
	}
	
	public static void sellApples(Scanner scanner) {
		System.out.println("hoeveel wilt u kopen");
		int aantal = scanner.nextInt();
		fa.sellAppels(aantal);
	}
	
	public static void sellPears(Scanner scanner) {
		System.out.println("hoeveel wilt u kopen");
		int aantal = scanner.nextInt();
		fa.sellPeren(aantal);
		main(null);
	}
	
	public static void stockApples(Scanner scanner) {
		System.out.println("hoeveel wilt u restocken");
		int aantal = scanner.nextInt();
		if (fa.getStock() + aantal < 50) {
			fa.addAppels(aantal);
			main(null);
		} else {
			System.out.println("je kan niet meer dan 50 stukken fruit in de machine steken");
			stockApples(scanner);
		}
	}
	
	public static void stockPears(Scanner scanner) {
		System.out.println("hoeveel wilt u restocken");
		int aantal = scanner.nextInt();
		if (fa.getStock() + aantal < 50) {
			fa.addPeren(aantal);
			main(null);
		} else {
			System.out.println("je kan niet meer dan 50 stukken fruit in de machine steken");
			stockPears(scanner);
		}
	}
	
	public static void stock() {
		System.out.println(fa.getStock());
		main(null);
	}
	
	public static void soldOut() {
		fa.checkStock();
		main(null);
	}
	
	public static void main(String[] args) {
		
		
		maakScanner();
		menu(scanner);
		
		
//		System.out.println(fa2.getAppels());
//		System.out.println(fa2.getPeren());
//		System.out.println(fa2.getStock());
//		System.out.println();
//		fa2.addAppels(4);
//		fa2.sellAppels(2);
//		fa2.sellPeren(3);
//		fa2.getStock();
//		
//		System.out.println(fa2.getAppels());
//		System.out.println(fa2.getPeren());
//		System.out.println(fa2.getStock());
//		
//		fa1.sellAppels(1);
		scanner.close();
	}
}
