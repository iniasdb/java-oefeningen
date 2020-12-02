package application;

import javafx.scene.image.Image;

public class Dobbelsteen {
	public Dobbelsteen() {
		roll();
	}
		
	public int roll() {
		if (!hold) {
			this.eyes = (int) ((Math.random()*6)+1);
			setImage(this.eyes);
			return this.eyes;
		}
		return 0;
	}
	
	public int getAmountOfEyes() {
		return this.eyes;
	}
	
	public void setImage(int i) {
		this.img = new Image("application/dobbelstenen/"+i+".jpg");
	}
	
	public void hold(boolean hold) {
		this.hold = hold;
	}
	
	public Image getImage() {
		return this.img;
	}
	
	
	int eyes;
	Image img;
	boolean hold = false;
}
