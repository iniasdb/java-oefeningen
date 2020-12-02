package application;

import java.util.ArrayList;

import javafx.scene.image.Image;

public class Doos {

	public Doos() {
		
	}
	
	public void addDobbelsteen(Dobbelsteen db) {
		dobbelstenen.add(db);
	}
	
	public void schud() {
		for (int i = 0; i < dobbelstenen.size(); i++) {
			dobbelstenen.get(i).roll();
		}
	}
	
	public int getDBValue(int i) {
		return dobbelstenen.get(i).getAmountOfEyes();
	}
	
	public Image getImage(int i) {
		return dobbelstenen.get(i).getImage();
	}
	
	public ArrayList<Dobbelsteen> getDBList() {
		return this.dobbelstenen;
	}
	
	private ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>();
	
}
