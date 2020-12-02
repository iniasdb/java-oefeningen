package application;

public class Leerling {
	public Leerling(String naam, int gemiddelde) {
		this.naam = naam;
		this.gemiddelde = gemiddelde;
	}
	
	public String getNaam() {
		return this.naam;
	}
	
	public int getGemiddelde() {
		return this.gemiddelde;
	}
	
	public String naam;
	public int gemiddelde;
}
