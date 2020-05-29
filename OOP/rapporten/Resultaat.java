package rapporten;

public class Resultaat {
	public Resultaat(double behaald) {
		this.behaald = behaald;
	}
	
	public double getBehaald() {
		return behaald;
	}
	
	public void setBehaald(double behaald) {
		this.behaald = behaald;
	}
	
	public void getGraad() {
		if (behaald < 50) {
			System.out.println("niet geslaagd");
		} else if (50 <= behaald && behaald < 68) {
			System.out.println("voldoende");
		} else if (68 <= behaald && behaald < 75) {
			System.out.println("onderscheiding");
		} else if (75 <= behaald && behaald < 85) {
			System.out.println("grote onderscheiding");
		} else if (85 <= behaald) {
			System.out.println("grootste onderscheiding");
		} else {
			System.out.println("error");
		}
	}
	
	private double behaald;
}
