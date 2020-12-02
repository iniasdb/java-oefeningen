package application;

public class Vak {

	public Vak(String naam, int punt) {
		this.naam = naam;
		this.punt = punt;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public void setPunt(int punt) {
		this.punt = punt;
	}
	
	public int getPunt() {
		return this.punt;
	}
	
	public String naam;
	public int punt;
	
}
