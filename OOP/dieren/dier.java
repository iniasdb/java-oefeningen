package dieren;

public class dier {
	
	public dier() {
		this.naam = "jos";
		this.soort = "adelaar";
		this.gewicht = 30;
		this.poten = 2;
		this.vliegen = true;
	}
	
	public dier(String soort) {
		this.soort = soort;
		this.poten = 4;
		this.vliegen = false;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public String getSoort() {
		return soort;
	}
	
	public void setSoort(String soort) {
		this.soort = soort;
	}
	
	public double getGewicht() {
		return gewicht;
	}
	
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
	public int getPoten() {
		return poten;
	}
	
	public void setPoten(int poten) {
		this.poten = poten;
	}
	
	public boolean getVliegen() {
		return vliegen;
	}
	
	public void setVliegen(boolean vliegen) {
		this.vliegen = vliegen;
	}
	
	private String naam;
	private String soort;
	private double gewicht;
	private int poten;
	private boolean vliegen;
}
