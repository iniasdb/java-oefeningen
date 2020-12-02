package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	public TextField punten = new TextField();
	public TextField vak = new TextField();
	public TextField naam = new TextField();
	public Label gemiddelde = new Label();
	public Button toevoegen = new Button();
	public Button gem = new Button();
	
	public static FileWriter fw;
	public static PrintWriter pw;
	
	public static Leerling lln;
	
	static String temp = "";
	int i = 0;
	
	public void addMarks(ActionEvent event) {
		String naamLln = naam.getText();
		
		lln = new Leerling(naamLln);
		
		int ptn = Integer.valueOf(punten.getText());
		String vakNaam = vak.getText();
		naam.clear();
		punten.clear();
		vak.clear();
				
		if (i == 0) {
			temp += naamLln + "\r\n";
			i++;
		}
		
		temp += vakNaam + ": " + ptn + "\r\n";
	}
	
	public void calcGem(ActionEvent event) {
		lln.calcGem();
		gemiddelde.setText(Integer.toString(lln.getGem()));
	}
	
	public static void writeToFile() throws IOException {
		temp += lln.getGem();
		File file = new File(lln.getNaam() + ".txt");
		fw = new FileWriter(file);
		pw = new PrintWriter(fw);
		
		pw.println(temp);
		fw.close();
		pw.close();
	}
	
}
