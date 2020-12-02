package application;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	public Label klasnaam;
	public Label leerlingnaam;
	public Label leerlinggemiddelde;
	public TextField naamlln;
	public TextField gemlln;
	int index = 0;
	Klas klas = new Klas("6 inf");
	
	public void initialize() {
		klasnaam.setText(klas.getClassNaam());
		Leerling jos = new Leerling("jos", 7);
		Leerling bert = new Leerling("bert", 8);
		Leerling jan = new Leerling("jan", 10);
		Leerling noah = new Leerling("noah", 3);
		klas.addLeerling(jos);
		klas.addLeerling(bert);
		klas.addLeerling(jan);
		klas.addLeerling(noah);
	}
	
	public void vorige() {
		 if (index > 0) {
			 index--;
			 leerlingnaam.setText("");
			 leerlinggemiddelde.setText("");
		 }
	}
	
	public void volgende() {
		if (index < klas.leerlingen.size()-1){
			index++;
			leerlingnaam.setText("");
			leerlinggemiddelde.setText("");
		}
	}
	
	public void toon() {
		String naam = klas.getLeerling(index).getNaam();
		int gem = klas.getLeerling(index).getGemiddelde();
		
		leerlingnaam.setText(naam);
		leerlinggemiddelde.setText(Integer.toString(gem));
	}
	
	public void addLeerling() {
		//Leerling abc = ;
		klas.addLeerling(new Leerling(naamlln.getText(), Integer.parseInt(gemlln.getText())));
		naamlln.setText("");
		gemlln.setText("");
	}
}
