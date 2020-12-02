package pokemon;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		printTitleScreen();
		
		Pokemon p1 = new Pokemon("bob", 1, "grass", "man", 30, 6, 4, 4, true);
		Pokemon p2 = new Pokemon("jef", 2, "fire", "man", 30, 6, 4, 3, true);
		ArrayList<Pokemon> poke = new ArrayList<Pokemon>();
		poke.add(p1);
		poke.add(p2);
		
		Trainer t1 = new Trainer("bob", "male", 0, 1000, poke);
		Trainer t2 = new Trainer("jef", "male", 0, 1000, poke);
		t1.challenge(t2);
		
		//p1.attack("tackle", p1, p2);
		
	}
	
	public static void printTitleScreen() {
		System.out.println("                                  ,'\\");
		System.out.println("    _.----.        ____         ,'  _\\   ___    ___     ____");
		System.out.println("_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.");
		System.out.println("\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |");
		System.out.println(" \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |");
		System.out.println("   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |");
		System.out.println("    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |");
		System.out.println("     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |");
		System.out.println("      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |");
		System.out.println("       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |");
		System.out.println("        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |");
		System.out.println("                                `'                            '-._|");
	}

}
