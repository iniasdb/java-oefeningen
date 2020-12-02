package application;

import java.io.File;
import java.util.List;

public class Leerling {
	
	public Leerling(String naam) {
		this.naam = naam;
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public int getGem() {
		return this.gem;
	}
	
	public void setGem(int gem) {
		this.gem = gem;
	}
	
	public File getPunten() {
		return this.punten;
	}
	
	public void setPunten(File punten) {
		this.punten = punten;
	}
	
	public void addPunt(int punt) {
		puntenArray.add(punt);
	}
	
	public void calcGem() {
		int total = 0;
		for (int i = 0; i < puntenArray.size(); i ++) {
			total += puntenArray.indexOf(i);
		}
		this.gem = total/puntenArray.size();
	}
	
	
	public String naam;
	public int gem;
	public File punten;
	public List<Integer> puntenArray;

}
