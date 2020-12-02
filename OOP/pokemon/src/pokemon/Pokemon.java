package pokemon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pokemon {
		
	public Pokemon(String name, int nr, String type, String gender, int hp, int ap, int dp, int speed/*, ArrayList<String> attacks*/, boolean av) {
		this.name = name;
		this.nr = nr;
		this.type = type;
		this.gender = gender;
		this.hp = hp;
		this.ap = ap;
		this.dp = dp;
		this.speed = speed;
		this.attacks = attacks;
		this.av = av;
	}
	
	public Pokemon(File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		this.name = scanner.nextLine();
		this.nr = scanner.nextInt();
		this.type = scanner.nextLine();
		this.gender = scanner.nextLine();
		this.hp = scanner.nextInt();
		this.ap = scanner.nextInt();
		this.dp = scanner.nextInt();
		this.speed = scanner.nextInt();
	}
	
	public void attack(String attack, Pokemon attacker, Pokemon defender) {
		Attack attack1 = new Attack("tackle", 4, 80);
		
		if ((Math.random() *100) < attack1.getPrecision()) {
			int damage = attack1.getPower() * attacker.ap - defender.dp;
			defender.setHp(defender.getHp()-damage);
			if (defender.hp <= 0) {
				System.out.println("pokemon " + defender.getName() + " defeated");
				defender.setAv(false);
			} else {
				//defender.setHp(defender.getHp()-damage);
				System.out.println("you dealt " + damage + " damage");
				System.out.println("opponent " + defender.getName() + " has " + defender.getHp() + " hp");
			}
		} else {
			System.out.println("you missed the attack!");
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNr(int nr) {
		this.nr = nr;
	}
	
	public int getNr() {
		return this.nr;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setAp(int ap) {
		this.ap = ap;
	}
	
	public int getAp() {
		return this.ap;
	}
	
	public void setDp(int dp) {
		this.dp = dp;
	}
	
	public int getDp() {
		return this.dp;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setAttack(ArrayList<String> attacks) {
		this.attacks = attacks;
	}
	
	public ArrayList<String> getAttack() {
		return this.attacks;
	}
	
	public void setAv(boolean av) {
		this.av = av;
	}
	
	public boolean getAv() {
		return this.av;
	}

	
	private String name;
	private int nr;
	private String type;
	private String gender;
	private int hp;
	private int ap;
	private int dp;
	private int speed;
	private ArrayList<String> attacks;
	private boolean av;
}
