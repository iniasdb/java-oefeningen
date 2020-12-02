package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class Controller {

	public MenuItem open = new MenuItem();
	public MenuItem save = new MenuItem();
	public MenuItem close = new MenuItem();
	public Label lln = new Label();
	public Label vaknaam = new Label();
	public Label punten = new Label();
	public TextField nieuwPunt = new TextField();
	
	public Vak vak;
	public Scanner scanner;
	public PrintWriter pw;
	
	boolean aanTePassen = false;
	
	
	public void correct(ActionEvent event) throws IOException {
		aanTePassen = false;
		if (scanner.hasNext()) {
			read();
			write();
		} else {
			System.out.println("closing");
			pw.close();
		}
	}
	
	public void nietCorrect(ActionEvent event) {
		aanTePassen = true;
	}
	
	public void aanpassen(ActionEvent event) throws IOException {
		if (aanTePassen) {
			read();
			String punt = nieuwPunt.getText();
			this.vak.setPunt(Integer.parseInt(punt));
			pw.println(this.vak.getNaam() + " " + this.vak.getPunt());
		}
	}
	
	public void read() throws IOException {
		String naam = scanner.nextLine();
		String vakNaam = scanner.next();
		vakNaam.substring(vakNaam.length()-1, vakNaam.length());
		int punt = scanner.nextInt();
		
		vak = new Vak(vakNaam, punt);
		System.out.println(vakNaam + " " + punt);
		
		lln.setText(naam);
		vaknaam.setText(vakNaam);
		punten.setText(Integer.toString(punt));
	}
	
	public void createWriter() throws FileNotFoundException {
		pw = new PrintWriter(new File("src/application/punten2.txt"));
	}
	
	public void write() {
		System.out.println("writeing");
		pw.println(this.vak.getNaam() + " " + this.vak.getPunt());
	}
	
	public void initialize() throws IOException {
		System.out.println("ja");
		createScanner();
		createWriter();
		read();
	}
	
	public void createScanner() throws IOException {
		File file = new File("src/application/punten.txt");
		scanner = new Scanner(file);
	}	
}
