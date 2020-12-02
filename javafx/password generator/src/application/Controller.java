package application;

import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller {
	
	public ChoiceBox length = new ChoiceBox();
	String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@#&$0123456789";
	String pass = "";
	public Label passLabel;
	
	public void initialize() {
		length.getItems().add("8");
		length.getItems().add("12");
		length.getItems().add("16");
		length.setValue("12");
	}
	
	public void buttonClick(ActionEvent event) {
		pass = "";
		String x = length.getValue().toString();
		int chosenLength = Integer.valueOf(x);
		generatePassword(chosenLength);
		passLabel.setText(pass);
	}
	
	public void generatePassword(int chosenLength) {
		for (int i = 0; i < chosenLength; i++) {
			int rand = (int) (Math.random()*chars.length())+1;
			String x = chars.substring(rand-1, rand);
			pass += x;
		}		
	}
}
