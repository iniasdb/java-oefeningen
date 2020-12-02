package application;

public class Dobbelsteen {
	public Dobbelsteen() {
	}
		
	public int setAmountOfEyes() {
		this.eyes = (int) ((Math.random()*6)+1);
		return this.eyes;
	}
	
	public int getAmountOfEyes() {
		return this.eyes;
	}
	
	public void setImage(int i) {
		this.link = "application/dobbelstenen/"+i+".jpg";
	}
	
	
	
	public String getImage() {
		return this.link;
	}
	
	
	String link;
	int eyes;
}
