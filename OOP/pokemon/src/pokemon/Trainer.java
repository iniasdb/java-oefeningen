package pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {

	public Trainer(String name, String gender, int badges, int money, ArrayList<Pokemon> pokemons) {
		this.name = name;
		this.gender = gender;
		this.badges = badges;
		this.money = money;
		this.pokemons = pokemons;
	}
	
	public void challenge(Trainer trainer) {
		createScanner();
		int choice = 0;
		int choiceOp = 0;
		boolean loop = true;
		
		//choose pokemon
		int x = getPokemons();

		System.out.println("which pokemon would you like to choose? (index 0-4) ");
		choice = scanner.nextInt();
		
		if (choice > x-1 || choice < 0) {
			System.out.println("not valid");
			System.out.println("which pokemon would you like to choose? (index 0-4) ");
			choice = scanner.nextInt();
		}
		Pokemon p1 = trainer.pokemons.get(choice);
		System.out.println("you chose " + p1.getName());
				
		//opponent choose pokemon
		int xOp = trainer.getPokemons();
		
		System.out.println("which pokemon would you like to choose? (index 0-3) ");
		choiceOp = scanner.nextInt();

		if (choiceOp > x-1 || choiceOp < 0) {
			System.out.println("not valid");
			System.out.println("which pokemon would you like to choose? (index 0-3) ");
			choiceOp = scanner.nextInt();
		}
		Pokemon p2 = trainer.pokemons.get(choiceOp);
		System.out.println("you chose " + p2.getName());
		
		//decide who can start & attack
		if (p1.getSpeed() >= p2.getSpeed()) {
			while(p1.getAv() && p2.getAv()) {
				p1.attack("tackle", p1, p2);
				if (!p2.getAv()) {
					break;
				}
				p2.attack("tackle", p2, p1);
			}
		} else {
			while(p1.getAv() && p2.getAv()) {
				p2.attack("tackle", p2, p1);
				if (!p1.getAv()) {
					break;
				}
				p1.attack("tackle", p1, p2);
			}
		}
		
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setBadges(int badges) {
		this.badges = badges;
	}
	
	public int getBadges() {
		return this.badges;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setPokemons(ArrayList<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}
	
	public int getPokemons() {
		System.out.println("your pokemon: ");
		for (Pokemon pokemon : this.pokemons) {
			String av;
			if (pokemon.getAv()) {
				av = "available";
			} else {
				av = "not available";
			}
			System.out.println(pokemon.getName()  + " " + av);
		}
		return this.pokemons.size();
	}
	
	public static void createScanner() {
		scanner = new Scanner(System.in);
	}
	
	private String name;
	private String gender;
	private int badges;
	private int money;
	private ArrayList<Pokemon> pokemons;
	private static Scanner scanner;
}
