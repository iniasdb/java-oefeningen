package bank;

import java.util.ArrayList;

public class Account {

	public Account() {
		this.saldo = 0;
		this.storting = 0;
		this.afhaling = 0;
		this.xVerrichtingen = 0;
		this.limiet = 0;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimiet() {
		return limiet;
	}
	
	public void setLimiet(double limiet) {
		this.limiet = limiet;
	}
	
	public void stort(double storting) {
		this.afhaling = 0;
		this.storting = storting;
		this.saldo += storting;
		this.xVerrichtingen++;
		addToList();
	}
	
	public void haalAf(double afhaling) {
		this.storting = 0;
		if (afhaling > this.limiet) {
			System.out.println("over limiet");
		} else {
			if ((this.saldo - afhaling) < 0) {
				System.out.println("saldo ontoereikend");
			} else {
				this.afhaling = afhaling;
				this.saldo -= afhaling;
				this.xVerrichtingen++;
				addToList();
			}
		}
	}
	
	private void addToList() {
		verrichtingen.add("nr verrichting: " + this.xVerrichtingen + " saldo: " + this.saldo + " storting: " + this.storting + " afhaling: " + this.afhaling);
	}
	
	public void printVerrichtingen() {
		for (int i = 0; i < verrichtingen.size(); i++) {
			System.out.println(verrichtingen.get(i));
		}
	}
		
	
	private double saldo;
	private double storting;
	private double afhaling;
	private int xVerrichtingen;
	private double limiet;
	ArrayList<String> verrichtingen = new ArrayList<String>();

}